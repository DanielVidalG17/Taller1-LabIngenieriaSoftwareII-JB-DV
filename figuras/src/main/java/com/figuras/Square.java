//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

package com.figuras;

public class Square extends Figure {
    
    private double lado;
    
    public Square(double lado){

        if(lado <= 0){
            throw new IllegalArgumentException("El lado debe ser mayor a 0");
        }
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double obtenerPerimetro(){
        return 4 * lado;
    }
}
