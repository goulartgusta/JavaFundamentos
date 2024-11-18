package br.com.almaviva.operacoesnumericas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodosExerciciosLogica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		// 1º Exercício - Qual número é maior?
		int resultado1 = num1 / num2;
		int resultado2 = num2 / num1;
		if (resultado1 != 0) {
			System.out.println("O primeiro número é maior.");
		} else if (resultado2 != 0) {
			System.out.println("O segundo número é maior.");
		}
		System.out.println();

		// 2º Exercício - O primeiro número é composto pelos números.

		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();

		for (int i = 0; i / num1 != 1; i++) {
			lista1.add(1);
		}
		System.out.println(lista1 + " ");

		for (int i = 0; i / num1 != 1; i += 2) {
			int restante = num1 - i;
			if (restante == 1) {
				lista2.addLast(1);
			} else {
				lista2.add(2);
			}
		}
		System.out.println(lista2 + " ");

		for (int i = 0; i / num1 != 1; i += 3) {
			int restante = num1 - i;
			if (num1 == 2) {
				break;
			} else if (restante == 2) {
				lista3.add(2);
			} else if (restante == 1) {
				lista3.addLast(1);
			} else {
				lista3.add(3);
			}
		}
		System.out.println(lista3 + " ");

		// 3º Exercício - O antecessor e o sucessor do segundo número são:
		System.out.println("O antecessor do segundo número é = " + (num2 - 1));
		System.out.println("O sucessor do segundo número é = " + (num2 + 1));
		System.out.println();

		// 4º Exercício - Análise do segundo número = par ou ímpar:
		int conta = num2 / 2;
		System.out.println(conta);
		if (conta * 2 == num2) {
			System.out.println("O segundo número é par: " + num2);
		} else {
			System.out.println("O segundo número é ímpar: " + num2);
		}
		System.out.println();

		// 5º Exercício - Análise do segundo número = composição quantitativa:
		int milhares = num2 / 1000;
		int centenas = num2 / 100 - (milhares * 10);
		int dezenas = (num2 / 10) - (centenas * 10) - (milhares * 100);
		int unidades = num2 - (dezenas * 10) - (centenas * 100) - (milhares * 1000);
		;

		System.out.println("O segundo número = " + num2 + "\n contém " + milhares + " milhares, " + centenas
				+ " centenas, " + dezenas + " dezenas e " + unidades + " unidades.");

		sc.close();
	}
}
