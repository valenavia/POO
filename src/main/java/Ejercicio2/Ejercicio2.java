package Ejercicio2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author valenavia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo el objeto del tipo CircunferenciaServicio
        CircunferenciaServicio CS = new CircunferenciaServicio();
        Circunferencia circulo = CS.crearCircunferencia();
        CS.area(circulo);
        CS.perimetro(circulo);
    }
    
}
