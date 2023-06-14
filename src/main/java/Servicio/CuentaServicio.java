/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author valenavia
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta CrearCuenta(){
        Cuenta cuenta = new Cuenta();// Ojo crear constructor vacio
        System.out.println("Ingrese el numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta.setDni(leer.nextLong());
        cuenta.setSaldoActual(1500);
        return cuenta;
    }
    
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public void ingreso(Cuenta cuenta, double ingreso){
        double saldoActual = (cuenta.getSaldoActual() + ingreso);
        cuenta.setSaldoActual(saldoActual);
    }
    
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    public void retirar(Cuenta cuenta, double retiro){
        double saldoActual = cuenta.getSaldoActual();
        if(cuenta.getSaldoActual()< retiro){
            cuenta.setSaldoActual(0);
        }else{
            saldoActual = (cuenta.getSaldoActual() - retiro);
        }
        cuenta.setSaldoActual(saldoActual);
    }
    
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public void extraccionRapida(Cuenta cuenta, double extraccion){
        double limite = cuenta.getSaldoActual()*0.2;
        double saldoActual = cuenta.getSaldoActual();
        
        if(extraccion < limite){
           saldoActual = (cuenta.getSaldoActual() - extraccion);
        }else{
            System.out.println("Error. No puede retirar un monto mayor al 20%");
        }
        cuenta.setSaldoActual(saldoActual);
    }
    
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    
    public void consultaSaldo(Cuenta cuenta){
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("El saldo disponible en su cuenta es de $" + saldoActual);
    } 
    
    //numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    public void consultarDatos(Cuenta cuenta){
        int numeroCuenta = cuenta.getNumeroCuenta();
        long dni = cuenta.getDni();
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("DNI: " + dni);
        System.out.println("Su saldo actual es de: $" + saldoActual);
    }
    
    public void menu(Cuenta cuenta){
        int opcion = 0;
        double monto;
        while (opcion != 6) {
            System.out.println("Opciones disponibles:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Realizar extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
            case 1: 
                System.out.println("Ingrese el monto");
                monto = leer.nextDouble();
                ingreso(cuenta, monto);
                break;
            case 2:
                System.out.println("Ingrese el monto a retirar");
                monto = leer.nextDouble();
                retirar(cuenta, monto);
                break;
            case 3:
                System.out.println("Ingrese el monto de extraccion rapida");
                monto = leer.nextDouble();
                extraccionRapida(cuenta, monto);
                break;
            case 4: 
                consultaSaldo(cuenta);
                break;
            case 5:
                consultarDatos(cuenta);
                break;
            case 6:
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
        
}
}
