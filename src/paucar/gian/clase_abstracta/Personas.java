package paucar.gian.clase_abstracta;

import java.util.Date;

public abstract class Personas {
    private String nombre;

    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();
}

class Empleados extends Personas {
    private double sueldo;
    private Date fechaAlta;

    public Empleados(String nombre, Date fechaAlta, double sueldo) {
        super(nombre);
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo de " + sueldo + " y fue dado de alta el " + fechaAlta;
    }

}

class Jefes extends Empleados {

    private double incentivo;

    public Jefes(String nombre, Date fechaAlta, double sueldo) {
        super(nombre, fechaAlta, sueldo);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;

    }
}

class Alumnos extends Personas {

    private String a_optativas;
    private String aula;

    public Alumnos(String nombre, String a_optativas, String aula) {
        super(nombre);
        this.a_optativas = a_optativas;
        this.aula = aula;
    }

    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre() + " está en el " + aula + " y ha escogido la asignatura " + a_optativas;
    }


}
