package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.List;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */

@Table(database = MyDatabase.class)
//@Builder
public final class Persona extends BaseModel{

    /**
     * Rut (identificador) de la persona
     */
    @PrimaryKey
    @Column
    @Setter
    @Getter
    String rut;

    /**
     *Nombre y apellido de la persona
     */
    @Setter
    @Getter
    @Column
    String nombre;
    /**
     * Correo electronico de la personas
     */
    @Getter
    @Setter
    String correo;
    /**
     * telefono movil de la persona
     */
    @Getter
    @Setter
    int telefono;
    /**
     * anexo, numero de la oficina
     */
    @Getter
    @Setter
    int anexo;
    /**
     * unidad: departamento
     */
    @Getter
    @Setter
    String unidad;
    /**
     * oficina: numero o nombre de oficina
     */
    @Getter
    @Setter
    String oficina;
    /**
     * tipo, puede ser: academico, funcionario, apoyo, externo
     */
    @Getter
    @Setter
    String tipo;
    /**
     * cargo, puede ser: director, rector, secretaria
     */
    @Getter
    @Setter
    String cargo;
    /**
     * Lista de vehiculos que posee la personas
     */
    @Getter
    @Setter
    List<Vehiculo> vehiculos;
}
