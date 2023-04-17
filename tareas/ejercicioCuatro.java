package tareas;

import java.util.Scanner;

public class ejercicioCuatro {
    double xArea, xLado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioCuatro obj = new ejercicioCuatro();
        obj.ingresaArea();
        obj.hallarLado();

    }

    private void ingresaArea() {
       
        System.out.print("Ingresa el valor de la superficie: ");
        xArea = teclado.nextDouble();
    }

    private void hallarLado() {
        xLado = Math.sqrt(xArea);
        System.out.print("El lado del cuadrado tiene: " + xLado + "cm");
    }

}
