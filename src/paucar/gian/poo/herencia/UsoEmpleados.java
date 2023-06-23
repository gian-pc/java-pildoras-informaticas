package paucar.gian.poo.herencia;

import java.util.GregorianCalendar;

public class UsoEmpleados {
    public static void main(String[] args) {


        Empleados Antonio = new Empleados("Antonio",2500,2023,12,17);
        Jefes Ana = new Jefes("Ana",1500,2018,5,28);

        System.out.println(Ana.getSueldo());

    }
}

class Empleados {

    private final String nombre;
    private double sueldo;
    GregorianCalendar calendario;
    private int Id;
    private static int IdSiguiente = 1;

    public Empleados(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        calendario = new GregorianCalendar(2023, 06, 20);
        Id = IdSiguiente;
        IdSiguiente++;
    }


    public String getDatosEmpleado() {
        return "El empleado " + nombre + " tiene el Id " + Id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public GregorianCalendar getFechaAlta() {
        return calendario;
    }

    public void setSubeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public static String getIdSiguiente() {
        return "El Id del siguiente Empleado será: " + IdSiguiente;
    }
}

class Jefes extends Empleados{
    public Jefes(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }
}
