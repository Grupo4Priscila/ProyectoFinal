package cl.ucn.disc.dam.autolog.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */
//TODO: cambiar fecha de string a date

@Table(database = MyDatabase.class)
public class Registro extends BaseModel implements Serializable{
    /**
     * Identificador de la clase Registro
     * reg es autoincrementable
     */

    @PrimaryKey(autoincrement = true)
    @Column
    @Getter
    int reg;
    /**
     * vehiculos registrados
     */
    @ForeignKey(saveForeignKeyModel = true)
    @Column
    @Getter
    @Setter
    Vehiculo vehiculo;
    /**
     * la porteria puede ser: norte, sur y principal
     */
    @Column
    @Getter
    @Setter
    String porteria;
    /**
     * Fecha del registro
     */
    @Column
    @Getter
    @Setter
   // Date fecha;
String fecha;

    @Override
    public String toString(){
        return ToStringBuilder
                .reflectionToString(this,
                        ToStringStyle.MULTI_LINE_STYLE);
    }
}
