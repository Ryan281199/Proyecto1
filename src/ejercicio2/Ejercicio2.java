/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio2 {

    public int promedio(int var1, int var2) {
        int resultado = (var1 + var2) / 2;
        return resultado;
    }

    public int[] reordenar (int[] numeros){
    int [] resultado = new int [numeros.length];
    
    return resultado;
    }
    
    
    /*
    public int promedio2 (int [] prom){
    int [] notas = {};
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ejercicio2 calculadora = new Ejercicio2();
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        double media = 0.0;

        System.out.println("Digite los 2 numeros para sacar el promedio");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        int promedio = calculadora.promedio(num1, num2);
        System.out.println("El promedio es:" + promedio);

        int nElementos;
        System.out.println("Digite la cantidad de numeros que quiere para sacar el promedio");
        nElementos = entrada.nextInt();
        int prom[] = new int[nElementos];

        System.out.println("Digite los numeros para sacar el promedio");
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite el numero: ");
            prom[i] = entrada.nextInt();
        }

        System.out.println("Los numeros que digito son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(prom[i] + " ");
        }

        for (int i = 0; i < nElementos; i++) {
            media = media + prom[i];
        }
        System.out.println();
        System.out.println("El promedio es: " + media / prom.length);

        System.out.println("Ingrese el numero ");
        int numero = entrada.nextInt();

        int factorial = 1;

        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("El factorial es " + factorial);

        int var1;
        int var2;
        System.out.println("Digite 2 numeros: ");
        var1 = entrada.nextInt();
        var2 = entrada.nextInt();
        int resultado = Math.max(var1, var2);
        System.out.println("El maximo es: " + resultado);

        int num, invertir = 0, divi;
        System.out.println("Ingrese el numero ");
        num = entrada.nextInt();
        while (num > 0) {
            divi = num % 10;
            invertir = invertir * 10 + divi;
            num /= 10;
        }
        System.out.println("El numero invertido es " + invertir);
    }

}
