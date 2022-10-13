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
public class Ejercicio00_iniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
//        System.out.println("**** for ****");
//        for (int i=0;i<10;i++){
//            System.out.println("i vale: "+i);
//            
//        }
//        
//        System.out.println("\n\n**** while ****");    
//        int i=1;
//        while(i<=10){
//            System.out.println("i");
//            i++;
//        }
//        
//        System.out.println("\n\n**** do while ****");
//        i=1;
//        do{
//            System.out.println("i");
//            i++;
//        }while(i<11);
        
//        System.out.println("\n\n**** Introducir numeros hasta negativo ****");
//        
//        
        int num;
//        
//        System.out.println("--- Usando un while ---");
//        System.out.println("Numero positio para continuar: ");
//        num = Integer.parseInt(entrada.nextLine());
//        
//        while (num>=0){
//            System.out.print("Numero positivo para continuar: ");
//            num = Integer.parseInt(entrada.nextLine());
//
//        }
//        
//        do{
//            System.out.println("Numero positivo para continuar: ");
//            num = Integer.parseInt(entrada.nextLine());
//        }while (num>=0);
        
////////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("\n\n**** Introducir numeros hasta impar ****");
//     
//        do{
//            System.out.println("Numero par para continuar: ");
//            num = Integer.parseInt(entrada.nextLine());
//            if (num%2!=0){ 
//                break;
//            }
//        }while (true);
        
//        System.out.println("Numero positio para continuar: ");
//        num = Integer.parseInt(entrada.nextLine());
//        
//        while (num%2==0){
//            System.out.print("Numero par para continuar: ");
//            num = Integer.parseInt(entrada.nextLine());


////////////////////////////////////////////////////////////////////////////////

//        System.out.println("**** for ****");
//        for (int i=0;i<10;i++){
//            System.out.println("Numero par para continuar: ");
//            num=Integer.parseInt(entrada.nextLine());
//            if (num%2!=0){
//                break;
//            }
            
            int ascii_A=65;
            System.out.println("Letra: "+ascii_A);
            for (int i=65;i<=90;i++){
            System.out.print("Letra: "+(char)i);
             System.out.println("  "+(char)(i+32));
            }
            
////////////////////////////////////////////////////////////////////////////////                
   
        int numero=0;
        int suma =0;
        int ontafor =0;
    
        while (num>=0){
        System.out.println("Introduce un numero :");
        num = Integer.parseInt(entrada.nextLine());
        
        suma = suma + num;
        ontafor++;
        }
        System.out.println("La su,a acumulada es: "+suma);
        System.out.println("Total numeros introducidos: "+contador);
        
                
                
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
       
    }
    
    
    
}
