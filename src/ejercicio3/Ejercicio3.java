/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Ejercicio3 {

    public double impuesto(double salario, int dependientes) {

        double resultado = 0;
        double desc = 0;
        
        if (salario >= 200000 && salario<400000) {
            resultado = salario * 10 / 100;
        } else if (salario >= 400000 && salario < 600000) {
            resultado = salario * 15 / 100;
        } else if (salario >= 600000 && salario < 800000) {
            resultado = salario * 20 / 100;
        } else if (salario >= 800000) {
            resultado = salario * 30 / 100;
        }
       
        if (dependientes==1){
        desc = resultado * 100 / 100;
        resultado = resultado - desc;
        }
        else if(dependientes==2){
        desc = resultado * 90 / 100;
        resultado = resultado - desc;
        }
        else if(dependientes==3){
        desc = resultado * 70 / 100;
        resultado = resultado - desc;
        }
        else if(dependientes==4){
        desc = resultado * 60 / 100;
        resultado = resultado - desc;
        }
        else if(dependientes>=5){
        desc = resultado * 40 / 100;
        resultado = resultado - desc;
        }
        return resultado;
    }

    public static void main(String[] args) {

    Ejercicio3 Imp = new Ejercicio3();
    Scanner entrada = new Scanner (System.in);
    
    int numDepe;
    double salario;
    
    System.out.println("Digite su salario: ");
    salario = entrada.nextDouble();
    
    System.out.println("Digite el numero de dependientes que usted tiene: ");
    numDepe = entrada.nextInt();
    
    double resul = Imp.impuesto(salario, numDepe);
    System.out.println("El impuesto a pagar es de:" +resul);
    }
}
