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
    
    public int Area(Rectangulo NuevoRectangulo){
        int area = NuevoRectangulo.getBase() * NuevoRectangulo.getAltura();
        return area;
    }
    
    public int Perimetro(Rectangulo NuevoRectangulo){
        int perimetro = (NuevoRectangulo.getBase() + NuevoRectangulo.getAltura()) * 2;
        return perimetro;
    }
    
    public void DibujarRectangulo(Rectangulo NuevoRectangulo){
        for (int i = 0; i < NuevoRectangulo.getAltura(); i++) {
            for (int j = 0; j < NuevoRectangulo.getBase(); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
