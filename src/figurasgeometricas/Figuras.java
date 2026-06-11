/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public abstract class Figuras {
    

    public double getArea() {
        return calcularArea();
    }

    public double getPerimetro() {
        return calcularPerimetro();
    }

    public Figuras() {
    }
    
    protected abstract double calcularPerimetro();
    protected abstract double calcularArea();
}

