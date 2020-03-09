package com.company;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variáveis
        float pesoTerra, pesoLua, massa;
        float gravidadeTerra = (float) 9.8;
        float gravidadeLua = (float) (17.0/100 * gravidadeTerra);

        //Entradas
        System.out.println("Digite a sua massa em KG: ");
        massa = Float.parseFloat(teclado.nextLine());

        //Cálculo
        pesoTerra = massa * gravidadeTerra;
        pesoLua = massa * gravidadeLua;

        //Exibindo resultados
        System.out.printf("Enquanto na Terra você pesa %.3f Newtons, na Lua você pesa %.3f Newtons", pesoTerra, pesoLua);

    }
}
