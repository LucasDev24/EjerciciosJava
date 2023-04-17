package rectangulo;
import java.util.Scanner;
public class ejercicioCinco {
    double perimetro, base, altura,aux;
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioCinco rec = new ejercicioCinco();
        rec.ingresaPerimetro();
        rec.ingresaBase();
        rec.hallarAltura();
    }
    private void ingresaPerimetro(){
        System.out.print("Ingrese el Perimetro: ");
        perimetro = teclado.nextDouble();
    }
    private void ingresaBase(){
        System.out.print("Ingrese el valor de la base: ");
        base = teclado.nextDouble();
    }
    private void hallarAltura(){
        altura = perimetro-2*base;
        aux = altura / 2;
        System.out.print("La altura es: "+ aux);

    }
    
}
