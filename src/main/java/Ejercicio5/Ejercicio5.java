/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;

/**
 *
 * @author valenavia
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio CS = new CuentaServicio();
        Cuenta nuevaCuenta = CS.CrearCuenta();
        
        CS.menu(nuevaCuenta);
        
    }
    
}
