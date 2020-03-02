package com.company;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        //Variáveis
        Scanner teclado = new Scanner(System.in);

        float numero;

        //Entrada
        System.out.println("Vamos encontrar a raiz quadrado e cúbica de um número");
        System.out.println("Digite o número escolhido: ");
        numero = Float.parseFloat(teclado.nextLine());

        //Lógica
        double rquadrada = Math.sqrt(numero);
        double rcubica = Math.cbrt(numero);

        //Resultados
        System.out.printf("Raiz cúbica: %.2f", rcubica);
        System.out.printf("Raiz quadrada: %.2f", rquadrada);
    }
}
