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
public class Triangulo extends Formas{
    
    private String Angulo;
    private String area;
    
    public void calcularArea(String area){
        this.area=area;
            
}
    public String obtenerArea(){
        return this.area;
}
    
    public Triangulo(){
    establerArea ("el area es de 14 cm");
    dibujar("Triangulo");
        
}
}
