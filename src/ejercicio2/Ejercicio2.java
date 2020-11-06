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

    public int resta(int var1, int var2) {
        int resultado;
        resultado = var1 - var2;
        return resultado;
    }

    public int division(int var1, int var2) {
        int resultado;
        resultado = var1 / var2;
        return resultado;
    }

    public int sumar(int var1, int var2) {
        int resultado;
        resultado = var1 + var2;
        return resultado;

    }

    public int multiplicar(int var1, int var2) {
        int resultado;
        resultado = var1 * var2;
        return resultado;
    }

    public int promedio(int num1, int num2) {
        int resultado = (num1 + num2) / 2;
        return resultado;
    }

    public int factorial(int num1) {

        int factorial = 1;
        while (num1 != 0) {
            factorial *= num1;
            num1--;
        }
        return factorial;
    }

    public int invertir(int num) {

        int inve = 0, divi;
        while (num > 0) {
            divi = num % 10;
            inve = inve * 10 + divi;
            num /= 10;
        }
        return inve;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ejercicio2 calculadora = new Ejercicio2();
        Scanner entrada = new Scanner(System.in);

        int respuesta;
        int num1;
        int num2;
        double media = 0.0;

        System.out.println("Digite el numero que quiere para realizar la accion\n"
                + "1 para sumar\n"
                + "2 para restar\n"
                + "3 para multiplicar\n"
                + "4 para dividir\n"
                + "5 para calcular un promedio\n"
                + "6 para calcular un promedio digitando varios numeros\n"
                + "7 para calcular el factorial de un numero\n"
                + "8 para buscar el numero maximo de varios digitos\n"
                + "9 para invertir el orden de los numeros\n"
                + "10 para reordenar una lista de numeros en forma aleatoria");
        respuesta = entrada.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("Digite el primer numero de la suma: ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segundo numero de la suma: ");
                num2 = entrada.nextInt();
                int sum = calculadora.sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + sum);
                break;
            case 2:
                System.out.println("Digite el primer numero de la resta: ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segundo numero de la resta: ");
                num2 = entrada.nextInt();
                int res = calculadora.resta(num1, num2);
                System.out.println("El resultado de la resta es: " + res);
                break;
            case 3:
                System.out.println("Digite el primer numero de la multiplicacion: ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segundo numero de la multiplicacion: ");
                num2 = entrada.nextInt();
                int mul = calculadora.multiplicar(num1, num2);
                System.out.println("El resultado de la suma es: " + mul);
                break;
            case 4:
                System.out.println("Digite el primer numero de la division: ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segundo numero de la division: ");
                num2 = entrada.nextInt();
                int div = calculadora.division(num1, num2);
                System.out.println("El resultado de la suma es: " + div);
                break;
            case 5:
                System.out.println("Digite los 2 numeros para sacar el promedio");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                int promedio = calculadora.promedio(num1, num2);
                System.out.println("El promedio es:" + promedio);
                break;
            case 6:
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
                break;
            case 7:
                System.out.println("Digite el numero que le quiere sacar factorial: ");
                num1 = entrada.nextInt();
                int fac = calculadora.factorial(num1);
                System.out.println("El factorial de: " + num1 + " es " + fac);
                break;
            case 8:
                System.out.println("Digite 2 numeros: ");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                int resultado = Math.max(num1, num2);
                System.out.println("El maximo es: " + resultado);
                break;
            case 9:
                System.out.println("Digite el numero que quiere invertir: ");
                num1 = entrada.nextInt();
                int inve = calculadora.invertir(num1);
                System.out.println("El numero invertido de: " + num1 + " es " + inve);
                break;
            case 10:
                break;
        }

    }

}
