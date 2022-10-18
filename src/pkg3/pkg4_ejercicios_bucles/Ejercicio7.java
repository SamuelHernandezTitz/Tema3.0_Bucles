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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String vocal;
        char letra;
        
        do{
             System.out.println("Introduce un caracter: ");
            vocal = entrada.nextLine();
            letra = vocal.charAt(0);
            
            if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                System.out.println("Es una vocal");
          
            }else if (letra == ' '){
                System.out.println("FIN");
            }else
                System.out.println("No es una vocal");
            
        } while(letra != ' ');
        
        
        
        
        
    }
    
}
