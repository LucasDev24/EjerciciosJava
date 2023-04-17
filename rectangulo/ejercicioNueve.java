package rectangulo;

import java.util.Scanner;

public class ejercicioNueve {
    double superficie, largo, ancho, precioCesped, reponerCesped;
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioNueve rec = new ejercicioNueve();
        rec.ingreseLargo();
        rec.ingreseAncho();
        rec.hallarSuperficie();
        rec.precioCesped();
        rec.reponerCesped();
    }
    public void ingreseAncho(){
        System.out.print("Ingrese el valor del Ancho: ");
        ancho = teclado.nextDouble();
    }
    public void ingreseLargo(){
        System.out.print("Ingrese el valor del largo: ");
        largo = teclado.nextDouble();
    }
    public void precioCesped(){
        System.out.print("Ingrese el precio del cesped: ");
        precioCesped = teclado.nextDouble();
    }
    public void hallarSuperficie(){
        superficie = largo * ancho;
        System.out.print("La superficie es: "+superficie);
        System.out.println(" ");
    }
    public void reponerCesped(){
        reponerCesped = superficie * precioCesped;
        System.out.print("EL precio a pagar para reponer el cesped: "+ reponerCesped);
        
    }
}
