package cl.ucn.disc.dam.autolog.model;



import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */

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
