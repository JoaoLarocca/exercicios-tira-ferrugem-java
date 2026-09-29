package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int[][] rotacionada = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rotacionada[j][4 - i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Normal:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("\nMatriz Rotacionada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotacionada[i][j] + "\t");
            }

            System.out.println();
        }
    }
}