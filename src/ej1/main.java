/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author usuario
 */
public class main {
    public static void main(String[] args){
        Universo universo = new Universo();
        universo.addPersona("m","Padre",0);
        universo.addPersona("femeninuo","Hijo 1",1);
        universo.addPersona("masculino","Hijo 2",1);
        Persona aa = universo.getPersona(0);
        Persona[] pd = {aa};
        aa.addHijo(universo.getPersona(1));
        aa.addHijo(universo.getPersona(2));
        universo.getPersona(1).setPadres(pd);
        universo.getPersona(2).setPadres(pd);
        universo.listarPersonas();
        int ax = universo.hijas();
        System.out.println(ax);
    }
    
}
