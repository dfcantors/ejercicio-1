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
class Universo {

    public Universo() {
        this.personas = new ArrayList<>();
    }
    
    public Boolean addPersona(String genero,String nombre, int numero_de_padres){
        return this.personas.add(new Persona(genero,nombre, numero_de_padres));
    }
    
    public Persona getPersona(int a){
        return personas.get(a);
    }
    
    public void listarPersonas(){
        for (Persona persona: personas) {
            if(persona.getHijos().size() == 0 && persona.getPadres().length == 0) {
                System.out.println(persona.toString());
            }
            else if(persona.getHijos().size() > 0 && persona.getPadres().length == 0){
                System.out.print(persona.toString() + " {Padres = No tiene, " + "Hijos = ");
                persona.toStringHijos();
                System.out.println("}"); 
            }
            else if(persona.getHijos().size() == 0 && persona.getPadres().length > 0){
                System.out.print(persona.toString() + " {Padres = ");
                persona.toStringPadres();
                System.out.println("," + " Hijos = No tiene " + "}"); 
            }
            else{
                 System.out.print(persona.toString() + " {Padres = ");
                persona.toStringPadres();
                System.out.println("," + " Hijos = ");
                persona.toStringHijos();
                System.out.print("}"); 
            }
        }
    }
    
    public int hijas(){
        int r = 0;
        for (Persona persona:personas) {
            if (persona.getHijos().size() > 0) {
                for (Persona hijo: persona.getHijos()) {
                    if (hijo.getGenero().equalsIgnoreCase("femenino")) {
                        r++;
                    } 
                }
            }
        }
        return r;
    }
    private ArrayList<Persona> personas;
}
