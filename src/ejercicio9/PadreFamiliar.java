/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Win10
 */
public class PadreFamiliar {

    
    String nombre;
    String apellidos;
    int edad;

    /*
    public void regañar (){
    if(calificacion < 2,5){
    System.out.println("Le falta estudiar mas, pongale ganas");
    } 
    else{
    System.out.println("Muy bien siga asi");        
    }
    }
     */
    public PadreFamiliar(){
    }

    public PadreFamiliar(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PadreFamiliar{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
    
}
