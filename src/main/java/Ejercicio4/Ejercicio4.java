/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author valenavia
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio RS = new RectanguloServicio();
        Rectangulo nuevoRectangulo = RS.CrearRectangulo();
        int area = RS.Area(nuevoRectangulo);
        int perimetro = RS.Perimetro(nuevoRectangulo);
        System.out.println("El area de su rectangulo es: " + area);
        System.out.println("El perimetro de su rectangulo es: " + perimetro);
        RS.DibujarRectangulo(nuevoRectangulo);
    }
    
}
