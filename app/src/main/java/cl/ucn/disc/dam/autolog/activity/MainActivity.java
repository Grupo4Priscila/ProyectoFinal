package cl.ucn.disc.dam.autolog.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
<<<<<<< HEAD:app/src/main/java/cl/ucn/disc/dam/autolog/activity/MainActivity.java
import android.widget.AdapterView;
=======
import android.widget.Button;
>>>>>>> 0dd1ebfdf845e0df3660ded370626b157e4b9651:app/src/main/java/cl/ucn/disc/dam/autolog/MainActivity.java
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.adapters.Adaptador;
import cl.ucn.disc.dam.autolog.model.Persona;
import cl.ucn.disc.dam.autolog.model.Vehiculo;

public class MainActivity extends AppCompatActivity {

    Button registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD:app/src/main/java/cl/ucn/disc/dam/autolog/activity/MainActivity.java
        listaVehiculos = (ListView) findViewById(R.id.listapatente);
        lista = new ArrayList<Vehiculo>();


        Persona p1 = new Persona();//("18312277-0","Priscila Gonzalez","pga020@alumnos.ucn.cl",74690535, 052,"c","off","y005","director",null  );

        Vehiculo v2 = new Vehiculo();// new Vehiculo(p1,"bbbb00", "toyota", "azul", "caminon", 2017, "esta chocado");
        v2.setResponsable(p1);
        v2.setPatente("bbbb00");
        v2.setMarca("toyota");
        v2.setColor("azul");
        v2.setModelo("camioneta");
        v2.setAnio(2017);
        v2.setDescripcion("esta chocado");

        p1.setRut("18312277-0");
        p1.setNombre("Priscila Gonzalez");
        p1.setCorreo("pga020@alumnos.ucn.cl");
        p1.setTelefono(74690535);
        p1.setAnexo(055);
        p1.setUnidad("c");
        p1.setOficina("Oficina bonita");
        p1.setCargo("director");
        p1.setTipo("");
        List<Vehiculo> lvp= new ArrayList<Vehiculo>();
        lvp.add(v2);
        p1.setVehiculos(lvp);

        Vehiculo v1 = new Vehiculo();// new Vehiculo(p1,"bbbb00", "toyota", "azul", "caminon", 2017, "esta chocado");
        v1.setResponsable(p1);
        v1.setPatente("BB-BB-00");
        v1.setMarca("toyota");
        v1.setColor("azul");
        v1.setModelo("camioneta");
        v1.setAnio(2017);
        v1.setDescripcion("esta chocado");


        lista.add(v1);
        lista.add(v1);
        lista.add(v1);
        lista.add(v1);
        lista.add(v1);
        lista.add(v1);
        lista.add(v1);


=======
        registrar = (Button) findViewById(R.id.registrarvehiculo);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(MainActivity.this, ActivityListPatente.class);
                startActivity(registrar);
            }
        });
>>>>>>> 0dd1ebfdf845e0df3660ded370626b157e4b9651:app/src/main/java/cl/ucn/disc/dam/autolog/MainActivity.java



<<<<<<< HEAD:app/src/main/java/cl/ucn/disc/dam/autolog/activity/MainActivity.java
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
=======
    }



    }




>>>>>>> 0dd1ebfdf845e0df3660ded370626b157e4b9651:app/src/main/java/cl/ucn/disc/dam/autolog/MainActivity.java
