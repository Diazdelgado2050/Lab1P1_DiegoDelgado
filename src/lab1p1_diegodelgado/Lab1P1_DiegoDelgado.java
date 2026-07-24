/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_diegodelgado;

import java.util.Scanner;




/**
 *
 * @author diego
 */
public class Lab1P1_DiegoDelgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner operaciones = new Scanner(System.in);
        
        int numeroentero1 = 0;
        int numeroentero2 = 0;
        
        System.out.print("Ingrese el valor de el primer numero: ");
        numeroentero1 = operaciones.nextInt();
                
        System.out.print("Ingrese el valor del segundo numero: ");
        numeroentero2 = operaciones.nextInt();
        
        int suma = numeroentero1 + numeroentero2;
        int resta = numeroentero1 - numeroentero2;
        int mult = numeroentero1 * numeroentero2;
        int div = numeroentero1 / numeroentero2;
        
        
        // Hopla
        System.out.println("La suma de " + numeroentero1 + "+" + numeroentero2 + " es : " + suma );
        System.out.println("La resta de " + numeroentero1 + "-" + numeroentero2 + " es : " + resta );
        System.out.println("La multiplicacion de  " + numeroentero1 + "*" + numeroentero2 + " es : " + mult );
        System.out.println("La division de " + numeroentero1 + "/" + numeroentero2 + " es : " + div );
        
        
                
    
        
        
       
        
        
       
        
       
                
        
        
    
        
       
    
    }
    
}
