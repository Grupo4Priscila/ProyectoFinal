package cl.ucn.disc.dam.autolog.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import cl.ucn.disc.dam.autolog.R;

public class MainActivity extends AppCompatActivity {

    Button registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrar = (Button) findViewById(R.id.registrarvehiculo);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(MainActivity.this, ActivityListPatente.class);
                startActivity(registrar);
            }
        });


    }
}

