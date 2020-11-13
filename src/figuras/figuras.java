/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Win10
 */
public class figuras {

    public static void main(String[] args) {

        //figura 1
        for (int i = 0; i < 1; i++) {
            for (int n = 0; n < 5; n++) {
                System.out.print("-");
            }
            System.out.println(">\n");
        }

        //figura 2   
        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 5; n++) {
                System.out.print("-");
            }
            System.out.print(">\n");
        }

        //figura 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //figura 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //figura 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || j == (6 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //figura 6
        for (int i = 0; i < 5; i++) {

            for (int n = 0; n < 5; n++) {
                if ((i == 0) || (i == n) || (i == 5 - 1) || (n == 0) || (n == 5 - 1) || (n == 5 - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
