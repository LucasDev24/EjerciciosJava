package practicas;

import java.util.Scanner;

public class ejercicioDos {
    int x1, x2, y2, y1;
    double ds;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioDos obj = new ejercicioDos();
        obj.ingresar();
        obj.calcular();
        obj.mostrar();
    }

    private void ingresar() {
        System.out.println("Ingrese X1:");
        x1 = teclado.nextInt();
        System.out.println("Ingrese X2:");
        x2 = teclado.nextInt();
        System.out.println("Ingrese Y1:");
        y1 = teclado.nextInt();
        System.out.println("Ingrese Y2:");
        y2 = teclado.nextInt();

    }

    private void calcular() {
        ds = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    private void mostrar() {
        System.out.println("El resultado es: " + ds);
    }
}
