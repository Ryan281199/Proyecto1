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
public class Estudiante {
    
    PadreFamiliar padre;
    String nombre;
    String apellido;
    int carnet;

    public Estudiante() {
    }   //instanciar sin enviar valor

    public Estudiante(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = cedula;
    }

    public Estudiante(PadreFamiliar padre) {
        this.padre = padre;
    }
    
    public void mencionarDatos() {      //public void autoregistro
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escriba sus apellidos: ");
        apellido = entrada.nextLine();
        System.out.println("Escriba su carnet: ");
        carnet = entrada.nextInt();
    }

    public void decirDatos() {
        System.out.println("Nombre: " + nombre + "\n"
                + "Apellidos: " + apellido + "\n"
                + "Carnet: " + carnet);
    }

    public void datosPadre(){
    System.out.println(padre.toString());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }

}
