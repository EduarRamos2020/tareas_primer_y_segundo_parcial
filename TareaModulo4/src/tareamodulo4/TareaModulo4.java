/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo4;

import help.Doctor;
import help.España;
import help.Honduras;
import help.Mexico;

/**
 *
 * @author Pc
 */
public class TareaModulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Doctor doctor= new Doctor("Eduar Ramos","26 años","1012141244","10 años","0012");
        
      Honduras hn = new Honduras();
        España esp= new España();
        Mexico mx = new Mexico();
        
        
        doctor.setnombre("Eduar Ramos");
        doctor.setedad("26");
        doctor.setidentidad("1002199512365");
        doctor.setexperiencia("12 años");
        doctor.setcarnet("0012");
        
        
         
        
        
        System.out.println("nombre:"+doctor.getnombre());
        System.out.println("edad:"+doctor.getedad());
        System.out.println("identidad:"+doctor.getidentidad());
        System.out.println("años de experiencia:"+doctor.getexperiencia());
        System.out.println("# de carnet:"+doctor.getcarnet());
        System.out.println("-------------------------------------");
        
        
        System.out.println("HONDURAS");
        System.out.println(hn.getpais());
        System.out.println(hn.getdirector());
        System.out.println("-------------------------------------");
        
        System.out.println("MEXICO");
        System.out.println(mx.getpais());
        System.out.println(mx.getdirector());
        System.out.println("-------------------------------------");
        
        
        System.out.println("ESPAÑA");
        System.out.println(esp.getpais());
        System.out.println(esp.getdirector());
        
        
        
    }
    
    
        
        
    }
     
     
      
         
     



