package com.company;

import java.util.Random;

public class ex5 {

    public static void main(String[] args) {
        // Lógica
        int randomN = new Random().nextInt(6) + 1;
        // Resultados
        System.out.printf("O número gerado é %d", randomN);
    }
}
