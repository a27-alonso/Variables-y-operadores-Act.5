package Operadores;

import java.util.Scanner;

public class operadores {

    public static void main(String[] args){
        float numero1;
        float numero2;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        float modulo;
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Inserta 2 numeros: ");
            numero1 = entrada.nextFloat();
            numero2 = entrada.nextFloat();
        }

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es:  "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es  "+division);
        System.out.println("El modulo es: "+modulo);
    }
}
