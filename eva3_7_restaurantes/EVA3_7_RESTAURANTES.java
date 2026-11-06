/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurantes;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_7_RESTAURANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String[] opciones = {"Asada", "Tripas ", "Puerco", "Chichar", "Tacos","Montado", "Limonada", "Soda", "Agua","jamaica" };
        String[] precios = {"60.20", "100.00 ", "80.69", "56.99", "120.20","150.37", "25.10", "30.90", "15.80","20.80" };
        System.out.println("--------- MENU DEL MAÑANERO ----------");
        for (int i = 0; i < opciones.length; i++) {
            for (int j = 0; j < precios.length ; j++) {
             System.out.println("-" + opciones[i] + "--------" +precios[i]);    
            }
           
        }
        
    }
    
}
