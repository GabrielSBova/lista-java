package com.company;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variáveis
        int idadeFilho, idadeMae;
        int difIdade;

        //Entradas
        System.out.print("Digite a sua idade: ");
        idadeFilho = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite a idade de sua mãe: ");
        idadeMae = Integer.parseInt(teclado.nextLine());

        //Cálculos
        difIdade = idadeMae - idadeFilho;

        //Exibindo resultados

        System.out.printf("A diferença de idade entre você e sua mãe é %d anos", difIdade);

    }
}
