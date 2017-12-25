package cl.ucn.disc.dam.autolog.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.model.Vehiculo;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by RaosF on 16-12-2017.
 */

@Slf4j
public class Adaptador extends ArrayAdapter<Vehiculo> {

    Context context;
    List<Vehiculo> vehiculos = new ArrayList<>();

    static class ViewHolder {
        private TextView patente ;
        private TextView nombre ;
        private TextView cargo ;
        private TextView marca ;

        public ViewHolder(View vista){
            patente = (TextView) vista.findViewById(R.id.patente);
            nombre = (TextView) vista.findViewById(R.id.responsable);
            cargo = (TextView) vista.findViewById(R.id.cargoResponsable);
            marca = (TextView) vista.findViewById(R.id.marcaVehiculo);
        }
    }

    public Adaptador(final Context context, List<Vehiculo> lista) {
        super(context, 0, lista);

    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return vehiculos.size(); //Retorna la cantidad de elementos de la llista
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Vehiculo getItem(int position) {
        return vehiculos.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View vista = convertView;

        if(vista == null) {
            LayoutInflater inflate = LayoutInflater.from(context);
            vista = inflate.inflate(R.layout.patente, null);
            holder = new ViewHolder(vista);
            vista.setTag(holder);
        }
        else{
            holder = (ViewHolder) vista.getTag();
        }

        Vehiculo objeto = vehiculos.get(position);

        holder.patente.setText(objeto.getPatente());
        holder.nombre.setText(objeto.getResponsable().getNombre());
        holder.cargo.setText(objeto.getResponsable().getCargo());
        holder.marca.setText(objeto.getMarca());


        return vista;

    }


}
