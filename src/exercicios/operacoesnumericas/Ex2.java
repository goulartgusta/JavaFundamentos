package exercicios.operacoesnumericas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// 2º Exercício - O primeiro número é composto pelos números
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();

		for (int i = 0;i / num1 != 1; i++) {
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
			if(num1==2) {
				break;
			}else if (restante == 2) {
				lista3.addLast(2);
			} else if (restante == 1) {
				lista3.addLast(1);
			} else {
				lista3.add(3);
			}
		}

		System.out.println(lista3 + " ");
		sc.close();
	}
}
