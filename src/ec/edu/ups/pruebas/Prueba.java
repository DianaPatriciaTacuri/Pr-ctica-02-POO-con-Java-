/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.*;

/**
 *
 * @author one
 */
public class Prueba {
    
     public static void main(String []args){
    
       Domestico domes=new Domestico() {
            @Override
            public String domesticos() {
                return "amigos del hombre";
            }
        };
        
        Hervivero her = new Hervivero() {
            @Override
            public String Herviveros() {
               return "comen hierva";
            }
        };
        Perro perro=new Perro("firulai", 12.2, "buldog", "lana", "domestico","1-4-2015", 3, "negro");
        Gato gato=new Gato("098", "garfil", 5.3, "gato persa", "esponjoso", "domestico", "2-3-2018", 3, "plomo");
        Caballo caballo=new Caballo(32, "blaco", "liso", 25.35, "hervivoro", "12-6-2015", 4, "blanco");
        Vaca vaca = new Vaca(12, "fany", "esponjoso", 45.89, "hervivero", "12-12-2012", 5, "negro con blanco");
        
        
        
        System.out.println(perro);
        System.out.println(gato);
        System.out.println(caballo);
        System.out.println(vaca);
        System.out.println(domes.domesticos());
        System.out.println(her.Herviveros());
     }
    
}
