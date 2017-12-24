package cl.ucn.disc.dam.autolog.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.adapters.Adaptador;
import cl.ucn.disc.dam.autolog.adapters.AdaptadorRegistro;
import cl.ucn.disc.dam.autolog.model.Registro;
import cl.ucn.disc.dam.autolog.model.Vehiculo;

public class RegistroActivity extends AppCompatActivity {

    ListView listaRegistros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        List<Registro> lista = SQLite.select().from(Registro.class).queryList();
        if (lista.size()!=0) {

            listaRegistros = (ListView) findViewById(R.id.listRegistro);
            AdaptadorRegistro adaptador = new AdaptadorRegistro(getApplicationContext(), lista);
            listaRegistros.setAdapter(adaptador);
        }else{
            Toast.makeText(getApplication(),"No hay registros aun", Toast.LENGTH_LONG).show();
        }


    }
}
