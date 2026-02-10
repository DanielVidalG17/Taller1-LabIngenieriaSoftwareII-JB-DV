//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

package com.figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testCalcularArea() {
        Triangle t = new Triangle(4, 5);
        assertEquals(10, t.calcularArea(), 0.0001);
    }

    @Test
    public void testObtenerPerimetro() {
        Triangle t = new Triangle(3, 4);
        assertEquals(9, t.obtenerPerimetro(), 0.0001); // equilátero
    }

    @Test
    public void testInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(0, 5);
        });
    }
}

