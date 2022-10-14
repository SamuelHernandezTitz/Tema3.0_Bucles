/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg4_ejercicios_bucles;


/**
 *
 * @author samuel.hernandez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        for (i=0;i<=50;i=i+5){
            System.out.println("Los multiplos de 5 son: "+i);
            
        }
        
        i=0;
        while (i <= 50){
            System.out.println(i);
            i=i+5;
        }
        
        i=0;
        do{
            System.out.println(i);
            i+=5;
        }while(i<=50);
        
        
        
        
    }
    
}
