package com.company;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        //Variáveis
        Scanner teclado = new Scanner(System.in);
        float numero;

        //Entradas
        System.out.println("Insira um número decimal: ");
        numero = Float.parseFloat(teclado.nextLine());

        //Lógica
        float narredondado = Math.round(numero);

        //Resultados
        System.out.printf("O número %.2f arredondado é: %.2f", numero, narredondado);
    }
}
