package paucar.gian.clase_abstracta;

import java.util.Arrays;
import java.util.Date;

public class UsoPersona {
    public static void main(String[] args) {

        /*
        Empleados Juan = new Empleados("Juan",new Date(2007,5,6),2500);

        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());

        Jefes Ana = new Jefes("Ana", new Date(2020,8,3),2000);
        Ana.setCargo("Directora comercial");
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion() + Ana.getCargo());

        Alumnos Maria = new Alumnos("Maria","Dibujo","Aula 5");
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());

        Jefes David = new Jefes("David",new Date(2023,1,6),5000);
        David.setCargo("Director de RR.HH.");
        System.out.println(David.getNombre());
        System.out.println(David.getDescripcion() + David.getCargo());

         */

        Empleados losEmpleados[]=new Empleados[5];
        losEmpleados[0]=new Empleados("Juan",new Date(6456546),2500);
        losEmpleados[1]=new Empleados("Maria",new Date(6456546),1500);
        losEmpleados[2]=new Empleados("Ana",new Date(6456546),3500);
        losEmpleados[3]=new Empleados("Sandra",new Date(6456546),6000);
        losEmpleados[4]=new Empleados("Antonio",new Date(6456546),2100);

        Arrays.sort(losEmpleados);

        for(Empleados e:losEmpleados){
            System.out.println(e.getDescripcion());
        }

        Jefes Manuel = new Jefes("Manuel", new Date(54654),5000);
        Empleados Sonia = new Empleados("Sonia", new Date(654654),3000);

        System.out.println("El trabajador " + Manuel.getNombre()+" tiene un bonus de " + Manuel.setBonus(500));
        System.out.println("El trabajador " + Sonia.getNombre()+" tiene un bonus de " + Sonia.setBonus(500));


    }
}
