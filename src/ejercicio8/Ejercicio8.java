/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int monto;
        int mone1000, mone500, mone100, mone10, mone5, mone1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el monto: ");
        monto = entrada.nextInt();

        mone1000 = monto / 1000;
        mone500 = (monto % 1000) / 500;
        mone100 = ((monto % 1000) % 500) / 100;
        mone10 = (((monto % 1000) % 500) % 100) / 10;
        mone5 = ((((monto % 1000) % 500) % 100) % 10) / 5;
        mone1 = (((((monto % 1000) % 500) % 100) % 10) % 5) / 1;

        System.out.println("Debe pagar con " + mone1000 + " monedas de mil\n"
                + mone500 + " monedas de 500\n"
                + mone100 + " monedas de 100\n"
                + mone10 + " monedas de 10\n"
                + mone5 + " monedas de 5\n"
                + mone1 + " monedas de 1");

    }
}
