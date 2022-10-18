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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int num;
        boolean haynegativo = false;
        
        do{
            System.out.println("Introduce un numero: ");
            num = entrada.nextInt();
           
        }while (num != 0);
        
        if (num <0){
                System.out.println("Has introducido negativos");
                haynegativo = true;
        }
    
    }
}    
