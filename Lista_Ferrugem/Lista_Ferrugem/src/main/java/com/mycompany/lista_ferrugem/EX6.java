package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        boolean[] usados = new boolean[10];
        boolean numerosValidos = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = matriz[i][j];

                if (valor < 1 || valor > 9) {
                    numerosValidos = false;
                } 
                
                else if (usados[valor]) {
                    numerosValidos = false;
                }
                
                else {
                    usados[valor] = true;
                }
            }
        }
        
        int somaReferencia = 0;

        for (int j = 0; j < 3; j++) {
            somaReferencia += matriz[0][j];
        }
        
        boolean linhasValidas = true;

        for (int i = 0; i < 3; i++) {
            int soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }

            if (soma != somaReferencia) {
                linhasValidas = false;
            }
        }
        
        boolean colunasValidas = true;

        for (int j = 0; j < 3; j++) {
            int soma = 0;

            for (int i = 0; i < 3; i++) {
                soma += matriz[i][j];
            }

            if (soma != somaReferencia) {
                colunasValidas = false;
            }
        }
        
        int somaPrincipal = 0;

        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[i][i];
        }
        
        int somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            somaSecundaria += matriz[i][2 - i];
        }
        
        boolean diagonaisValidas = somaPrincipal == somaReferencia && somaSecundaria == somaReferencia;
        
        System.out.println("\n--- RESULTADO ---");

        if (numerosValidos && linhasValidas && colunasValidas && diagonaisValidas) {
            System.out.println("A matriz a magica!");
        } 
        
        else {
            System.out.println("A matriz nao e magica.");

            if (!numerosValidos) {
                System.out.println("- Existem numeros invalidos ou repetidos.");
            }

            if (!linhasValidas) {
                System.out.println("- As linhas nao possuem a mesma soma.");
            }

            if (!colunasValidas) {
                System.out.println("- As colunas nao possuem a mesma soma.");
            }

            if (!diagonaisValidas) {
                System.out.println("- As diagonais nao possuem a mesma soma.");
            }
        }
    }
}