//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

package com.figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    
    @Test
    public void testCalcularArea(){
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.calcularArea(), 0.0001);
    }

    @Test
    public void testObtenerPerimetro() {
        Circle c = new Circle(1);
        assertEquals(2 * Math.PI, c.obtenerPerimetro(), 0.0001);
    }

    @Test
    public void testInvalidRadio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(0);
        });
    }
}
