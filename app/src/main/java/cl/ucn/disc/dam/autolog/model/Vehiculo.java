package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;


import java.io.Serializable;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by RaosF on 30-11-2017.
 */
@Table(database = MyDatabase.class)
public final class Vehiculo implements Serializable {

    /**
     * Persona responsable;
     */
    @ForeignKey(saveForeignKeyModel = true)
    @Getter
    @Setter
    @Column
    Persona responsable;

    @PrimaryKey
    @Column
    @Getter
    @Setter
    String patente;

    @Getter
    @Setter
    @Column
    String marca;



    @Getter
    @Setter
    @Column
    String color;

    @Getter
    @Setter
    @Column
    String modelo;

    @Getter
    @Setter
    @Column
    int anio;

    @Getter
    @Setter
    @Column
    String descripcion;

  /*  public Vehiculo(Persona responsable, String patente, String marca, String color, String modelo, int anio, String descripcion) {
        this.responsable = responsable;
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.descripcion = descripcion;
    }
*/
}


