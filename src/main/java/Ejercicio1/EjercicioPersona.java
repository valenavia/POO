/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import Entidad.Persona;
import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author valenavia
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P1 = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        P1.setNombre(leer.nextLine());
        Persona P2 = new Persona("Vale", "Navia", 1.56, 27);
        System.out.println(P1.getNombre() + " " + P2.getNombre());
    }
    
}
