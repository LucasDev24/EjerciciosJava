package practicas;

import java.util.Scanner;

public class practicaUno {
    static Scanner teclado = new Scanner(System.in);
    static int n;
    static int[] vector;

    public static void main(String[] args) {
        practicaUno vec = new practicaUno();
        vec.tamanio();
        vec.cargaDatos();
        vec.mostrarVector();

    }

    private void tamanio() {
        System.out.print("Ingrese el tamanio del vector: ");
        n = teclado.nextInt();
        if (n > 0) {
            vector = new int[n];
        } else {
            tamanio();
        }
    }

    private void cargaDatos() {
        for (int x = 0; x < n; x++) {
            System.out.println("Ingrese el valor [" + x + "] : ");
            int num = teclado.nextInt();
            vector[x] = num;
        }
    }

    private void mostrarVector() {
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + "");

        }
        System.out.println("\n");
    }

}
