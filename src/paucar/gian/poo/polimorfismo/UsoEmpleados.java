package paucar.gian.poo.polimorfismo;

import java.util.GregorianCalendar;

public class UsoEmpleados {
    public static void main(String[] args) {

        Jefes Juan = new Jefes("Juan", 1500, 2022, 2, 5);
        Juan.setIncentivo(500);

        Empleados[] losEmpleados = new Empleados[6];
        losEmpleados[0] = new Empleados("Antonio", 2300, 2020, 11, 5);
        losEmpleados[1] = new Empleados("Carlos", 5000, 2010, 05, 12);
        losEmpleados[2] = new Empleados("Maria", 1800, 2000, 04, 23);
        losEmpleados[3] = new Empleados("Ana", 200, 2023, 01, 14);
        losEmpleados[4] = Juan; // principio de sustitución - upcasting
        losEmpleados[5]= new Jefes("Isabel",8000,2005,4,2);

        Jefes Isabel = (Jefes)losEmpleados[5]; // dowcasting/casting explicito

        // Agregando un incentivo, pero antes debo de castear de Empleados a Objetos de otra manera no saldría
        // el método .setIncentivo().
        Isabel.setIncentivo(500);
        //((Jefes) losEmpleados[5]).setIncentivo(500);


        Empleados Patricia = new Jefes("Patricia", 2500,2007,5,6);

        Jefes patriciaJefe = (Jefes) Patricia;  // dowcastin/casting explicito


        for (Empleados obj : losEmpleados) {
            System.out.println(obj.getDatosEmpleado() + " y un salario de " + obj.getSueldo());
        }

    }
}


class Empleados {

    // Atributos
    private final String nombre;
    private double sueldo;
    GregorianCalendar calendario;
    private int Id;
    private static int IdSiguiente = 1;

    // Constructor
    public Empleados(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        calendario = new GregorianCalendar(anio, mes, dia);
        Id = IdSiguiente;
        IdSiguiente++;
    }

    // Métodos Getters
    public String getDatosEmpleado() {
        return "El empleado " + nombre + " tiene el Id " + Id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static String getIdSiguiente() {
        return "El Id del siguiente Empleado será: " + IdSiguiente;
    }

    public GregorianCalendar getFechaAlta() {
        return calendario;
    }

    // Métodos Setters
    public void setSubeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }


}

class Jefes extends Empleados {
    // Atributos
    private double incentivo;

    // Constructor
    public Jefes(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);

    }

    // Métodos
    public void setIncentivo(double b) {
        incentivo = b;
    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo(); // llama al método de la clase padre y no al suyo
        return sueldoJefe + incentivo;
    }
}
