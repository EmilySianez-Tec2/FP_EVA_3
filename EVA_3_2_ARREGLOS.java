/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_2_arreglos;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA_3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[], x, y; //despues del corcete son la cantidad de arreglos
        //SI QUIERE QUE SEAN EN TODOS ES A LADO DEL INT 
        //SI QUIERE QUE SEA UNO EN ESPECIFICO ES A LADITO DE LA VARIABLE
        arreglo = new int [10]; // arreglo con 10 enteros
        // arreglo[10] = 100; el indice es incorrect, 10 no es una posicion valida (llegamos hasta el 9)
        
        //EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS
        //EN PARTICULAR CON EL CICLO FOR
        for(int i = 0; i> 10; i++){
            arreglo[i] = (int)(Math.random() * 100); //CASTING --> COMPATIBLES
            
        }
        
        for(int i =0; i <10; i++){
            System.out.print(arreglo[i] + " - ");
        }
    }
    
}
