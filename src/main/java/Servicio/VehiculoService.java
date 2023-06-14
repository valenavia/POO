/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author valenavia
 */
public class VehiculoService {
    
        Scanner leer = new Scanner(System.in);
        
        public Vehiculo CrearVehiculo(){
            Vehiculo vehiculoNuevo = new Vehiculo();
            //System.out.println("Ingrese la marca");
            //vehiculoNuevo.setMarca(leer.nextLine());
            //System.out.println("Ingrese el modelo");
            //vehiculoNuevo.setModelo(leer.nextLine());
            //System.out.println("Ingrese el anio");
            //vehiculoNuevo.setAnio(leer.nextInt());
            System.out.println("Ingrese el tipo de vehiculo");
            vehiculoNuevo.setTipo(leer.next());
            
            return vehiculoNuevo;
        }
        
        //Cuanto avanza el vehiculo por segundo
        public int Moverse(Vehiculo obj){
            int velocidad = 0;
            if(obj.getTipo().equalsIgnoreCase("automovil")){
                velocidad = 3;
            }else if (obj.getTipo().equalsIgnoreCase("motocicleta")){
                velocidad = 2;
            }else{
                velocidad = 1;
            }
            
            return velocidad;
        }
        
        public int Frenar (Vehiculo obj){
            int metros = 0;
            if(obj.getTipo().equalsIgnoreCase("automovil") || 
               obj.getTipo().equalsIgnoreCase("motocicleta")){
                metros = 2;   
            }
            return metros;
        }
        
        public int CalculoDistancia(int velocidad, int metros, int tiempo){
            int distanciaFinal = (velocidad * tiempo) + metros;
            return distanciaFinal;
        }
        
        public void VehiculoMasLejos(Vehiculo obj1, Vehiculo obj2, Vehiculo obj3){
            if(obj1.getDistanciFinal() > obj2.getDistanciFinal() && obj1.getDistanciFinal() > obj3.getDistanciFinal()){
                System.out.println("El " + obj1.getTipo() + " es el vehiculo que llego mas lejos");
            }else if (obj2.getDistanciFinal() > obj3.getDistanciFinal()){
                System.out.println("El " + obj2.getTipo() + " es el vehiculo que llego mas lejos");
            }else{
                System.out.println("El " + obj3.getTipo() + " es el vehiculo que llego mas lejos");
            }
        }
}
