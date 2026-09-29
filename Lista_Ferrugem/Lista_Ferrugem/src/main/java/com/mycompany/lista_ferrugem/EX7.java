package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        char[][] tabuleiro = new char[8][8];
        boolean[][] disparos = new boolean[8][8];
        int linha, coluna;
        int acertos = 0;
        int erros = 0;
        int repetidos = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~';
            }
        }
        
        for (int navio = 0; navio < 5; navio++) {

            while (true) {

                System.out.print("\nDigite a linha do navio " + (navio + 1) + " (1-8): ");
                linha = ler.nextInt();

                System.out.println("Digite a coluna do navio " + (navio + 1) + " (1-8): ");
                coluna = ler.nextInt();

                linha--;
                coluna--;

                if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                    System.out.println("Posicao Invalida!!");
                } 
                
                else if (tabuleiro[linha][coluna] == 'N') {
                    System.out.println("Ja existe um navio nesta posicao!!");
                } 
                
                else {
                    tabuleiro[linha][coluna] = 'N';
                    System.out.println("Navio Posicionado!!");
                    break;
                }
            }
        }

        System.out.println("\n=== Batalha Naval ===");
        System.out.println("Voce possui 15 disparos");

        for (int disparo = 0; disparo < 15; disparo++) {

            System.out.println("\nDisparo " + (disparo + 1));

            System.out.println("Digite a linha (1-8): ");
            linha = ler.nextInt();

            System.out.println("Digite a coluna (1-8): ");
            coluna = ler.nextInt();

            linha--;
            coluna--;

            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println("Posicao Invalida");
                disparo--;
                continue;
            }

            if (disparos[linha][coluna]) {
                System.out.println("Disparo Repetido");
                repetidos++;
            } 
            
            else {

                disparos[linha][coluna] = true;

                if (tabuleiro[linha][coluna] == 'N') {
                    System.out.println("Acertou um Navio");
                    acertos++;
                    tabuleiro[linha][coluna] = 'X';
                    
                    if (acertos == 5) {
                        System.out.println("\nTodos os navios foram destruidos");
                        break;
                    }
                } 
                
                else {
                    System.out.println("Errou");
                    erros++;
                    tabuleiro[linha][coluna] = 'O';
                }
            }
        }

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Disparos Repetidos: " + repetidos);
    }
}