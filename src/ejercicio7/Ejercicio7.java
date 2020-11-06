/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int base;
        int exponente;

        System.out.println("Digite el numero que quiere elevar: ");
        base = entrada.nextInt();
        System.out.println("Digite el valor al cual lo quiere elevar: ");
        exponente = entrada.nextInt();

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado es: " + resultado);
    }

}
