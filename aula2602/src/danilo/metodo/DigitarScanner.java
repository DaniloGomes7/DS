/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danilo.metodo;

import java.util.Scanner;

/**
 *
 * @author DANILO_4803
 */
public class DigitarScanner {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = x.nextInt();
        
        int resultado = valor1 + valor2;
        
        System.out.println("O valor da sua soma é de: " +resultado);
                
        
    }
}
