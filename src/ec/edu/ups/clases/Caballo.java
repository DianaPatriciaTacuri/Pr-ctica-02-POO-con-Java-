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
public final class Caballo extends Hervivero{
    private int codigo;

    public Caballo(String nombre, String pelaje, double peso, String especie, Date fechaNac, int edad, String color) {
        super(nombre, pelaje, peso, especie, fechaNac, edad, color);
    }

    public Caballo(int codigo, String nombre, String pelaje, double peso, String especie, Date fechaNac, int edad, String color) {
        super(nombre, pelaje, peso, especie, fechaNac, edad, color);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Caballo{" + "codigo=" + codigo + '}';
    }
     public void codigos(){
    
        System.out.println("godigo animales  hervivoros");
    } 
    
    public void edades(){
    
        System.out.println("edades de los animales");
    }
    
    public void pesos(){
    
        System.out.println("peso");
    }

    /*@Override
    public String imprimir() {
       return "imprimiendo informacion de la clase auto";
    }

    @Override
    public String modificar() {
        return "modificando informacion de la clase auto";
    }*/

    @Override
    public String llamado() {
        return "llamado de la clase auto"; 
    }
    
    
    
}
