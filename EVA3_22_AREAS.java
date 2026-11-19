/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author emilycelestesianezgarcia
 */
public class EVA3_22_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double base, altura,radio,resu;
        Scanner captu = new Scanner(System.in);
        System.out.println("CALCULADORAS DE AREAS");
        System.out.println("Que area deseas calcular: 1.Triangulo 2.Circulo 3.Rectangulo ");
        opcion = captu.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Introcuce cuato mide la base");
            base = captu.nextDouble();
            System.out.println("Introcuce cuato mide la altura");
            altura = captu.nextDouble();
            resu = calcularTriangulo(base, altura);
            System.out.println("El area del triangulo es: " + resu);
            break;
            
            case 2:
            System.out.println("Introcuce el radio");
            radio = captu.nextDouble();  
            resu = calcularCirculo(radio);
            System.out.println("El area del circulo es: " + resu);
            break;
            
            case 3:
            System.out.println("Introcuce cuato mide la base");
            base = captu.nextDouble();
            System.out.println("Introcuce cuato mide la altura");
            altura = captu.nextDouble();
            resu = calcularRectangulo(base, altura);
            System.out.println("El area del Rectangulo es: " + resu);
            break;    
        } 
    }

        
            
        
               
    
    public static double calcularCirculo(double radio) {
        double resu = (radio * radio) * 3.1416;
        return resu;
    }
    public static double calcularTriangulo(double base, double altura){
        double resu = base * altura / 2;
        return resu;
    }
    public static double calcularRectangulo(double base, double altura){
        double resu = base * altura;
        return resu;
    }
}
