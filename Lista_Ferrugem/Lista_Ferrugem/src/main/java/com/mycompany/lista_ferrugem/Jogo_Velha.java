package com.mycompany.lista_ferrugem;

import java.util.Random;
import java.util.Scanner;

public class Jogo_Velha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int[][] tabuleiro = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = -1;
            }
        }

        while (true) {

            int posicao;

            while (true) {

                System.out.println("Escolha uma posicao de 1 a 9:");
                posicao = ler.nextInt();

                if (posicao < 1 || posicao > 9) {
                    System.out.println("Posicao invalida!");
                    continue;
                }

                int linha = (posicao - 1) / 3;
                int coluna = (posicao - 1) % 3;

                if (tabuleiro[linha][coluna] != -1) {
                    System.out.println("Essa casa ja esta ocupada!");
                    continue;
                }

                tabuleiro[linha][coluna] = 1;

                break;
            }

            imprimirTabuleiro(tabuleiro);

            if (verificarVitoria(tabuleiro, 1)) {
                System.out.println("Voce ganhou!");
                break;
            }

            if (verificarEmpate(tabuleiro)) {
                System.out.println("Empate!");
                break;
            }

            int posicaoComputador;

            while (true) {

                posicaoComputador = random.nextInt(9) + 1;

                int linha = (posicaoComputador - 1) / 3;
                int coluna = (posicaoComputador - 1) % 3;

                if (tabuleiro[linha][coluna] == -1) {
                     tabuleiro[linha][coluna] = 0;
                    break;
                }
            }

            System.out.println("Computador jogou!");

            imprimirTabuleiro(tabuleiro);

            if (verificarVitoria(tabuleiro, 0)) {
                System.out.println("O computador ganhou!");
                break;
            }

            if (verificarEmpate(tabuleiro)) {
                System.out.println("Empate!");
                break;
            }
        }

        ler.close();
    }

    public static void imprimirTabuleiro(int[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == -1) {
                    System.out.print("   ");
                }

                else if (tabuleiro[i][j] == 0) {
                    System.out.print(" O ");
                }

                else {
                    System.out.print(" X ");
                }

                if (j < 2) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    public static boolean verificarVitoria(int[][] tabuleiro, int jogador) {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == jogador
                    && tabuleiro[i][1] == jogador
                    && tabuleiro[i][2] == jogador) {

                return true;
            }
        }

        for (int j = 0; j < 3; j++) {

            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }


        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }

        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    public static boolean verificarEmpate(int[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == -1) {
                    return false;
                }
            }
        }

        return true;
    }
}