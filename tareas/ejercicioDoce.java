package tareas;

import java.util.Scanner;


public class ejercicioDoce {
    double xLado, xArea, xCorresponde;
    int xAlumnos;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioDoce obj = new ejercicioDoce();
        obj.ingresaLado();
        obj.ingresaCantidadAlumno();
        obj.calculaArea();
        obj.superficieCorrespondiente();

    }

    // conocemos el lado del cuadrado
    private void ingresaLado() {
        System.out.print("Ingrese el lado del aula: ");
        xLado = teclado.nextDouble();
    }

    // conocemos la cantidad de alumnos
    private void ingresaCantidadAlumno() {
        
        System.out.print("Ingresa la cantidad de alumnos: ");
        xAlumnos = teclado.nextInt();
    }

    // hallamos la superficie del aula con el lado ingresado
    private void calculaArea() {
        xArea = Math.pow(xLado, 2);
    }

    // hallamos la cantidad de superficie correspondiente a los alumnos
    private void superficieCorrespondiente() {
        xCorresponde = xArea / xAlumnos;
        System.out.print("La cantidad de superficie que corresponde a cada alumno es: " + xCorresponde + "m2");

    }

}
