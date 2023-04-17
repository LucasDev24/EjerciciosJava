package tareas;

import java.util.Scanner;

public class ejercicioTres {
    double vperimetro, varea, vlado;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicioTres obj = new ejercicioTres();
        obj.ingresaLado();
        obj.calculaArea();
        obj.calculaPerimetro();
    }

    private void ingresaLado() {
        System.out.print("Ingrese el lado: ");
        vlado = teclado.nextDouble();

    }

    private void calculaArea() {
        varea = Math.pow(vlado, 2);
        System.out.println("el area hallada es: " + varea);

    }

    private void calculaPerimetro() {
        vperimetro = vlado * 4;
        System.out.println("el perimetro es : " + vperimetro);

    }

}
