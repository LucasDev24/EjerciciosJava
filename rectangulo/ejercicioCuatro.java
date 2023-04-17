package rectangulo;

import java.util.Scanner;

public class ejercicioCuatro {
    double areadm, area, perimetro, altura, base;
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioCuatro rec = new ejercicioCuatro();
        rec.ingresarAreaDm();
        rec.hallarDecimetroCentimetro();
        rec.ingreseBase();
        rec.hallarAltura();
        rec.hallarPerimetro();
    }
    private void ingresarAreaDm(){
        System.out.print("Ingrese el area en decimetros cuadrados: ");
        areadm = teclado.nextDouble();
    }
    private void ingreseBase(){
        System.out.print("Ingrese el valor de la base: ");
        base = teclado.nextDouble();
    }
    private void hallarDecimetroCentimetro(){
        area = areadm * 10;
        System.out.print("El area en centimetros cuadrados es: " + area);
        System.out.println(" ");
    }
    private void hallarAltura(){
        altura = area / base;
        System.out.print("La altura mide: "+ altura);
        System.out.println(" ");

    }
    private void hallarPerimetro(){
        perimetro = 2*(altura+base);
        System.out.print("El Perimetro es: " + perimetro);
    }
}
