package ejercicios;

public class CalculoPotencia {
    public static void main(String[] args) {

        int base, exponente;
        int resultado;

        base = 5;
        exponente = 12;

        resultado = (int) Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);

    }
}
