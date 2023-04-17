package rectangulo;

import java.util.Scanner;


public class ejercicioOcho{
    double areaVerde, base,baseDos,altura,rm,rs;
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioOcho rec = new ejercicioOcho();
        rec.ingreseBase();
        rec.ingreseBaseDos();
        rec.ingreseAltura();
        rec.hallarRecMayor();
        rec.hallarRecMenor();
        rec.hallarAreaVerde();
    }
    public void ingreseBase(){
        System.out.print("Ingrese valor de la Base: ");
        base = teclado.nextDouble();
    }
    public void ingreseBaseDos(){
        System.out.print("Ingrese valor de la Segunda Base: ");
        baseDos = teclado.nextDouble();
    }
    public void ingreseAltura(){
        System.out.print("Ingrese valor de la Altura: ");
        altura = teclado.nextDouble();
    }
    public void hallarRecMayor(){
        rs = base * baseDos;
        System.out.print("El valor del rectangulo mayor es: " + rs);
        System.out.println(" ");
    }
    public void hallarRecMenor(){
        rm = 2.2 * 1.2;
        System.out.print("El valor del rectangulo menor es: " + rm);
        System.out.println(" ");
    }
    public void hallarAreaVerde(){
        areaVerde = rs - rm;
        System.out.print("El area coloreada en verde es: " + areaVerde);
    }
}