package cl.ucn.disc.dam.autolog;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dam.autolog.adapters.Adaptador;
import cl.ucn.disc.dam.autolog.model.Persona;
import cl.ucn.disc.dam.autolog.model.Vehiculo;

public class MainActivity extends AppCompatActivity {
//TODO: termianr el showpopup
//    TODO: arreglar popup_datos.xml poner el showPopup_datos en marca (solo prueba)
// https://stackoverflow.com/questions/38987442/how-to-make-a-simple-android-popup-window
// el final de la pag

    ListView listaVehiculos;
    ArrayList<Vehiculo> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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



        Adaptador adaptador = new Adaptador(getApplicationContext(),lista);

        listaVehiculos.setAdapter(adaptador);

    }




    public void ShowPopup_datos(View view) {

   /*     // get a reference to the already created main layout
       // LinearLayout mainLayout = (LinearLayout) findViewById(R.id.patente);

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_datos, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        popupWindow.showAtLocation(mainLayout, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
*/
    }



}
