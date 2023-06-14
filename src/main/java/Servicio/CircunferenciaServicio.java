/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author valenavia
 */
public class CircunferenciaServicio {
        Scanner leer = new Scanner(System.in);
        
        //metodo para crear la circunferencia
        public Circunferencia crearCircunferencia(){
            Circunferencia circuCompleto = new Circunferencia();
            System.out.println("Ingrese el radio");
            circuCompleto.setRadio(leer.nextDouble());
          
        return circuCompleto;
        } 
        
        public void area(Circunferencia circuObject) {
            double area = 3.14 * (circuObject.getRadio() * circuObject.getRadio());
            System.out.println("El area de la circunferencia es " + area);  
        }
        
        public void perimetro(Circunferencia circuPeri) {
            double perimetro = 2 * 3.14 * circuPeri.getRadio();
            System.out.println("El perimetro de la circunferencia es " + perimetro);
        }
}
