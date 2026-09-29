package com.mycompany.lista_ferrugem;

import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] assentos = new int[10][12];
        int opcao, fileira, assento, livres = 0, ocupados = 0, quantidade = 0, consecutivos = 0, inicio;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                assentos[i][j] = 0;
            }
        }

        do {

            System.out.println("\n=== CINEMA ===");
            System.out.println("1 - Reservar um assento");
            System.out.println("2 - Cancelar uma reserva");
            System.out.println("3 - Exibir mapa dos assentos");
            System.out.println("4 - Mostrar assentos livres e ocupados");
            System.out.println("5 - Encontrar sequencia de assentos livres");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite a fileira (1-10): ");
                    fileira = ler.nextInt();
                    System.out.print("Digite o assento (1-12): ");
                    assento = ler.nextInt();
                    fileira--;
                    assento--;

                    if (fileira < 0 || fileira >= 10 || assento < 0 || assento >= 12) {
                        System.out.println("Assento Invalido");
                    } 
                    
                    else if (assentos[fileira][assento] == 1) {
                        System.out.println("Assento Ocupado");
                    } 
                    
                    else {
                        assentos[fileira][assento] = 1;
                        System.out.println("Assento Reservado");
                    }

                    break;

                case 2:

                    System.out.print("Digite a fileira (1-10): ");
                    fileira = ler.nextInt();

                    System.out.print("Digite o assento (1-12): ");
                    assento = ler.nextInt();

                    fileira--;
                    assento--;

                    if (fileira < 0 || fileira >= 10 || assento < 0 || assento >= 12) {
                        System.out.println("Assento Invalido");
                    } 
                    
                    else if (assentos[fileira][assento] == 0) {
                        System.out.println("Assento Livre");
                    } 
                    
                    else {
                        assentos[fileira][assento] = 0;
                        System.out.println("Reserva cancelada");
                    }

                    break;

                case 3:

                    System.out.println("\n=== Mapa dos assentos ===");

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Fileira " + (i + 1) + ": ");
                        for (int j = 0; j < 12; j++) {
                            System.out.print(assentos[i][j] + " ");
                        }
                    }

                    break;

                case 4:

                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 12; j++) {
                            
                            if (assentos[i][j] == 0) {
                                livres++;
                            } 
                            
                            else {
                                ocupados++;
                            }
                        }
                    }

                    System.out.println("Assentos livres: " + livres);
                    System.out.println("Assentos ocupados: " + ocupados);

                    break;

                case 5:

                    System.out.print("Quantas pessoas precisam sentar juntas: ");
                    quantidade = ler.nextInt();

                    boolean encontrou = false;

                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 12; j++) {
                            
                            if (assentos[i][j] == 0) {
                                consecutivos++;
                            } 
                            
                            else {
                                consecutivos = 0;
                            }

                            if (consecutivos == quantidade) {
                                inicio = j - quantidade + 1;
                                System.out.println("Sequencia encontrada!");
                                System.out.println("Fileira: " + (i + 1));
                                System.out.println("Assentos: " + (inicio + 1) + " ate " + (j + 1));
                                encontrou = true;
                                break;
                            }
                        }

                        if (encontrou) {
                            break;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Nao foi encontrada uma sequencia " + "de " + quantidade + " assentos livres.");
                    }

                    break;

                case 6:

                    System.out.println("Programa encerrado");

                    break;

                default:

                    System.out.println("Opcao invalida");
            }

        } 
        
        while (opcao != 6);
    }
}