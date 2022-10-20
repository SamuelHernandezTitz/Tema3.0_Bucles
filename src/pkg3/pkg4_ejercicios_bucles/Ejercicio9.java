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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("FACTORIALES");
        
        int num;
//        System.out.println("Introduce un numero mayor que cero: ");
//        num=Integer.parseInt(entrada.nextLine());
//        
//        for (int i = 1; i < num; i++){
//            System.out.println("\nTabla del "+i);
//            System.out.println("---------------");
//            for (int j = 1; j <= num; j++){
//                System.out.println(i+"*"+j+"="+(i*j));
//                
//            }
//            
//        }
//        
//        for (int i = 1; i < num; i++){
//            System.out.println("El factorial de: "+num);
//            for (int j = 1; j < num; j++){
//                System.out.println(i+"*");
//            }
//        }

        for (int i = 00; i <= 2; i++){ 
            for(int j = 00; j < 60; j++){
                if (j>=0 && j<=9){
                    System.out.println("La hora es: "+i+":0"+j);
                }else{
                    System.out.println("La hora es: "+i+":"+j);
                }    
                
                    
                
                if (i==2 && j==0){
                    break;
                }
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
