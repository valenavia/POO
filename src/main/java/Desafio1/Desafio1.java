/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Desafio1;

import Entidad.Vehiculo;
import Servicio.VehiculoService;

/**
 *
 * @author valenavia
 */
public class Desafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Una vez realizado el programa, crear 3 vehículos diferentes 
        (entre todos elegir que tipo de vehículo es), y mostrar por pantalla 
        cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. 
        Luego mostrar que vehículo logró llegar más lejos luego de frenar, 
        tras avanzar durante 5 minutos, y cual fue la cantidad de metros que avanzó.*/
        
        VehiculoService vehiculoService = new VehiculoService();
        Vehiculo vehiculo1 = vehiculoService.CrearVehiculo();
        Vehiculo vehiculo2 = vehiculoService.CrearVehiculo();
        Vehiculo vehiculo3 = vehiculoService.CrearVehiculo();
        int tiempo = 5;
        
        vehiculo1.setDistanciFinal(vehiculoService.CalculoDistancia(vehiculoService.Moverse(vehiculo1), vehiculoService.Frenar(vehiculo1), tiempo));
        vehiculo2.setDistanciFinal(vehiculoService.CalculoDistancia(vehiculoService.Moverse(vehiculo2), vehiculoService.Frenar(vehiculo2), tiempo));
        vehiculo3.setDistanciFinal(vehiculoService.CalculoDistancia(vehiculoService.Moverse(vehiculo3), vehiculoService.Frenar(vehiculo3), tiempo));
        
        vehiculoService.VehiculoMasLejos(vehiculo1, vehiculo2, vehiculo3);
        System.out.println(vehiculo1.getTipo() + " avanzó " + vehiculo1.getDistanciFinal() + " metros.");
        System.out.println(vehiculo2.getTipo() + " avanzó " + vehiculo2.getDistanciFinal() + " metros.");
        System.out.println(vehiculo3.getTipo() + " avanzó " + vehiculo3.getDistanciFinal() + " metros.");
    }
    
}
