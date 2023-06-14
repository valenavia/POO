package Entidad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valenavia
 */
public class Circunferencia {

    private double radio;
    
    //Constructor con parametro
    public Circunferencia (double radio) {
        this.radio = radio;
    }
    
    //Constructor sin parametro
    public Circunferencia(){}
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
