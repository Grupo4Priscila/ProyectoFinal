package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.OneToMany;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.BaseModel;


import java.io.Serializable;
import java.util.List;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */


@Table(database = MyDatabase.class)
//@Builder
public final class Persona extends BaseModel implements Serializable {

    //TODO:: corregir la lista de vehiculos one to many!!!!
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
    @Column
    String correo;
    /**
     * telefono movil de la persona
     */
    @Getter
    @Setter
    @Column
    int telefono;
    /**
     * anexo, numero de la oficina
     */
    @Getter
    @Setter
    @Column
    int anexo;
    /**
     * unidad: departamento
     */
    @Getter
    @Setter
    @Column
    String unidad;
    /**
     * oficina: numero o nombre de oficina
     */
    @Getter
    @Setter
    @Column
    String oficina;
    /**
     * tipo, puede ser: academico, funcionario, apoyo, externo
     */
    @Getter
    @Setter
    @Column
    String tipo;
    /**
     * cargo, puede ser: director, rector, secretaria
     */
    @Getter
    @Setter
    @Column
    String cargo;
    /**
     * Lista de vehiculos que posee la personas
     */
    @Getter
    @Setter
    List<Vehiculo> vehiculos;

  /*  public Persona(String rut, String nombre, String correo, int telefono, int anexo, String unidad, String oficina, String tipo, String cargo, List<Vehiculo> vehiculos) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.anexo = anexo;
        this.unidad = unidad;
        this.oficina = oficina;
        this.tipo = tipo;
        this.cargo = cargo;
        this.vehiculos = vehiculos;
    }
*/
    @OneToMany(methods = OneToMany.Method.ALL, variableName = "vehiculos")
    public List<Vehiculo> oneToManyVehiculos(){
        if(vehiculos == null){
            vehiculos = SQLite.select()
                    .from(Vehiculo.class)
               //     .where(Vehiculo_Table.responsable.getCursorKey().equals(this.rut))
                    .queryList();
        }
        return vehiculos;
    }
@Override
public boolean save() {
    boolean res = super.save();
    if (vehiculos != null) {
        for (Vehiculo s : vehiculos) {
            s.setResponsable(this);
//            s.save();
        }
    }
    return res;
}
}
