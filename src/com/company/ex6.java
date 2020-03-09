package com.company;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //Variáveis
    int valor;
    float dobro, triplo;
    float multDobroeTriplo, divDobroeTriplo;

    //Entradas
        System.out.println("Vamos calcular o dobro de um número inteiro, seu triplo e a multiplicação e divisão entre o dobro e o triplo! ");
        System.out.print("Digite um número inteiro: ");
        valor = Integer.parseInt(teclado.nextLine());

    //Cálculos
        dobro = valor * 2;
        triplo = valor * 3;
        multDobroeTriplo = dobro * triplo;
        divDobroeTriplo = dobro / triplo;

    //Exibindo resultados
        System.out.printf("Dobro de %d: %.0f \n", valor, dobro);
        System.out.printf("Triplo de %d: %.0f \n", valor, triplo);
        System.out.printf("Multiplicação entre o dobro e o triplo de %d: %.0f \n", valor, multDobroeTriplo);
        System.out.printf("Divisão entre o dobro e o triplo de %d: %f \n", valor, divDobroeTriplo);

    }
}
