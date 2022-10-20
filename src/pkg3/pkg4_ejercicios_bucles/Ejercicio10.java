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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double num1,num2;
        int opción;
        String intro;
        
        
        do{
        
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            do{
                System.out.println("Elige una opción [1-5]:");
                opción=entrada.nextInt();
            }while (opción<1 || opción>5);


            switch(opción){
                case 1:
                    System.out.println("Dime el primer número: ");
                    num1=entrada.nextDouble();
                    System.out.println("Dime el segundo número: ");
                    num2=entrada.nextDouble();
                    System.out.println("La suma es: ");
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println("Dime el primer número: ");
                    num1=entrada.nextDouble();
                    System.out.println("Dime el segundo número: ");
                    num2=entrada.nextDouble();
                    System.out.println("La resta es: ");
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println("Dime el primer número: ");
                    num1=entrada.nextDouble();
                    System.out.println("Dime el segundo número: ");
                    num2=entrada.nextDouble();
                    System.out.println("La multiplicación es: ");
                    System.out.println(num1*num2);
                    break;
                case 4:
                     System.out.println("Dime el primer número: ");
                    num1=entrada.nextDouble();
                    System.out.println("Dime el segundo número: ");
                    num2=entrada.nextDouble();
                    System.out.println("La división es: ");
                    System.out.println(num1/num2);
                case 5:
                    System.out.println("Saliendo......");
                    break;
            }
            if (opción==5){
                System.out.println("Fin del programa");
            }else{
                System.out.println("Pulse entre para continuar");
                intro=entrada.nextLine();
            }
            
        }while(opción >=1 && opción <=5);            
                
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
