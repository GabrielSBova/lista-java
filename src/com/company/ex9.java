package com.company;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variáveis
        float comp, larg;
        float peri, area;

        //Entradas
        System.out.println("Vamos calcular o perímetro e a área do terreno!");
        System.out.println("Digite o comprimento do terreno: ");
        comp = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite a largura do terreno: ");
        larg = Float.parseFloat(teclado.nextLine());

        //Cálculos
        peri = (2 * comp) + (2 * larg);
        area = comp * larg;

        //Exibindo resultados
        System.out.printf("O perímetro do terreno é %.2f m \n", peri);
        System.out.printf("A área do terreno é %.2f m²", area);

        }

    }

