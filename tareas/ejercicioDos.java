package tareas;

import java.util.Scanner;


public class ejercicioDos {
    double xArea, xPerimetro, xLado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioDos obj = new ejercicioDos();
        obj.ingresaLado();
        obj.calcularPerimetro();
        obj.calcularArea();
    }

    private void ingresaLado() {
        
        System.out.print("Ingrese el valor de lado: ");
        xLado = teclado.nextDouble();

    }

    private void calcularPerimetro() {
        xPerimetro = xLado * 4;
        System.out.println("El perimetro del cuadrado es: " + xPerimetro);
    }

    private void calcularArea() {
        xArea = Math.pow(xLado, 2);
        System.out.println("El area del cuadrado es: " + xArea);

    }

}
