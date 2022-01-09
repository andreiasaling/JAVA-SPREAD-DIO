package Desafios;

import java.util.Scanner;

public class Desafio5_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int numero = 0;

		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			numero = scan.nextInt();

			if (numero > 0 && (numero % 2 == 0)) {
				System.out.println("EVEN POSITIVE");
			} else if (numero > 0 && (numero % 2 != 0)) {
				System.out.println("ODD POSITIVE");
			} else if (numero < 0 && (numero % 2 == 0)) {
				System.out.println("EVEN NEGATIVE");
			} else if (numero < 0 && (numero % 2 != 0)) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}

		}
	}

}
