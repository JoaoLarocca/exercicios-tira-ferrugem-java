package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int SomaPrin = 0, SomaSecun = 0;
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Digite os valores da matriz: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("A Diagonal Principal e:\n");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + "\t");
            SomaPrin += matriz[i][i];
        }
        
        System.out.println("A Diagonal Secundaria e:\n");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + "\t");
            SomaSecun += matriz[i][3 - i];
        }
        
        System.out.println("Soma diagonal principal: " + SomaPrin);
        System.out.println("Soma diagonal secundaria: " + SomaSecun);
        
        if (SomaPrin > SomaSecun) {
            System.out.println("Diagonal principal possui a soma maior.");
        }
        
        else if (SomaSecun > SomaPrin) {
            System.out.println("Diagonal secundaria possui a soma maior.");
        }
        
        else {
            System.out.println("Ambas possuem somas iguais.");
        }
    }
    
}
