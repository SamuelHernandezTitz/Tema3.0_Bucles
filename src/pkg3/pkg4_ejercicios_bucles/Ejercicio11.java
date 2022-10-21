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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String numero;
        char character;
        int buena_suerte=0;
        int mala_suerte=0;
        
        System.out.println("Introduceme un numero: ");
        numero = entrada.nextLine();
        while (!numero.equals("")){
        
            numerosAfortunados=0;
            numerosNoAfortunados=0;
        
        for (int i=0; i<numero.length(); i++){
            
            character = numero.charAt(i);
            
            switch (character){
                case '2','5','8' :
                        buena_suerte++;
                break;
                default:
                    mala_suerte++;
            }
            
            
            
            
            
            
        }
        
    
    
    
    
    
    
    
    
    
    }        
        
}
        

    

