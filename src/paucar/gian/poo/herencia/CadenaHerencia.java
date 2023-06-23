package paucar.gian.poo.herencia;

public class CadenaHerencia {
    public static void main(String[] args) {

        Clase3 miobj = new Clase3();

    }
}

class Clase1 {
    public void metodo1() {
    }
}

class Clase2 extends Clase1 {
    public void metodo2() {
    }
}

class Clase3 extends Clase2 {
    public void metodo3() {
    }
}

class Clase4 extends Clase3 {
    public void metodo4() {
    }
}
