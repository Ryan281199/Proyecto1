/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejericio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int num1;
    int num2;
    int respuesta;
    
    System.out.println("Digite el numero para la opcion que quiere realizar\n"
            + "1 para sumar\n"
            + "2 para restar\n"
            + "3 para multiplicar\n"
            + "4 para dividir");
    respuesta = entrada.nextInt();
    
        switch (respuesta) {
            case 1:
                System.out.println("Digite los 2 numeros que quiere sumar");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                System.out.println("El resultado es: " +(num1 + num2));
                break;
            case 2:
                System.out.println("Digite los 2 numeros que quiere restar");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                System.out.println("El resultado es: " +(num1 - num2));
                break;
            case 3:
                System.out.println("Digite los 2 numeros que quiere multiplicar");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                System.out.println("El resultado es: " +(num1 * num2));
                break;
            case 4:
                System.out.println("Digite los 2 numeros que quiere dividir");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                System.out.println("El resultado es: " +(num1 / num2));
                break;
            default:
                break;
        }
    }
    
}
