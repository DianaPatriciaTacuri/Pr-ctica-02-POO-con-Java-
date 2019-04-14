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
public class Gato extends Domestico{
    private String codigo;

    public Gato(String especie, Date fechaNac, int edad, String color) {
        super(especie, fechaNac, edad, color);
    }

    public Gato(String codigo, String nombre, double peso, String raza, String pelaje, String especie, Date fechaNac, int edad, String color) {
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
        return "Gato{" + "codigo=" + codigo + '}';
    }
    
    
    
    
}