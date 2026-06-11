/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrados;


/**
 *
 * @author Usuario
 */
public class caudrado extends rectangulo{
   //Metodo constructor..
    public caudrado(double lado) {
        super(lado,lado);
    }
    
    //Metodos de operacioón...
    protected double calcularPerimetro(){
        return altura*4;
    }
    protected double calcularArea(){
        return Math.pow(base,2);
    }
    
    //Metodo ToString
    @Override
    public String toString() {
        return "Cuadrado" +"\nLado:"+base+"\nPerimetro:"
                +getPerimetro()+"\nArea:"+getArea();
    }
}
