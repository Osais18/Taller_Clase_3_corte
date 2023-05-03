/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.taller_herencia_en_clase;

import java.util.Scanner;

/**
 *
 * @author Osais
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Empleado obj = new Empleado ( "pedro", 5.0000);
       
        System.out.println( obj.toString());

        
    }
    
}
