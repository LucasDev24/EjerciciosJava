package rectangulo;
import java.util.Scanner;
public class ejercicioDos {
    Scanner teclado = new Scanner(System.in);
    double ladoUno, laDos, area, perimetro;
    public static void main(String[] args) {
        ejercicioDos rec = new ejercicioDos();
        rec.ingreseBase();
        rec.ingreseAltura();
        rec.hallarArea();
        rec.hallarPerimetro();
    }

    public void ingreseBase(){
        System.out.print("Ingrese el valor de la base: ");
        ladoUno = teclado.nextDouble();
    }
    public void ingreseAltura(){
        System.out.print("Ingrese el valor de la altura: ");
        laDos = teclado.nextDouble();
    }
    public void hallarArea(){
        area = ladoUno * laDos;
        System.out.print("El area es: "+ area);
        System.out.println("\n");
    }
    public void hallarPerimetro(){
        perimetro = 2*(ladoUno+laDos);
        System.out.println("El perimetro es: "+perimetro);
    }
    
}
