package cl.ucn.disc.dam.autolog.model;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by PriscilaGonzalez on 07-12-2017.
 */

public final class TestPersona {

    @Test
    public void testConstructor(){

        final Persona persona = new Persona();
        persona.setRut("18312277-0");
        persona.setNombre("Priscila Gonzalez");
        persona.setCorreo("pga020@alumnos.ucn.cl");
        persona.setTelefono(74690535);
        persona.setAnexo(052);
        persona.setUnidad("depto unido");
        persona.setOficina("y005");
        persona.setTipo("academico");
        persona.setCargo("director");

        assertNotNull(persona);
        assertEquals("1831227-0", persona.getRut());

    }
}
