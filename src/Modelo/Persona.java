/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author timoa
 */
public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private double sueldo;

    public Persona(String nombre, int edad, String cedula, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sueldo = sueldo;
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
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre +" "+edad+" "+sueldo;
    }
    
    
}
