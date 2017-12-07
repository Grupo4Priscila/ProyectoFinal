package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Table;
import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */
@Table(database = MyDatabase.class)
public class Registro {
    /**
     * Lista de los vehiculos registrados
     */
    @Getter
    @Setter
    Vehiculo vehiculo;
    /**
     * la porteria puede ser: norte, sur y principal
     */
    @Getter
    @Setter
    String porteria;
    /**
     * Fecha del registro
     */
    @Getter
    @Setter
    String fecha;
}
