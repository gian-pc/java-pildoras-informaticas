package paucar.gian.array;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
    }
}
