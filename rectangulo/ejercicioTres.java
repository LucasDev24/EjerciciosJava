package rectangulo;
import java.util.Scanner;


public class ejercicioTres {
    Scanner teclado = new Scanner(System.in);
    double base, altura, area, perimetro;
    public static void main(String[] args) {
        ejercicioTres rec = new ejercicioTres();
        rec.ingresePerimetro();
        rec.ingreseAltura();
        rec.hallarBase();
        rec.hallarArea();
        
    }
    public void ingresePerimetro(){
        System.out.print("Ingrese el perimetro del rectangulo: ");
        perimetro = teclado.nextDouble();
    }
    public void ingreseAltura(){
        System.out.print("Ingrese el valor de la Altura: ");
        altura = teclado.nextDouble();
    }
    public void hallarBase(){
        base = perimetro / altura;
        System.out.print("La base mide: "+base);
        System.out.print("\n");
    }
    public void hallarArea(){
        area = base * altura;
        System.out.print("El area es: "+ base);
    }
    
}
