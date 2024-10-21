package Main;

import ClasseCon.ContaCorrente; // Importa a Classe Conta Corrente do Pacote Classe Concreta
import ClasseCon.ContaPoupanca; // Importa a Classe Conta Poupança do Pacote Classe Concreta

public class Main {
	public static void main(String[] args) {
		
		System.out.println(" - Conta Poupança - "); 
		ContaPoupanca cp1 = new ContaPoupanca(500.0, 100.0, 50.0); // Saldo de 500 R$. Saque de 100 R$. Depósito de 50R$
		cp1.ConsultaSaldo(); // Puxa o Método para Consultar Saldo
		cp1.taxaSaldo(); // Puxa o Método de taxação de Consulta de Saldo
		
		cp1.Saque(); // Puxa o Método de Realizar Saque
		cp1.taxaSaque(); // Puxa o Método de taxação de Saque
		
		cp1.Deposito(); // Puxa o Método de Realizar Depósito
		cp1.taxaDeposito(); // Puxa o Método de taxação de Depósito

		System.out.println("\n\n - Conta Corrente - ");
		ContaCorrente cc1 = new ContaCorrente(750.0, 50.0, 150); // Saldo de 750 R$. Saque de 50 R$. Depósito de 150 R$
		cc1.ConsultaSaldo(); // Puxa o Método para Consultar Saldo
		cc1.taxaSaldo(); // Puxa o Método de taxação de Consulta de Saldo
		
		cc1.Saque(); // Puxa o Método de Realizar Saque
		cc1.taxaSaldo(); // Puxa o Método de taxação de Saque
		
		cc1.Deposito(); // Puxa o Método de Realizar Depósito
		cc1.taxaDeposito(); // Puxa o Método de taxação de Depósito
	}
}
