package paucar.gian.entradaSalida.ejercicios;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double num = sc.nextDouble();

        System.out.println("La raíz es " + Math.sqrt(num));

    }
}
