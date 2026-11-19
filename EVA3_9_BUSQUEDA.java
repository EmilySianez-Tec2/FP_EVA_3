/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = new int[10];
        Scanner captu = new Scanner(System.in);
        int valor;
        boolean valorEncontrado = false;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
        }
       
         for (int i = 0; i < valores.length; i++) {
             System.out.print("[" + valores[i] + "]");
        }
        
         do{// pide valores al usuario
             //PEDIR VALOR USUARIO
             System.out.println("Introduce el valor a buscar em el arreglo: ");
             valor = captu.nextInt();
             captu.nextLine();
             //BUSCAR
             //RECORRER TODOS LOS VALORES DEL ARREGLO
             for (int i = 0; i < valores.length; i++) {
                 if(valor == valores[i]){ // BUSCA POSICION POR POSICION HASTA ENCONTRRLO
                     System.out.println("Encontraste el valor, esta en la posicion: " + i); 
                     valorEncontrado = true;
                     break;
                 }
                
             }
             if(valorEncontrado)
                 break;
             //SI ESTA EN EL ARREGLO SALIMOS DEL CICLO
         }while(true);
         
        
    }
    
}
