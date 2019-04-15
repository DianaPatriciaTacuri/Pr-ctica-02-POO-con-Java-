/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author one
 */
public class Animal {
    private String especie;
    private String fechaNac;
    private int edad;
    private String color;

    public Animal() {
    }
    public Animal(String especie, String fechaNac, int edad, String color) {
        this.especie = especie;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", fechaNac=" + fechaNac + ", edad=" + edad + ", color=" + color + '}';
    }
    
     public void especies(){
    
        System.out.println("especie de animales");
    }
    
    public void edad(){
    
        System.out.println("edad de los animales");
    }
    
    public void fechaNacimiento(){
    
        System.out.println("fecha de nacimiento de los animales ");
    }
}
