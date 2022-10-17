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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int numerosPositivos=0;
        int numerosNegativos=0;
        int numerosCero=0;
        
        
        System.out.print("Cuantos números quieres introducir?: ");
        int totalNumeros=Integer.parseInt(entrada.nextLine());
        
        for (int i = 0; i < totalNumeros; i++) {
            
            System.out.print("Dime un numero:");
            numero=Integer.parseInt(entrada.nextLine());
        
            if (numero>0){
                numerosPositivos++;
            }      
            else if (numero<0){
                numerosNegativos++;
            }
            else {
                numerosCero++;
            } 
        }
        
        System.out.println("Total positivos: "+numerosPositivos);
        System.out.println("Total negativos: "+numerosNegativos);
        System.out.println("Total cero's: "+numerosCero);
        
        
        
    }
    
}
        
                
        
        
        
        
        
        
        
        
    