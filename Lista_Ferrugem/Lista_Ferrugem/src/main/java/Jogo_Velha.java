import java.util.Scanner;
import java.util.Random;

public class Jogo_Velha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int[][] tabuleiro = new int[3][3];
        int posicao;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = -1;
            }
        }

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
    }
}