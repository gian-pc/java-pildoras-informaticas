package paucar.gian.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        double media = 0;
        int countPares = 0;
        int[] arrNumeros = new int[10];


        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < arrNumeros.length; i++) {
            int num = sc.nextInt();
            arrNumeros[i] = num;
            if (i % 2 == 0) {
                countPares++;
                suma += arrNumeros[i];
                media = (double) suma / countPares;

            }
        }
        System.out.println(Arrays.toString(arrNumeros));
        System.out.println("Suma de los i pares: " + suma);
        System.out.println("Promedio de la suma: " + media);

    }
}
