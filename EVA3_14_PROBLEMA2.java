/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema2;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_14_PROBLEMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int[] valores = new int [10];
        
        for (int i = 0; i < valores.length; i++) {
          valores[i] = (int)(Math.random() * 10);  
        }
        Arrays.sort(valores);
        
        for (int i = 0; i < valores.length; i++) {
             System.out.print("[" + valores[i] + "]"  );
            for (int j = 0; j > valores.length; j++) {
                
            }
            
        }
        System.out.println("");
        System.out.println("El numero menor es: " + valores[0]); 
        System.out.println("El numero mayor es: " + valores[9]); 
        
    }
    
}
