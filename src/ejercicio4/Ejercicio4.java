/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int año;
    System.out.println("Ingrese el año: ");
    año = entrada.nextInt();
    
    if(año % 4==0 && año % 100 != 0 || año % 400 == 0){
    System.out.println("Es un año bisiesto");
    }
    else{
    System.out.println("No es un año bisiesto");
    }
    }
    
}
