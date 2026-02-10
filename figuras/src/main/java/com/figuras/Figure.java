package com.figuras;

public abstract class Figure {

    public abstract double calcularArea();

    public abstract double obtenerPerimetro();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
