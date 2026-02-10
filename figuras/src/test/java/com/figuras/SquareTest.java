//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

package com.figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void testCalcularArea() {
        Square s = new Square(2);
        assertEquals(4, s.calcularArea(), 0.0001);
    }

    @Test
    public void testObtenerPerimetro() {
        Square s = new Square(2);
        assertEquals(8, s.obtenerPerimetro(), 0.0001);
    }

    @Test
    public void testInvalidSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Square(0);
        });
    }
}

