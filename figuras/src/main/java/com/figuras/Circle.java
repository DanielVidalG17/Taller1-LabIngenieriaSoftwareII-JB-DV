package com.figuras;

public class Circle extends Figure {
    
    private double radio;
    
    public Circle(double radio){

        if(radio <= 0){
            throw new IllegalArgumentException("El radio debe ser mayor a 0");
        }
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double obtenerPerimetro(){
        return 2 * Math.PI * radio;
    }
}
