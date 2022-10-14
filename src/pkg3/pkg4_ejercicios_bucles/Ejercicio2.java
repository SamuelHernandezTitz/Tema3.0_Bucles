/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg4_ejercicios_bucles;

import java.util.Scanner;

/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner entrada = new Scanner(System.in);
    
    int suma = 0;
    
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(entrada.nextLine());
        
        for (int i=1;i<=num;i++){
            suma=suma+i;
        }
        System.out.println("La suma es: "+suma);
        
        
        int factorial=1;
        for (int i = 1; i <= num; i++){
            factorial = factorial*i;
        }
        System.out.println("El factorial de "+num+" es: "+factorial );
        
        
        
    }
    
}
