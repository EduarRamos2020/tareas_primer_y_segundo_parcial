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
public class Ingeniero {
    
    private String name;
    private String apellido;
    private int edad;
    private String identidad;
    
    public Ingeniero(){
        
}
    
    public Ingeniero(String name,String apellido, int edad, String identidad){
        this.setname(name);
        this.setapellido(apellido);
        this.setedad(edad);
        this.setidentidad(identidad);
    }
    
    public String getname(){
        
        return name;
        }
    
    public String getapellido(){
        return apellido;
        
    }
    
    public int getedad(){
        return edad;
        
    }
    
    public String getidentidad(){
        return identidad;
        
    }
    
    public void setname (String _name){
        this.name=_name;
    }
    
     public void setapellido (String _apellido){
        this.apellido=_apellido;
    }
   
     public void setedad (int _edad){
         this.edad=_edad;
         
     }
     
      public void setidentidad (String _identidad){
         this.identidad=_identidad;
      }
      
}


