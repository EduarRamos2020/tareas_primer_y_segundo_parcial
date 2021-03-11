
import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class TareaModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo=new Circulo();
        Linea linea=new Linea();
        Cuadrado cuadrado=new Cuadrado();
        Triangulo triangulo=new Triangulo();
        
        
       circulo.imprimirInfo();
       linea.imprimirInfo();
       cuadrado.imprimirInfo();
       triangulo.imprimirInfo();
    }
    
    
}
