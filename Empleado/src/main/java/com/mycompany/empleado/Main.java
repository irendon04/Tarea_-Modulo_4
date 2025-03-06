/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;
import java.util.Scanner;
/**
 *
 * @author rendo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
        int opcion;

        do {
            System.out.println("\n **SISTEMA DE GESTION DE EMPLEADOS**");
            System.out.println("1-AGREGAR EMPLEADO");
            System.out.println("2-MOSTRAR EMPLEADOS");
            System.out.println("3-SALIR");
            System.out.print("SELECCIONA UNA OPCION: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("INGRESE EL NOMBRE DEL EMPLEADO: ");
                    String nombre = scanner.nextLine();
                    System.out.print("INGRESE LA EDAD DEL EMPLEADO: ");
                    int edad = scanner.nextInt();
                    System.out.print("INGRESE EL SALARIO DEL EMPLEADO: ");
                    double salario = scanner.nextDouble();
                    Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(nuevoEmpleado);
                    break;

                case 2:
                    gestor.mostrarEmpleados();
                    break;

                case 3:
                    System.out.println("...SALIENDO DEL SISTEMA...");
                    break;

                default:
                    System.out.println("OPCION NO VALIDA. INTENTELO DE NUEVO.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}

