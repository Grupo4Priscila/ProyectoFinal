package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by RaosF on 30-11-2017.
 */
@Table(database = MyDatabase.class)
public final class Vehiculo extends BaseModel implements Serializable{

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

    @Override
    public String toString(){
        return ToStringBuilder
                .reflectionToString(this,
                        ToStringStyle.MULTI_LINE_STYLE);
    }
}


