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
public final class Gato extends Domestico implements Menu{
    private String codigo;

    public Gato(String especie, String fechaNac, int edad, String color) {
        super(especie, fechaNac, edad, color);
    }

    public Gato(String codigo, String nombre, double peso, String raza, String pelaje, String especie, String fechaNac, int edad, String color) {
        super(nombre, peso, raza, pelaje, especie, fechaNac, edad, color);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Gato{" + "codigo=" + codigo + '}'+super.toString();
    }
     public void codigos(){
    
        System.out.println("codigo de los animales");
    } 
    
    public void agregarAnimal(){
    
        System.out.println("agrgar animales");
    }
    
    public void nombres(){
    
        System.out.println("nombres animales");
    }

    @Override
    public String imprimir() {
       return "imprimir datos del gato";
    }

    @Override
    public String modificar() {
        return "modificar datos del gato";
    }

    @Override
    public String domesticos() {
        return "clase domesticos";
    }

    
    
    
    
}
