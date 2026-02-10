//Daniel Alejandro Vidal Guevara
//Jonatan David Bolaños Jojoa

//IMPORTANTE: Para que compile, el java debe tener la versión de JDK 17 o superior
//Tambien, se necesita tener instalado el paquete MAVEN, el cual organiza la estructura estándar (src/main/java, src/test/java).
//Este mismo permite compilar y ejecutar pruebas con comandos como lo son "mvn compile" y "mvn test" (sin comillas claramente) en el terminal
//También sera necesario el JUnit 5 el cual nos permitira hacer los test, para verificar las areas, perimetros y validaciones de forma rapida y automatica
//Finalmente todo se realizo en el programa Visual Studio Code
//Para ejecutar las pruebas, no se corren de forma convencional sino con los siguientes comandos:
//cd figures + mvn test, adicionalmente el mvn compile para compilar codigo.

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
            System.out.println("----------------------------");
        }
    }
}