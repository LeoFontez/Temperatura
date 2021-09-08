package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        char resp;
        
        do{
            System.out.print("Digite a Temperatura em Celsius: ");
            double C = scan.nextDouble();
            double F = 9 * C / 5 + 32.0; //Calculo de C para F
            
            System.out.printf("Temperatura Equivalente em Fahrenheit: %.1f%n" , F);
            System.out.print("Deseja Repetir (s/n)? ");
            resp = scan.next().charAt(0);
            
        }while(resp != 'n');

    }
    
}
