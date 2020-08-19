package br.com.santanderExercicio01;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		ContaCorrente corrente = new ContaCorrente("123", "Reis", "44789", "345678", 3000, 2000);
		System.out.println(corrente.saque(5000));
		
		System.out.println(corrente.depositoDinheiro(1000));
		
		System.out.println(corrente.depositoCheque(100, "Santander", "2020/01/01"));
		*/
		
		
		ContaPoupanca poupanca = new ContaPoupanca("123", "Reis", "44789", "345678", 3000, 0.5);
		System.out.println(poupanca.depositoPoupanca(100));
		
		System.out.println(poupanca.recolhaJuros(05));
		
	}

}
