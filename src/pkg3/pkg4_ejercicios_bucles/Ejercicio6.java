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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero_introducido;
        int contraseña=8888;
        int intentos=4;
        boolean correcto=false;
        
//        System.out.println("//opcion1: usando un break//");
//        
//            do {
//                System.out.print("//ENTER PASSWORD ("+intentos+"):");
//                numero_introducido=Integer.parseInt(entrada.nextLine());
//                
//                if (numero_introducido == contraseña){
//                    System.out.println("//CORRECT PASSWORD//");
//                    break;
//                }
//                intentos--;
//            }while(intentos > 0);
                
            
        System.out.println("//opcion2: usando un boolean//");
        
            do {
                System.out.print("//ENTER PASSWORD ("+intentos+"):");
                numero_introducido=Integer.parseInt(entrada.nextLine());
                
                if (numero_introducido == contraseña){
                    correcto = true;
                    System.out.println("//CORRECT PASSWORD//");
                }
                intentos--;
            } while (intentos > 0 && correcto == false);    
            
            
            
            
            
            
        }
    
    }

 


