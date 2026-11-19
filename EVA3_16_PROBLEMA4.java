/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema4;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_16_PROBLEMA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String[] nombres = {"Sofia", "Nataly", "Ron"};
        int[][] asistencia = new int[5][3];

        System.out.println("Tomare asistencia esta semana: 1- Asistió  0- No asistió");

        for (int i = 0; i < asistencia.length; i++) {
            System.out.println("--- Día " + (i + 1) + " ---");
            for (int j = 0; j < nombres.length; j++) {
                int valor;
                System.out.print(nombres[j] + ": ");
                    valor = captu.nextInt();
                    asistencia[i][j] = valor;
            }
        }
        System.out.println("");

        System.out.println("--- TOTAL DE ASISTENCIAS ---");
        for (int j = 0; j < nombres.length; j++) {
            int total = 0;
            for (int i = 0; i < asistencia.length; i++) {
                total += asistencia[i][j];
            }
            System.out.println(nombres[j] + ": " + total + " de " + asistencia.length);
        }

        captu.close();
       
    }
    
}
