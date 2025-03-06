/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

/**
 *
 * @author rendo
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("LA EDAD DEBE SER UN VALOR POSITIVO");
        }
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("EL SALARIO NO PUEDE SER NEGATIVO");
        }
    }
    public void mostrarInformacion() {
        System.out.println("EMPLEADO: " + nombre + " / EDAD: " + edad + " / SALARIO: L." + salario);
    }
}