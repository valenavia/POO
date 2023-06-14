/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author valenavia
 */
public class RectanguloServicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo CrearRectangulo(){
        Rectangulo NuevoRectangulo = new Rectangulo();
        System.out.println("Ingrese la base");
        NuevoRectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura");
        NuevoRectangulo.setAltura(leer.nextInt());       
        
        return NuevoRectangulo;
    }
    
    
}
