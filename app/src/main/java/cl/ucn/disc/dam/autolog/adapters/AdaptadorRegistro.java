package cl.ucn.disc.dam.autolog.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import cl.ucn.disc.dam.autolog.R;
import cl.ucn.disc.dam.autolog.model.Registro;
import cl.ucn.disc.dam.autolog.model.Vehiculo;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by PriscilaGonzalez on 22-12-2017.
 */
@Slf4j
public class AdaptadorRegistro extends BaseAdapter{
    Context context;
    List<Registro> registros;

    static class ViewHolder {
        private TextView patente ;
        private TextView porteria;
        private TextView fecha ;


        public ViewHolder(View vista){
            //TODO: ARREGLAR LOS R
            patente = (TextView) vista.findViewById(R.id.patente);
            porteria = (TextView) vista.findViewById(R.id.porteria);
            fecha = (TextView) vista.findViewById(R.id.fecha);

        }
    }

    public AdaptadorRegistro(final Context context, List<Registro> lista) {
        this.context = context;
        registros = lista;
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return registros.size(); //Retorna la cantidad de elementos de la llista
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return registros.get(position);
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
        AdaptadorRegistro.ViewHolder holder;
        View vista = convertView;

        if(vista == null) {
            LayoutInflater inflate = LayoutInflater.from(context);
            vista = inflate.inflate(R.layout.registro, null);
            holder = new ViewHolder(vista);
            vista.setTag(holder);
        }
        else{
            holder = (ViewHolder) vista.getTag();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy \nhh:mm:ss");
        Registro objeto = registros.get(position);
        String date = simpleDateFormat.format(objeto.getFecha());
        holder.patente.setText(objeto.getVehiculo().getPatente());
        holder.fecha.setText(date);
        holder.porteria.setText(objeto.getPorteria());
        return vista;

    }


}
