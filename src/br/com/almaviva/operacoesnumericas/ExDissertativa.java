package br.com.almaviva.operacoesnumericas;

import java.util.Scanner;

public class ExDissertativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Quantidade de números = " + contaNum(str));
		sc.close();
	}
	
	public static int contaNum(String str) {
		int contador = 0;
		
		for(char c : str.toCharArray()) {
			if(c >= '0' && c <= '9') {
				contador++;		
			}
		}
		return contador;
	}
}
