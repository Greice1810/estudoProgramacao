package com.java.operadores;
import java.util.Scanner;
public class Operador {
	public static void main(String[] args) {

		int idade = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("digite um nome");
		String nome = sc.nextLine();

		idade = sc.nextInt();

		if (idade <0)
			System.out.println("idade invalida");
		if (idade >= 18 && idade < 70) {
			System.out.println("maior idade");
		}else if (idade >= 70) {
			System.out.println("terceira idade");
			if (idade >= 100) {
				System.out.println("idade centenaria");

			}
		}

	}




}

