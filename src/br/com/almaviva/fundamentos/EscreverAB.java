package br.com.almaviva.fundamentos;

import java.util.Scanner;

public class EscreverAB {
    public static void main(String[] args) {
        // Fazendo uma lista de letras, podendo depois escrever um nome completo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo à máquina de escrever.");

        EscreverAB.escreveLetras();

        sc.close();
    }

    static char[][] escreveLetras() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas letras você quer digitar? ");
        int numLetras = sc.nextInt(); 
        int numEspacos = numLetras;
        sc.nextLine();

        int linhas = 6;
        int colunasPorLetra = 4;
        int colunasTotais = colunasPorLetra * numLetras + numEspacos; 
        char[][] letras = new char[linhas][colunasTotais];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunasTotais; j++) {
                letras[i][j] = ' ';
            }
        }
        
        int contaLetra = 0;
        while (contaLetra < numLetras) {
            System.out.println("Digite a letra:");

            int inicioLetra = contaLetra * (colunasPorLetra + 1);

            for (int linha = 0; linha < linhas; linha++) {
                for (int coluna = 0; coluna < colunasPorLetra; coluna++) {
                    System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                    String caracter = sc.nextLine();

                    if (caracter.length() == 1) {
                        letras[linha][inicioLetra + coluna] = caracter.charAt(0);
                    } else {
                        System.out.println("Dígito inválido, será inserido ' ' no índice [" + linha + "][" + (inicioLetra + coluna) + "]");
                        letras[linha][inicioLetra + coluna] = ' ';
                    }
                }
            }
            contaLetra++;
            sc.close();
        }

        System.out.println("Letras preenchidas: ");
        for (char[] linha : letras) {
            for (char c : linha) {
                System.out.print(c);
            }
            System.out.println();
        }

        return letras;
    }
    
}
