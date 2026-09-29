package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] original = new int[20];
        int comparacao = 0, troca = 0, temp;
        double mediana;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o " + (i + 1) + " numero:");
            numeros[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 20; i++) {
            original[i] = numeros[i];
        }
        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                comparacao++;

                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    troca++;
                }
            }
        }
        
        mediana = (numeros[9] + numeros[10]) / 2.0;
        
        System.out.println("\nVetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }
        
        System.out.println("\n\nVetor ordenado:");

        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\n\nQuantidade de comparaçes: " + comparacao);
        System.out.println("Quantidade de trocas: " + troca);
        System.out.println("Mediana: " + mediana);
    }
}