package paucar.gian.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");

        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);

        System.out.print("Introduce el n° 1: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el n° 2: ");
        int num2 = entrada.nextInt();

        System.out.println("suma: " + num1 + " + " + num2 + " = " + (num1 + num2));

        entrada.close();

    }
}

