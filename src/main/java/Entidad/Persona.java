/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author valenavia
 */
public class Persona {

//Atributos
    public String nombre;
    public String apellido;
    public double altura;
    public int edad;

//Constructor con parametro
public Persona (String nombre, String apellido, double altura, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.altura = altura;
    this.edad = edad;
}

//Constructor con parametro
public Persona(){};
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}