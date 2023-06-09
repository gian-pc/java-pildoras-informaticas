package paucar.gian.array;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Inputs
        Scanner sc = new Scanner(System.in);

        // variables
        int negativos = 0, positivos = 0, ceros = 0;
        int[] arrEnteros = new int[10];

        // process

        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < arrEnteros.length; i++) {

            int num = sc.nextInt();
            arrEnteros[i] = num;

            if (arrEnteros[i] == 0) {
                ceros++;
            } else if (arrEnteros[i] < 0) {
                negativos++;
            } else if (arrEnteros[i] > 0) {
                positivos++;
            }
        }

        // outputs
        System.out.println(Arrays.toString(arrEnteros));
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números cero: " + ceros);
    }
}
