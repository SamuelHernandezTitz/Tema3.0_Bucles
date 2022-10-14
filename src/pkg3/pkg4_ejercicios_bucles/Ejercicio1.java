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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in); 
        
       int num;
       
       System.out.println("**** La tabla de multiplicar ****");
       System.out.println("Introduce un numero: ");
       num = Integer.parseInt(entrada.nextLine());
       for (int i=0;i<=10;i++){
           System.out.println(num+"*"+i+"="+(num*i));
           
       } 
       
    /////USANDO  WHILE /////////////////////////////////////////////////////////
       
       int j=1;
       while (j<=10){
           System.out.println(num+"*"+j+"="+(num*j));
           j++;
       }
        
    /////USANDO DO WHILE ///////////////////////////////////////////////////////
       
       j=1;
       do{
           System.out.println(num+"*"+j+"="+(num*j));
           j++;
       }while (j<=10);
               
        
        
        
        
        
        
        
        
    }
    
    
    
}
