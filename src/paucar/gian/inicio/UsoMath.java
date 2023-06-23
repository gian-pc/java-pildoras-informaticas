package paucar.gian.inicio;

public class UsoMath {
    public static void main(String[] args) {

        System.out.println("Raiz cuadrada: " + Math.sqrt(9));
        System.out.println("Redondear: " + Math.round(5.4));

        // Casting
        int resultado = Math.round(3.4F); // 3.4F es de tipo float y devuelve int
        System.out.println("De Float a int: " + resultado);

        double numero = 3.4;
        int resultado2 = (int) Math.round(numero);
        System.out.println("Casting de double a int: " + resultado2);

    }





}
