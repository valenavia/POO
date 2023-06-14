/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author valenavia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio OS = new OperacionServicio();
        Operacion OperacionesVarias = OS.CrearOperacion();
        int suma = OS.suma(OperacionesVarias);
        int resta = OS.resta(OperacionesVarias);
        int multiplicacion = OS.multiplicacion(OperacionesVarias);
        double division = OS.division(OperacionesVarias);
        System.out.println("La suma de tus numeros es: " + suma);
        System.out.println("La resta de tus numeros es: " + resta);
        System.out.println("La multiplicacion de tus numeros es: " + multiplicacion);
        System.out.println("La division de tus numeros es: " + division);
    }
    
}
