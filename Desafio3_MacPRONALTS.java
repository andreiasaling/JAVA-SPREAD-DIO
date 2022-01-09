package Desafios;

import java.util.Scanner;

public class Desafio3_MacPRONALTS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = 0, q = 0;
		double total = 0, totalgeral = 0;
		int numProdutos = scan.nextInt();
		for (int i = 0; i < numProdutos; i++) {
			p = scan.nextInt();
			q = scan.nextInt();
			switch (p) {
			case 1001:
				total = 1.5 * q;
				break;
			case 1002:
				total = 2.5 * q;
				break;
			case 1003:
				total = 3.5 * q;
				break;
			case 1004:
				total = 4.5 * q;
				break;
			case 1005:
				total = 5.5 * q;
				break;
			}
			totalgeral += total;
		}
		System.out.printf("%.2f", totalgeral);

	}

}
