package tareas;

import java.util.Scanner;

public class ejercicioUno {
    double xPerimetro, xArea, xLado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioUno obj = new ejercicioUno();
        obj.ingresaLado();
        obj.hallarArea();
        obj.hallarPerimetro();

    }
    // ingresamos lado a la variable xLado atraves de la consola

    private void ingresaLado() {
        System.out.println("Ingrese el valor de lado");
        xLado = teclado.nextDouble();

    }

    private void hallarArea() {
        xArea = Math.pow(xLado, 2);
        System.out.println("El area del cuadrado es: " + xArea);
    }

    private void hallarPerimetro() {
        xPerimetro = xLado * 4;
        System.out.println("El perimetro del cuadrado es: " + xPerimetro);

    }

}
