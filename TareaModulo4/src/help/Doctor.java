/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

/**
 *
 * @author Pc
 */
public class Doctor {
    private String nombre;
    private String edad;
    private String identidad;
    private String experiencia;
    private String carnet;
    
    public Doctor (String nombre, String edad, String identidad,String experiencia,String carnet){
        
        this.nombre=nombre;
        this.edad=edad;
        this.experiencia=experiencia;
        this.carnet=carnet;
        this.identidad=identidad;
        
      
        
        System.out.println( nombre);
    }
    
      
      
        
     
       
       public void setnombre(String _nombre){
           this.nombre=_nombre;
              
       }
       
       public String getnombre(){
           return nombre;
       }
     
      
       
       
       
       public void setedad(String _edad){
           this.edad=_edad;
       }
       public String getedad(){
           return edad;
       }
      
       
       
       
       public void setexperiencia(String _experiencia){
           this.experiencia=_experiencia;
       }
       public String getexperiencia(){
           return experiencia;
       }
       
       
       
       
       public void setcarnet(String _carnet){
           this.carnet=_carnet;
           
       }
       public String getcarnet(){
           return carnet;
       }
       
       
       
       
       public void setidentidad(String _identidad){
           this.identidad=_identidad;
       }
       public String getidentidad(){
           return identidad;
           }
       
           
    
}
