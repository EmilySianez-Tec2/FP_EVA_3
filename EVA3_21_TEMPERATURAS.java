/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_temperaturas;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_21_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double centi = capturarTemp("Captura los grados centigrados");
        //Uso el valor, pero no lo guardo
        System.out.println(centi + "C° =" + convertirCaF(centi) + "F°");
        System.out.println(centi + "C° =" + convertirCaK(centi) + "K°");
        
        double fare = capturarTemp("Captura los grados fahrenheit");
         System.out.println(fare + "F° =" + convertirFaC(fare) + "C°");
         
              
    }
    public static double convertirCaF(double centi){
        double resu = centi * 1.8 +32;
        return resu;
           }
    public static double convertirFaC(double fare){
        double resu = (fare - 32) / 1.8;
        return resu;
        
    }
    public static double convertirCaK(double centi){
        double resu = centi + 273.5;
        return resu;
    }
    public static double capturarTemp(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = captu.nextDouble();
        return valor;
    }
}
