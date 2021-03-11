/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclaseprincipal;

/**
 *
 * @author Pc
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola soy de la clase de Programacion Orientada a Objetos");
        
        
       Ingeniero ingeniero=new Ingeniero();
       
       ingeniero.setname("Eduar");
       ingeniero.setapellido("RAMOS");
       ingeniero.setedad(26);
       ingeniero.setidentidad("0502199501433");
       
       
       System.out.println("el nombre del Ingeniero es:"+ingeniero.getname());
       System.out.println("el apellido del Ingeniero es:"+ingeniero.getapellido());
       System.out.println("la edad del Ingeniero es:"+ingeniero.getedad());
       System.out.println("la identidad del Ingeniero es:"+ingeniero.getidentidad());
       
            
       
       
       
       
    }
    
    
}
