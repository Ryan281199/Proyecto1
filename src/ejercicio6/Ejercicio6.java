/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int respuesta = 0;
        double radio, lado, base, altura;
        double pi = Math.PI;

        while (respuesta != 4) {
            System.out.println("Digite el numero que quiere para la operacion:\n"
                    + "1 para calcular el area de un cuadrado\n"
                    + "2 para calcular el area de un rectangulo\n"
                    + "3 para calcular el area de un circulo\n"
                    + "4 para terminar");
            respuesta = entrada.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Digite el valor del lado del cuadrado: ");
                    lado = entrada.nextInt();
                    System.out.println("El area del cuadrado es: " + lado * lado);
                    break;
                case 2:
                    System.out.println("Digite el valor de la base del rectangulo: ");
                    base = entrada.nextInt();
                    System.out.println("Digite el valor de la altura del rectangulo: ");
                    altura = entrada.nextInt();
                    System.out.println("El area del rectangulo es: " + base * altura);
                    break;
                case 3:
                    System.out.println("Digite el radio del circulo: ");
                    radio = entrada.nextInt();
                    double area = pi * radio * radio;
                    System.out.println("El area del circulo es: " + area);
                default:
                    break;
            }
        }
    }
}
