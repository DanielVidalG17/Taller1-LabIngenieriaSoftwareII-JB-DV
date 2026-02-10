package com.figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Figure fig1 = new Circle(1.0);
        Figure fig2 = new Square(2.3);
        Figure fig3 = new Triangle(4.2, 4.5);

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        for(Figure fig : figures){
            System.out.println("Figure: " +fig);
            System.out.println("Area: " +fig.calcularArea());
            System.out.println("Perimetro: " +fig.obtenerPerimetro());
            System.out.println();
        }
    }
}