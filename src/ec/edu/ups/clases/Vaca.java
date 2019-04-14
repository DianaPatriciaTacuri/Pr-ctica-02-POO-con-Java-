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
public final class Vaca extends Hervivero implements Menu{
    private int codigo;

    public Vaca(String nombre, String pelaje, double peso, String especie, Date fechaNac, int edad, String color) {
        super(nombre, pelaje, peso, especie, fechaNac, edad, color);
    }

    public Vaca(int codigo, String nombre, String pelaje, double peso, String especie, Date fechaNac, int edad, String color) {
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
        return "Vaca{" + "codigo=" + codigo + '}';
    }
     public void pelaje(){
    
        System.out.println("pelaje de la vaca");
    } 
    
    public void peso(){
    
        System.out.println("peso de la vaca");
    }
    
    public void edad(){
    
        System.out.println("edad de la vaca");
    }

    @Override
    public String imprimir() {
       return "imprimir datos de la vaca";
    }

    @Override
    public String modificar() {
        return "modificar datos de la vaca";
    }

    @Override
    public String llamado() {
        return "llamado de la clase auto"; 
    }
    
    
    
    
}
