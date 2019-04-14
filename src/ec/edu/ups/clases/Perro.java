/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Menu;
import java.util.Date;

/**
 *
 * @author one
 */
public final class Perro  extends Domestico implements Menu{
    private int codigo;

    public Perro(String nombre, double peso, String raza, String pelaje, String especie, Date fechaNac, int edad, String color) {
        super(nombre, peso, raza, pelaje, especie, fechaNac, edad, color);
    }

    public Perro(int codigo, String nombre, double peso, String raza, String pelaje, String especie, Date fechaNac, int edad, String color) {
        super(nombre, peso, raza, pelaje, especie, fechaNac, edad, color);
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
        return "Perro{" + "codigo=" + codigo + '}';
    }
     public void razas(){
    
        System.out.println("razas de los perros");
    } 
    
    public void nombre(){
    
        System.out.println("nombre de los perros");
    }
    
    public void edad(){
    
        System.out.println("edad de los perros");
    }

    @Override
    public String imprimir() {
       return "imprimir datos del perro";
    }

    @Override
    public String modificar() {
        return "modificar datos del perro";
    }

    @Override
    public String llamado() {
        return "llamado de la clase auto"; 
    }
    
    
}
