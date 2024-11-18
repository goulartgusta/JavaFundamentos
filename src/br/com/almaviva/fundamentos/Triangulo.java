package br.com.almaviva.fundamentos;

public class Triangulo {
	public static void main(String[] args) {
		primeiraManeira();
		segundaManeira();
		terceiraManeira();
		quartaManeira();

	}

	static void primeiraManeira() {
		System.out.println("-------- PRIMEIRA MANEIRA -----------");
		int contador1 = 0, espacos1 = 5, espacos2 = 0;
		String s1 = " ";

		while (contador1 < 5) {
			contador1++;
			System.out.print(s1.repeat(espacos1));
			System.out.print(contador1);
			espacos1--;

			System.out.print(s1.repeat(espacos2));
			System.out.print(contador1);
			espacos2 += 2;
			System.out.println();
		}

		int contador2 = 5, espacos3 = 0, espacos4 = 8;
		String s2 = " ";

		while (contador2 > 0) {
			espacos3++;
			System.out.print(s2.repeat(espacos3));
			System.out.print(contador2);

			System.out.print(s2.repeat(espacos4));
			System.out.print(contador2);
			contador2--;
			espacos4 -= 2;
			System.out.println();
		}
		System.out.println();
	}

	static void segundaManeira() {
		System.out.println("-------- SEGUNDA MANEIRA -----------");
		int contador1 = 0, espacos1 = 0;
		String s = "", s1="        ";

		while (contador1 < 5) {
			contador1++;
			System.out.print(s1.substring(espacos1, 5));
			System.out.print(contador1);
			espacos1++;
		
			System.out.print(s);
			s = s + "  ";	
			System.out.print(contador1);


			System.out.println();
		}

		int contador2 = 5, espacos = 8;
		String s2 = "", s3 ="        ";

		while (contador2 > 0) {
			s2 +=" ";
			System.out.print(s2);
			System.out.print(contador2);

			System.out.print(s3.substring(0, espacos));
			System.out.print(contador2);
			espacos-=2;
			contador2--;
			System.out.println();
		}
		System.out.println();
	}
	
	static void terceiraManeira() {
		System.out.println("-------- TERCEIRA MANEIRA -----------");
		String str = "";

		for (int indice = 1; indice <= 5; indice++) {
			System.out.print(str);
			str += " ";
			System.out.println(indice);
		}
	    for (int indice = 5; indice > 0; indice--) {
	        str = str.substring(0, str.length() - 1);
	        System.out.print(str);
	        System.out.println(indice); 
	    }
		System.out.println();


		
	}

	static void quartaManeira() {
		System.out.println("-------- QUARTA MANEIRA -----------");

		String str2 = " ";
		
        for (int indice = 1; indice <= 5; indice++) {
            for (int espaco = 5; espaco > indice; espaco--) {
				System.out.print(str2);
            }
            System.out.println(indice);
        }

        for (int indice = 5; indice > 0; indice--) {
            for (int espaco = 5; espaco > indice; espaco--) {
				System.out.print(str2);
            }
            System.out.println(indice);
        }
        System.out.println();
    }
	

	static void quintaManeira() {
		System.out.println("-------- QUINTA MANEIRA -----------");
		int[] lista = { 1, 2, 3, 4, 5 };
		String espaco = "";
		int conta = 0;
		System.out.print(espaco);
		System.out.println(lista[conta]);
		conta++;
		espaco += " ";
		System.out.print(espaco);
		System.out.println(lista[conta]);
		conta++;
		espaco += " ";
		System.out.print(espaco);
		System.out.println(lista[conta]);
		conta++;
		espaco += " ";
		System.out.print(espaco);
		System.out.println(lista[conta]);
		conta++;
		espaco += " ";
		System.out.print(espaco);
		System.out.println(lista[conta]);
		conta++;
	}
}
