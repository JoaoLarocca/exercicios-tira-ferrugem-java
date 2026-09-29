package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double[] notas = new double [10];
        double soma = 0, media, maior, menor;
        int MaiorSete = 0, AbaixoMedia = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }
        
        media = soma / 10;
        
        maior = notas[0];
        menor = notas[0];
        
        for (int i = 1; i < 10; i++) {
            
            if (notas[i] > maior) {
                maior = notas[i];
            }
            
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
        
            if (notas[i] >= 7) {
                MaiorSete++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            
            if(notas[i] < media) {
                AbaixoMedia++;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Media da turma: " + media);
        System.out.println("Maior Nota: " + maior);
        System.out.println("Menor Nota: " + menor);
        System.out.println("Alunos com nota maior ou igual a 7: " + MaiorSete);
        System.out.println("Alunos abaixo da media: " + AbaixoMedia);
    }
}
