package cl.ucn.disc.dam.autolog.model;


import lombok.Builder;
import lombok.Getter;

/**
 * Created by RaosF on 30-11-2017.
 */


@Builder
public final class Vehiculo {

    /**
     * Persona responsable;
     */
    @Getter
    String patente;

    @Getter
    String marca;

    @Getter
    String color;

    @Getter
    String modelo;

    @Getter
    int ano;

    @Getter
    String descripcion;
    



}


