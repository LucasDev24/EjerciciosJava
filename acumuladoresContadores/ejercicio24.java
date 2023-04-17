package acumuladoresContadores;

import java.util.Scanner;


public class ejercicio24 {
    int sumaPares, sumaImpares, contPares, contImpares, numero=1;
    Scanner teclado = new Scanner(System.in);
   public static void main(String[] args) {
        ejercicio24 ta = new ejercicio24();
        ta.ejercicio();
    }
    private void ejercicio(){
        
        
        while(numero!=0){
            System.out.print("Ingrese valores enteros, si ingresa 0 el proceso terminara: ");
            numero = teclado.nextInt();
            
            if(numero%2==0){
                contPares = numero;
                sumaPares+=contPares;

            }else{
                contImpares = numero;
                sumaImpares+=contImpares;
                
            }
            

        }    
        System.out.print("La suma de numeros pares es: "+sumaPares);
        System.out.print("\n");
        System.out.print("La suma de numeros Impares es: "+sumaImpares);
             
        
    }
}
