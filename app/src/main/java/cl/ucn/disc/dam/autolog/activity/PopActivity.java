package cl.ucn.disc.dam.autolog.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.model.Vehiculo;

/**
 * Created by PriscilaGonzalez on 18-12-2017.
 */
public class PopActivity extends AppCompatActivity {
    TextView pop_nombre;
    TextView pop_rut;
    TextView pop_correo;
    TextView pop_patente;
    TextView pop_marca;
    TextView pop_color;
    TextView pop_modelo;
    TextView pop_anio;
    TextView pop_descripcion;
    TextView pop_fono;
    TextView pop_anexo;
    TextView pop_localizacion;
    TextView pop_tipo;
    TextView pop_cargo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        pop_anexo = (TextView) findViewById(R.id.pop_anexo);
        pop_anio = (TextView) findViewById(R.id.pop_anio);
        pop_cargo = (TextView) findViewById(R.id.pop_cargo);
        pop_color = (TextView) findViewById(R.id.pop_color);
        pop_nombre = (TextView) findViewById(R.id.pop_nombre);
        pop_rut = (TextView) findViewById(R.id.pop_rut);
        pop_correo = (TextView)findViewById(R.id.pop_correo);
        pop_patente = (TextView) findViewById(R.id.pop_patente);
        pop_marca = (TextView) findViewById(R.id.pop_marca);
        pop_modelo = (TextView) findViewById(R.id.pop_modelo);
        pop_descripcion = (TextView) findViewById(R.id.pop_descripcion);
        pop_fono = (TextView) findViewById(R.id.pop_fono);
        pop_localizacion = (TextView) findViewById(R.id.pop_localizacion);
        pop_tipo = (TextView) findViewById(R.id.pop_tipo);

        Vehiculo vehiculo = (Vehiculo) getIntent().getExtras().getSerializable("auto");

        pop_anexo.setText(""+vehiculo.getResponsable().getAnexo());
        pop_anio.setText(""+vehiculo.getAnio());
        pop_cargo.setText(""+vehiculo.getResponsable().getCargo());
        pop_color.setText(""+vehiculo.getColor());
        pop_nombre.setText(""+vehiculo.getResponsable().getNombre());
        pop_rut.setText(""+vehiculo.getResponsable().getRut());
        pop_correo.setText(""+vehiculo.getResponsable().getCorreo());
        pop_patente.setText(""+vehiculo.getPatente());
        pop_marca.setText(""+vehiculo.getMarca());
        pop_modelo.setText(""+vehiculo.getModelo());
        pop_descripcion.setText(""+vehiculo.getDescripcion());
        pop_fono.setText(""+vehiculo.getResponsable().getTelefono());
        pop_localizacion.setText(""+vehiculo.getResponsable().getUnidad());
        pop_tipo.setText(""+vehiculo.getResponsable().getTipo());



    }
}
