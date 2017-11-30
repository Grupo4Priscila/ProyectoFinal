package cl.ucn.disc.dam.autolog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by PriscilaGonzalez on 30-11-2017.
 */
public final class Persona {

    /**
     * Rut (identificador) de la persona
     */
    @Getter
    String rut;

    /**
     *Nombre y apellido de la persona
     */
    @Getter
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
}
