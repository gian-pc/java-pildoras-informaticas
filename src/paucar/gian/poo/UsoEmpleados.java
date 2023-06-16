package paucar.gian.poo;

public class UsoEmpleados {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Ana");
        Empleados empleado2 = new Empleados("Antonio");

        empleado1.setSeccion("RRHH");

        System.out.println(empleado1.getDatosEmpleado());
        System.out.println(empleado2.getDatosEmpleado());

        System.out.println(Empleados.getIdSiguiente());

    }
}

class Empleados {

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;

    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;

    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDatosEmpleado() {
        return  "El empleado " + nombre + " pertenece a la sección " + seccion + " y tiene el id n° " + Id;
    }

    public static String getIdSiguiente(){
        return "El Id del siguiente Empleado será: " + IdSiguiente;
    }
}
