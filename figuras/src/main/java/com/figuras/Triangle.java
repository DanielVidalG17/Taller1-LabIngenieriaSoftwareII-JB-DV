//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

package com.figuras;

public class Triangle extends Figure{
    
    private double base;
    private double altura;

    
    public Triangle(double base, double altura){

        if(base <= 0 || altura <= 0){
            throw new IllegalArgumentException("La base y la altura deben ser mayores a 0");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double calcularArea(){
        return (base * altura)/2;
    }

    public double obtenerPerimetro(){
        return 3 * base;
    }

    //este proceso se realiza tomando en cuenta que el ejercicio no menciona el tipo de triángulo
    //Por ende se toma como si fuera un equilatero
}
