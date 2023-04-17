package tareas;

import java.util.Scanner;

public class ejercicioOnce {
    double xArea, xLado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioOnce obj = new ejercicioOnce();
        obj.ingresaLado();
        obj.calcularArea();

    }

    private void ingresaLado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        xLado = teclado.nextDouble();
    }

    private void calcularArea() {
        xArea = Math.pow(xLado, 2);
        System.out.print("El area del cuadrado es: " + xArea);
    }

}
