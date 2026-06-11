/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author Usuario
 */
public class TrianguloIsoceles extends triangulo{
    
    public TrianguloIsoceles(double ladoAB, double ladoC){
        super(ladoAB,ladoAB,ladoC);
    }
    
    @Override
    protected double calcularArea(){
        return ladoC*(Math.sqrt(4*Math.pow(ladoA,2)-Math.pow(ladoC,2))/4);
    }
    
        @Override
    public String toString() {
        return "TrianguloIsocele{" + 
                "\nLadoAB: "+ ladoA+
                "\nLadoC: "+ ladoC+
                "\nPerimetro: "+ getPerimetro()+
                "\nArea: "+ getArea()+
                "\n";
    }
}
