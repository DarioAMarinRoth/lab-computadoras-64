package utilidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static utilidades.Funciones.*;

class FuncionesTest {


    @Test
    public void absTest() {
        assertEquals(1, abs(1));
        assertEquals(1, abs(-1));
        assertEquals(0, abs(0));
    }

    @Test
    public void sonIgualesTest() {
        assertTrue(sonIguales(1.0, 1.01, 0.02));
        assertTrue(sonIguales(1.01, 1.00, 0.02));
        assertFalse(sonIguales(1.00, 1.02, 0.01));
        assertFalse(sonIguales(1.02, 1.00, 0.01));
    }

    @Test
    public void potenciaTest() {
        double delta = 0.00001;
        assertEquals(10, potenciaRecursiva(10, 1), delta);
        assertEquals(1, potenciaRecursiva(10, 0), delta);
        assertEquals(1, potenciaRecursiva(-10, 0), delta);
        assertEquals(100, potenciaRecursiva(10, 2), delta);
        assertEquals(0.1, potenciaRecursiva(10, -1), delta);
        assertEquals(0.01, potenciaRecursiva(10, -2), delta);
        assertEquals(0.25, potenciaRecursiva(2, -2), delta);
        assertEquals(4, potenciaRecursiva(2, 2), delta);
        assertEquals(4, potenciaRecursiva(-2, 2), delta);
        assertEquals(-8, potenciaRecursiva(-2, 3), delta);
    }

}