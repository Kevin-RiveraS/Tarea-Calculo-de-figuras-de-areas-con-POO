import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Circulo miCirculo = new Circulo("Circulo", 5.0);
        Rectangulo miRectangulo = new Rectangulo("Rectangulo", 4.0, 6.0);
        Triangulo miTriangulo = new Triangulo("Triangulo", 4.0, 8.0);

        Figura[] misFiguras = new Figura[3];
        misFiguras [0] = miCirculo;
        misFiguras [1]= miRectangulo;
        misFiguras [2]= miTriangulo;

        System.out.println("===== CÁLCULO DE ÁREAS DE FIGURAS GEOMÉTRICAS ===== \n ");

        for (Figura f: misFiguras){
            f.mostrarInformacion();

            System.out.printf ("Área: %.2f%n", f.calcularArea());
            System.out.println("------------------------------");
        }
    }
}


