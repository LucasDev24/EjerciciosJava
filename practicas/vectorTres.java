package practicas;

import java.util.Scanner;


public class vectorTres {
    static int dim;
    static int[] vectorUno, vectorDos, vectorTres;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        vectorTres vec = new vectorTres();
        vec.ingreseTamanio();
        vec.ingreseElementos();
        vec.calcularSuma();
        vec.mostrarVectores();
        vec.mostrarVectorTres();

    }

    private void ingreseTamanio() {
        System.out.print("Ingrese la dimension: ");
        dim = teclado.nextInt();
        if (dim > 0) {
            vectorUno = new int[dim];
            vectorDos = new int[dim];
            vectorTres = new int[dim];
        } else {
            ingreseTamanio();
        }
    }

    private void ingreseElementos() {
        System.out.println("Ingrese los elementos del vector 1");
        for (int x = 0; x < dim; x++) {
            vectorUno[x] = teclado.nextInt();

        }
        System.out.println("Ingrese los elementos del vector 2");
        for (int y = 0; y < dim; y++) {
            vectorUno[y] = teclado.nextInt();

        }
    }

    private void calcularSuma() {
        for (int x = 0; x < dim; x++) {
            vectorTres[x] = vectorDos[x] + vectorUno[x];
        }

    }

    private void mostrarVectores() {
        System.out.println("Elementos del vector 1");
        for (int x = 0; x < dim; x++) {
            System.out.print(vectorUno[x] + " ");

        }

        System.out.println("Elementos del vector 2");
        for (int y = 0; y < dim; y++) {
            System.out.print(vectorDos[y] + " ");

        }

    }

    private void mostrarVectorTres() {
        System.out.println("Elementos del vector 3");
        for (int x = 0; x < dim; x++) {
            System.out.print(vectorTres[x] + " ");

        }

}
}
