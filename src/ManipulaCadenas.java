public class ManipulaCadenas {
    public static void main(String[] args) {

        String nombre = "Gian";
        System.out.println(nombre.length());
        System.out.println(nombre.charAt(2));

        // Accediendo a la última letra de "Gian
        System.out.println(nombre.charAt(nombre.length() - 1));

        // Substring extrae trozos de texto
        String frase = "Hola cómo estas?";
        System.out.println(frase.substring(5));
        System.out.println(frase.substring(5, 9));

        // Comparando

        String palabra1 = "Casa";
        String palabra2 = "casa";

        System.out.println("Comparando: " + palabra1.equals(palabra2));
        System.out.println("Comparando: " + palabra1.equalsIgnoreCase(palabra2));


    }
}
