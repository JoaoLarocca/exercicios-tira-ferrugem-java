package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[15];
        int[] distintos = new int[15];
        int QTDdistintos = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Informe os valores: ");
            numeros[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 15; i++) {
            boolean repetido = false;

            for (int j = 0; j < QTDdistintos; j++) {
                if (numeros[i] == distintos[j]) {
                    repetido = true;
                    break;
                }
            }
            
            if (!repetido) {
                distintos[QTDdistintos] = numeros[i];
                QTDdistintos++;
            }
        }
        
        System.out.println("\nValores distintos:");

        for (int i = 0; i < QTDdistintos; i++) {
            System.out.print(distintos[i] + " ");
        }

        System.out.println("\nQuantidade de valores diferentes: " + QTDdistintos);
    }
}