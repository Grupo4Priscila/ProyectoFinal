package cl.ucn.disc.dam.autolog.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.activity.PopActivity;
import cl.ucn.disc.dam.autolog.adapters.Adaptador;
import cl.ucn.disc.dam.autolog.model.Persona;
import cl.ucn.disc.dam.autolog.model.Registro;
import cl.ucn.disc.dam.autolog.model.Vehiculo;

public class ActivityListPatente extends AppCompatActivity {

    ListView listaVehiculos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_patente);

        listaVehiculos = (ListView) findViewById(R.id.listpatente);

        Persona p1 = new Persona();
        Vehiculo v2 = new Vehiculo();

        p1.setRut("18312277-0");
        p1.setNombre("Priscila Gonzalez");
        p1.setCorreo("pga020@alumnos.ucn.cl");
        p1.setTelefono(74690535);
        p1.setAnexo(055);
        p1.setUnidad("c");
        p1.setOficina("Oficina bonita");
        p1.setCargo("director");
        p1.setTipo("");

        v2.setResponsable(p1);
        v2.setPatente("bbbb00");
        v2.setMarca("toyota");
        v2.setColor("azul");
        v2.setModelo("camioneta");
        v2.setAnio(2017);
        v2.setDescripcion("esta chocado");

        Vehiculo v1 = new Vehiculo();// new Vehiculo(p1,"bbbb00", "toyota", "azul", "caminon", 2017, "esta chocado");
        v1.setResponsable(p1);
        v1.setPatente("BB-BB-00");
        v1.setMarca("Suzuki");
        v1.setColor("Jimny");
        v1.setModelo("Jeep");
        v1.setAnio(2017);
        v1.setDescripcion("esta nuevo");

        //GUARDA EN LA BD la persona y el auto creado
        v1.save();
        p1.save();
        v2.save();

        List<Vehiculo> lista = SQLite.select().from(Vehiculo.class).queryList();

        Adaptador adaptador = new Adaptador(getApplicationContext(),lista);
        listaVehiculos.setAdapter(adaptador);


        listaVehiculos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Vehiculo vehiculo_popup = (Vehiculo) parent.getItemAtPosition(position);

                Intent Siguiente = new Intent(getApplicationContext(),PopActivity.class);
                Siguiente.putExtra("auto", vehiculo_popup);
                startActivity(Siguiente);
            }
        });

    }
}
