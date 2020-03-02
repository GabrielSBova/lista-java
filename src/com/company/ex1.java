package com.company;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
	// Variáveis
        Scanner teclado = new Scanner(System.in);

        String nome;
        float altura, peso;
        short idade;

        float IMC;

        //Entradas
        System.out.println("Opa, tudo chique, parceiro? Bora calcular seu IMC, nada de fugir da dieta!");
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite sua altura em metros:");
        altura = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite seu peso em quilogramas: ");
        peso = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        idade = Short.parseShort(teclado.nextLine());

        //Calculando IMC
        IMC = (float) (peso / Math.pow(altura, 2));

        //Exibindo resultados
        System.out.printf("%s seu IMC é de: %.2f kg/m²", nome, IMC);
    }
}
