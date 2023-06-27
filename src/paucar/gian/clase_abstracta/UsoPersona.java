package paucar.gian.clase_abstracta;

import java.util.Date;

public class UsoPersona {
    public static void main(String[] args) {

        Empleados Juan = new Empleados("Juan",new Date(2007,5,6),2500);

        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());

        Jefes Ana = new Jefes("Ana", new Date(2020,8,3),2000);
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion());

        Alumnos Maria = new Alumnos("Maria","Dibujo","Aula 5");
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());


    }
}
