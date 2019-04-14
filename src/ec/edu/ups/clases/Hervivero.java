/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author one
 */
public class Hervivero extends Animal{
    private String nombre;
    private int edad;
    private String pelaje;
    private double peso;

    public Hervivero(String especie, Date fechaNac, int edad, String color) {
        super(especie, fechaNac, edad, color);
    }

    public Hervivero(String nombre, String pelaje, double peso, String especie, Date fechaNac, int edad, String color) {
        super(especie, fechaNac, edad, color);
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.peso = peso;
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

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Hervivero{" + "nombre=" + nombre + ", edad=" + edad + ", pelaje=" + pelaje + ", peso=" + peso + '}';
    }
    
    
    
}