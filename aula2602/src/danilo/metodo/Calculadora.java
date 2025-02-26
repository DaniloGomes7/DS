/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danilo.metodo;

/**
 *
 * @author DANILO_4803
 */
public class Calculadora {

    int valor1 = 10;
    int valor2 = 10;

    void adicao() {

        int resultado = valor1 + valor2;
        System.out.println("O valor da soma é : " + resultado);
    
    }

    void subtrair() {
        int resultado = valor1 - valor2;
        System.out.println("O valor da subtracao é : " + resultado);
    }

    void multiplicacao(){
        int resultado = valor1 * valor2;
        System.out.println("O valor da multiplicacao é : " + resultado);
    }

    void divisao(){
        int resultado = valor1 / valor2;
        System.out.println("O valor da divisao é : " + resultado);
    }

}
