package paucar.gian.poo.polimorfismo.ejercicios;

class CreaPassword {

    // Atributos
    private int longitud;
    private String password;

    // Constructor
    public CreaPassword(int longitud) {
        this.longitud = longitud;
        password = generaPassword();
    }

    // Getters
    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }


    private String generaPassword() {
        String password = "";

        for (int i = 0; i < longitud; i++) {

            int mayusMinus = (int) (Math.random() * 3 + 1); // 1,2,3

            if (mayusMinus == 1) {
                char minusculas = (char) (Math.random() * (123 - 97) + 97);
                password += minusculas;
            } else if (mayusMinus == 2) {
                char mayusculas = (char) (Math.random() * (91 - 65) + 65);
                password += mayusculas;
            } else {
                char numeros = (char) (Math.random() * (58 - 48) + 48);
                password += numeros;
            }

        }
        return password;
    }

    public String esSegura() {
        int numeros = 0;
        int minusculas = 0;
        int mayusculas = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                minusculas += 1;
            } else if (Character.isUpperCase(password.charAt(i))) {
                mayusculas += 1;
            } else {
                numeros += 1;
            }
        }

        if (numeros >= 5 && minusculas >= 1 && mayusculas >= 2) {
            return "Contraseña segura";
        } else {
            return "Contraseña débil";
        }

    }
}