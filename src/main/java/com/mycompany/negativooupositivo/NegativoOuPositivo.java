
/* 
1. Criar um programa para ler um número inteiro e depois dizer se esse número é negativo ou não.

 */
package com.mycompany.negativooupositivo;

import java.util.Scanner;

public class NegativoOuPositivo {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");

        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é positivo");
        }
    }
}
