/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema1;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_13_PROBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor;
        int[] valores = new int[10];
        
         for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 10);
        }
          for (int i = 0; i < valores.length; i++) {
             System.out.print("[" + valores[i] + "]"  );
             
        }
          do{
              System.out.println("Que numero estas buscando en el arreglo ? ");
              valor = captu.nextInt();
              captu.nextLine();
              int contador = 0;
              for (int i = 0; i < valores.length; i++) {
                 if(valor == valores[i]){ 
                     contador++;
                 }
                
            }
            if(contador > 0){
              System.out.println("El número " + valor + " se repite " + contador + " veces.");  
            }else {
               System.out.println("El número " + valor + " no está en el arreglo.");
            }
                 
            break;
         }while(true);
         
          
    }
    
}
