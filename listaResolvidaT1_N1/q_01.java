package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa que recebe quatro números inteiros, calcule e mostre a soma desses números.

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int num4 = sc.nextInt();

		int somaDosNumeros = (num1 + num2 + num3 + num4);
		System.out.println("A soma dos números " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + somaDosNumeros );

	}

}
