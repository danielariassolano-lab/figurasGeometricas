/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulos;

import figurasgeometricas.Figuras;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figuras {
    private double radio;
    private static final double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    private double calcularDiametro(){
        return radio * 2;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    protected double calcularPerimetro(){
    return 2*Circulo.PI*radio;
    }
    
    @Override
    protected double calcularArea(){
      return  Math.pow(radio,2)*Circulo.PI;

    }
    @Override
    public String toString() {
        return "Circulo: " + "\nradio:"+this.radio+"\nPerimetro:"+this.getPerimetro()+
                "\nArea:"+this.getArea()+"\nDiametro"+getDiametro();
    }    
   
}
