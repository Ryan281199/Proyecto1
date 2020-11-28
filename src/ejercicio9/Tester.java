/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Tester {
  
        public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        SistemaNotas sistema = new SistemaNotas();
        PadreFamiliar pf = new PadreFamiliar("Randall", "Barrantes", 50);
        
        //Estudiante est = new Estudiante ("Ryan", "Barrantes Marin", 123456);
        //est.decirDatos();

        
        System.out.println("Digite el nombre del alumno: ");
        String nom = entrada.next();
        System.out.println("Digite el apellido del alumno: ");
        String ape = entrada.next();
        System.out.println("Digite el carne: ");
        int car = entrada.nextInt();

        Estudiante est = new Estudiante(nom, ape, car);

        System.out.println("Digite el porcentaje: ");
        int pC = entrada.nextInt();
        System.out.println("Digite puntos totales: ");
        int pT = entrada.nextInt();
        System.out.println("Digite puntos obtenidos: ");
        int pO = entrada.nextInt();

        Nota n = new Nota(est, pT, pO, pC);

        sistema.agregarQuizz(n);
        n.calcularNota();
        sistema.mostrarQuizzes();

        est.datosPadre();
                /*
        int respuesta;
        System.out.println("Digite el numero que quiere para la opcion:\n"
        + "1 para agregar datos\n" 
        + "2 para imprimir datos\n" 
        + "3 para saber si el estudiante aprobo o no");
        respuesta = entrada.nextInt();
        switch (respuesta) {
                case 1:
                System.out.println("Digite el nombre del alumno: ");
        String nom = entrada.next();
        System.out.println("Digite el apellido del alumno: ");
        String ape = entrada.next();
        System.out.println("Digite el carne: ");
        int car = entrada.nextInt();

        Estudiante est = new Estudiante(nom, ape, car);

        System.out.println("Digite el porcentaje: ");
        int pC = entrada.nextInt();
        System.out.println("Digite puntos totales: ");
        int pT = entrada.nextInt();
        System.out.println("Digite puntos obtenidos: ");
        int pO = entrada.nextInt();

        Nota n = new Nota(est, pT, pO, pC);
        sistema.agregarQuizz(n);
        n.calcularNota();
        break;
        case 2:
        est.decirDatos();
        sistema.mostrarQuizzes();
        break;
        case 3:
        
        
         */
        //Nota not = new Nota(20, 13, 5);
        //not.calcularNota();
        //not.cali();
        //not.getCalificacion();
    }

}
