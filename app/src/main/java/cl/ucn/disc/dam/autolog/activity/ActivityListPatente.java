package cl.ucn.disc.dam.autolog.activity;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import android.app.SearchManager;
import android.widget.SearchView.OnQueryTextListener;

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

public class ActivityListPatente extends AppCompatActivity implements SearchView.OnQueryTextListener {


    ListView listaVehiculos;
    Adaptador adaptador;
    ArrayList<Vehiculo> lista;


    private String keyword;

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

        lista = new ArrayList(SQLite.select().from(Vehiculo.class).queryList());

        adaptador = new Adaptador(getApplicationContext(),lista);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listpatente, menu);

        MenuItem search_item = menu.findItem(R.id.app_bar_search);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(search_item);
        searchView.setFocusable(false);
        searchView.setQueryHint("Search");

        searchView.setOnQueryTextListener(this);

        MenuItemCompat.setOnActionExpandListener(search_item, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                adaptador.setFilter(lista);
                return true;
            }
        });

        return true;
    }


    /**
     * Called when the user submits the query. This could be due to a key press on the
     * keyboard or due to pressing a submit button.
     * The listener can override the standard behavior by returning true
     * to indicate that it has handled the submit request. Otherwise return false to
     * let the SearchView handle the submission by launching any associated intent.
     *
     * @param query the query text that is to be submitted
     * @return true if the query has been handled by the listener, false to let the
     * SearchView perform the default action.
     */
    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    /**
     * Called when the query text is changed by the user.
     *
     * @param newText the new content of the query text field.
     * @return false if the SearchView should perform the default action of showing any
     * suggestions if available, true if the action was handled by the listener.
     */
    @Override
    public boolean onQueryTextChange(String newText) {

        try{
            ArrayList<Vehiculo> listaFiltrada = filter(lista, newText );
            adaptador.setFilter(listaFiltrada);

        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<Vehiculo> filter(ArrayList<Vehiculo> vehiculos, String texto){
        ArrayList<Vehiculo> listaFiltrada = new ArrayList<>();

        try{
            texto.toLowerCase();
            for(Vehiculo vehiculo: vehiculos){
                String vehiculo2 = vehiculo.getPatente().toLowerCase();

                if(vehiculo2.contains(texto)){
                    listaFiltrada.add(vehiculo);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return listaFiltrada;
    }
}
