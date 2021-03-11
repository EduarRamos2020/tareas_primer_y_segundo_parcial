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
public class Formas {
    
    private String color;
    private String dibujar;
     private String Area;
    public Formas(){
        
}
    
    public void establerArea(String area){
        this.Area=area;
            
}
    public String obtenerArea(){
        return this.Area;
    }
    
    
    
    
    
    public void establecercolor(String color){
        this.color=color;
            
}
    public String obtenercolor(){
        return this.color;
    }
    
      public void dibujar(String dibujar){
        this.dibujar=dibujar;
            
}
       public String obtenerdibujar(){
           return this.dibujar;
       }
       
       public void imprimirInfo(){
           System.out.println(dibujar);
          
           System.out.println(Area);
       }
}
           
       
        
        
    

