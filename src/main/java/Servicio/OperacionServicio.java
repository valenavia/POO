/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circunferencia;
import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author valenavia
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion CrearOperacion() {
        //Constructor sin parametros
        Operacion OperacionCompleta = new Operacion();
        System.out.println("Ingrese el numero 1");
        OperacionCompleta.setNumero1(leer.nextInt());
        System.out.println("Ingrese el numero 2");
        OperacionCompleta.setNumero2(leer.nextInt());

        //Constructor con parametros
        /*System.out.println("Ingrese el numero 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        int numero2 = leer.nextInt();
        Operacion OperacionCompleta = new Operacion(numero1, numero2);*/

        return OperacionCompleta;

    }

    public int suma(Operacion suma) {
        int resultado = suma.getNumero1() + suma.getNumero2();
            return resultado;
    }

    public int resta(Operacion resta) {
        int resultado = resta.getNumero1() - resta.getNumero2();
        return resultado;
    }

    public int multiplicacion(Operacion multiplicacion) {
        if (multiplicacion.getNumero1() == 0 || multiplicacion.getNumero2() == 0) {
            System.out.println("Error.");
            return 0;
        } else {
            int resultado = multiplicacion.getNumero1() * multiplicacion.getNumero2();
            return resultado;
        }
    }
    
    public double division(Operacion division){
        if(division.getNumero1() == 0 || division.getNumero2() == 0){
            System.out.println("Error.");
            return 0;
        } else {
            double resultado = (double)division.getNumero1()/division.getNumero2();
            return resultado;
        }
    }
}
