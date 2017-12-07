package cl.ucn.disc.dam.autolog.model;


import lombok.Getter;
import lombok.Builder;
import lombok.Getter;


/**
 * Created by RaosF on 30-11-2017.
 */



public final class Vehiculo {


    /**
     * Persona responsable;
     */
    @Getter


    Persona responsable;


    String patente;

    @Getter
    String marca;

    @Getter
    String color;

    @Getter
    String modelo;


    @Getter
    int anio;


    @Getter
    String descripcion;
    



}


