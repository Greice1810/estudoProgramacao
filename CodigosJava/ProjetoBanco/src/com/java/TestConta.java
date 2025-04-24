package com.java;

public class TestConta {

	public static void main(String[] args) {
		Conta  contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvest= new Conta();

		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "greice";
		contaCorrente.cliente.idade = 34;

		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "nicollas";
		contaPoupanca.cliente.idade = 18;


		contaInvest.numero = 33;
		contaInvest.saldo = 40;
		contaInvest.cliente.nome = "Welton";
		contaInvest.cliente.idade = 40;

		System.out.println(contaPoupanca.numero);
		System.out.println(contaPoupanca.saldo);
		System.out.println(contaPoupanca.cliente.nome);
		System.out.println(contaPoupanca.cliente.idade);


	}
}
