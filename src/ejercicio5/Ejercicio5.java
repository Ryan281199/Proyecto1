/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Win10
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int count = 50;
        double pi = 0;
        double denominator = 3;

        for (int x = 0; x <= count; x++) {

            if (x % 2 == 0) {
                pi = pi + (4 / denominator);
            } else {
                pi = pi - (4 / denominator);
            }
            denominator = denominator + 2;
        }
        pi = pi * 4;
        System.out.println(pi);

    }

}
