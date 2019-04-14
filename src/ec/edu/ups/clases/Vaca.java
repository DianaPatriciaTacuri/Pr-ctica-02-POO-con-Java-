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
public class Vaca extends Hervivero{
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
    
    
    
    
}