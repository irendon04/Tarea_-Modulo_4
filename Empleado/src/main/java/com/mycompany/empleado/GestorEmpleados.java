/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;
import java.util.ArrayList;
/**
 *
 * @author rendo
 */
public class GestorEmpleados {
    
    private ArrayList<Empleado> listaEmpleados;
    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("EMPLEADO AGREGADO EXITOSAMENTE");
    }
    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("NO HAY EMPLEADOS REGISTRADOS");
        } else {
            System.out.println("LISTA DE EMPLEADOS:");
            for (Empleado emp : listaEmpleados) {
                emp.mostrarInformacion();
            }
        }
    }
}
