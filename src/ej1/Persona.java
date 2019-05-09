/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
class Persona {

    public Persona(String genero, String nombre, int numero_de_padres) {
        this.genero = genero;
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
        if (numero_de_padres >= 0 && numero_de_padres <=2) {
            this.padres = new Persona[numero_de_padres];
        }
    }

    public void setPadres(Persona[] padres) {
        this.padres = padres;
    }

    public Boolean addHijo(Persona persona) {
        return this.hijos.add(persona);
    }
    
    
    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona[] getPadres() {
        return padres;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + ", " + "Género = " + genero + '}';
    }    
    
    public void toStringHijos(){
        System.out.print("{ ");
        for (Persona persona: hijos) {
            System.out.print(persona.toString() + " ");
        }
        System.out.print("}");
    }
    public void toStringPadres(){
        System.out.print("{ ");
        for (Persona persona: padres) {
            System.out.print(persona.toString() + " ");
        }
        System.out.print("}");
    }
    private Persona[] padres; 
    private ArrayList<Persona> hijos;
    private String genero;
    private String nombre;
}
