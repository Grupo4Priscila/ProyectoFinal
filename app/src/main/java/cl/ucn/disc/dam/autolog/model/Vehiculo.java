package cl.ucn.disc.dam.autolog.model;


import lombok.Builder;

/**
 * Created by RaosF on 30-11-2017.
 */


@Builder
public final class Vehiculo {

    /**
     * Persona responsable;
     */

    String patente;

    String marca;

    String color;

    String modelo;

    int ano;

    String descripcion;




}


