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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
       int num;
       int contador=0;
       int suma=0;
       
        System.out.println("Introduce un numero: ");
        num = Integer.parseInt(entrada.nextLine());
        suma = suma+num;
        contador++;
        
        while (num!=0){
            System.out.println("Introduce un numero: ");
            num = Integer.parseInt(entrada.nextLine());
            contador++;
            suma = suma + num;
            }
        suma = suma + num;
        System.out.println("La suma de los numeros es: "+suma);
        
/////USANDO UN DO WHILE/////////////////////////////////////////////////////////

        do{
            System.out.println("Introduce un numero: ");
            num = Integer.parseInt(entrada.nextLine());
            contador++;
            suma = suma + num;
        } while (num !=0);
        System.out.println("Has introducido "+(contador-1)+ " numeros.");
        System.out.println("La suma total de ellos es: "+suma);
         
        
        
        
    }
    
}
