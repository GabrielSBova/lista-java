package com.company;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        //Variáveis
        Scanner teclado = new Scanner(System.in);

        float raio;

        //Entradas
        System.out.println("Vamos calcular a área e o perímetro do círculo");
        System.out.println("Digite o raio do círculo: ");
        raio = Float.parseFloat(teclado.nextLine());

        //Lógica
        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        //Resultados
        System.out.printf("O perímetro do círculo é de: %.2f \n", perimetro);
        System.out.printf("A área do círculo é de: %.2f", area);
    }
}
