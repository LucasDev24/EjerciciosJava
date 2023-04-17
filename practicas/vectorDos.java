package practicas;

import java.util.Scanner;


public class vectorDos {
    static Scanner teclado = new Scanner(System.in);
    static int dim, suma;
    static float[] vector;

    public static void main(String[] args) {
        vectorDos vec = new vectorDos();
        vec.tamanio();
        vec.cargarDatos();
        vec.calculaSuma();
        vec.mostrarVector();

    }

    private void tamanio() {
        System.out.print("Ingrese el tamanio del vector: ");
        dim = teclado.nextInt();
        if (dim > 0) {
            vector = new float[dim];
        } else {
            tamanio();

        }
    }

    private void cargarDatos() {
        for (int x = 0; x < dim; x++) {
            System.out.println("Ingrese el valor [" + x + "]");
            vector[x] = teclado.nextFloat();

        }
    }

    private void calculaSuma() {
        for (int x = 0; x < dim; x++) {
            if (vector[x] == Math.round(vector[x])) {
                suma += suma + vector[x];
            }
        }
    }

    private void mostrarVector() {
        for (int x = 0; x < dim; x++) {
            System.out.println(vector[x] + "");
        }
        System.out.println("la suma de los elementos enteros es: " + suma);
    }

}
