package com.company;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variáveis
        String nome;
        float nota1, nota2, nota3, nota4;
        float media;

        //Entradas
        System.out.println("Cálculo da média do aluno para a disciplina de Matemática.");
        System.out.println("Informe seu nome, aluno: ");
        nome = teclado.nextLine();

        System.out.println("Informe a 1ª nota: ");
        nota1 = Float.parseFloat(teclado.nextLine());

        System.out.println("Informe a 2ª nota: ");
        nota2 = Float.parseFloat(teclado.nextLine());

        System.out.println("Informe a 3ª nota: ");
        nota3 = Float.parseFloat(teclado.nextLine());

        System.out.println("Informe a 4ª nota: ");
        nota4 = Float.parseFloat(teclado.nextLine());

        //Cálculos
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Exibindo resultados
        System.out.printf("%s, sua média é %.1f", nome, media);

    }
}
