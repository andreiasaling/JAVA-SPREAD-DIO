package Desafios;

import java.util.Scanner;

public class Desafio4_FusoHorario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();

		int horachegada = horasaida + tempoviagem + fuso;
		if (horachegada >= 0 && horachegada <= 23) {
			System.out.println(horachegada);
		} else if (horachegada == 24) {
			System.out.println("0");
		} else if (horachegada > 24) {
			horachegada = horachegada - 24;
			System.out.println(horachegada);
		} else if (horachegada < 0) {
			horachegada = horachegada + 24;
			System.out.println(horachegada);

		}

		sc.close();
	}

}
