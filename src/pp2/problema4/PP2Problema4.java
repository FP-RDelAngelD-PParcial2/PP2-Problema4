/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema4;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          muestraResultado(convertirFahrenheit());
    }
    public static double solicitarDatos(String d){ //Solicita datos
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static double convertirFahrenheit(){
        double a = solicitarDatos("grados Celsius para convertir a Fahrenheit" + "\n");
        return (a*9/5)+32;
    }
    public static void muestraResultado(double a){
        System.out.print("El resultado es " + a);
    }
    
    
}
