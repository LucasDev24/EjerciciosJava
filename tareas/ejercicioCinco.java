package tareas;

import java.util.Scanner;

public class ejercicioCinco {
    double xArea, xPerimetro, xLado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioCinco obj = new ejercicioCinco();
        obj.ingresarArea();
        obj.hallarLado();
        obj.hallarPerimetro();
    }

    private void ingresarArea() {
       
        System.out.print("Ingresa el valor de la superficie del cuadrado: ");
        xArea = teclado.nextDouble();
    }

    private void hallarLado() {
        xLado = Math.sqrt(xArea);
    }

    private void hallarPerimetro() {
        xPerimetro = xLado * 4;
        System.out.print("El perimetro del cuadrado es: " + xPerimetro);
    }

}
