/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Pc
 */
public class Circulo extends Formas{
     private String radio;
     
     
     public void calcularRadio(String radio){
        this.radio=radio;
            
}
    public String obtenerradio(){
        return this.radio;
    }
     
     
    public Circulo(){
        
        establerArea("el radio es de 26.4");
        dibujar("circulo");
     }
     
   
}

    
   
    
    

