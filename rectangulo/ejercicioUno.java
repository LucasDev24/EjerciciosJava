package rectangulo;
import java.util.Scanner;
public class ejercicioUno {
    double perimetro, area, ladoUno, laDos;
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioUno rec = new ejercicioUno();
        rec.ingreseLadoUno();
        rec.ingreseLaDos();
        rec.hallarArea();
        rec.hallarPerimetro();
    }

    public void ingreseLadoUno(){
        System.out.print("Ingrese el valor de la base: ");
        ladoUno = teclado.nextDouble();
    }
    public void ingreseLaDos(){
        System.out.print("Ingrese el valor de la altura: ");
        laDos = teclado.nextDouble();
    }
    public void hallarArea(){
        area = ladoUno * laDos;
        System.out.print("El area del rectangulo es: " + area);
        System.out.print("\n");
    }
    public void hallarPerimetro(){
        perimetro = 2*(ladoUno+laDos);
        System.out.print("El perimetro del area es: "+perimetro);
    }
    
}
