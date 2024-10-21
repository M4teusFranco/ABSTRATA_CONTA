package ClasseCon; // Pacote de Classe Concreta
import ClasseAbs.ContaBancaria; // Importa a Classe Conta Bancária do Pacote Classes Abstratas

// Criação da Classe Conta Poupança, herdando a Classe Conta Bancária
public class ContaPoupanca extends ContaBancaria{
	double taxaSaldo=2.5; // Taxa da Consulta de Saldo
	double taxaSaque=10; // Taxa do Saque
	double taxaDeposito=12; // Taxa do Depósito
	
	// Construtor da Classe Conta Poupança
	public ContaPoupanca(double ValorSaldo, double ValorSaque, double ValorDeposito) {
		// Chama o construtor da Classe Conta Bancaria para inicializar os valores
		super(ValorSaldo, ValorSaque, ValorDeposito);
	}
	
	// Método para taxar a Consulta do Saldo
	@Override
	public void taxaSaldo() {
		setValorSaldo(getValorSaldo()-taxaSaldo); // Calcula o Saldo atual
		System.out.println("Taxa de Consulta de Saldo: "+taxaSaldo); // Exibe apenas a Taxa
	}
	
	// Método para taxar o Saque
	@Override
	public void taxaSaque() {
		setValorSaque(getValorSaque()-taxaSaque); // Calcula o Saldo atual
		System.out.println("Taxa de Saque: "+taxaSaque); // Exibe apenas a Taxa
	}

	// Método para taxar o Depósito
	@Override
	public void taxaDeposito() {
		setValorDeposito(getValorDeposito()-taxaDeposito); // Calcula o Saldo atual
		System.out.println("Taxa de Depósito: "+taxaDeposito); // Exibe apenas a Taxa
	}
}
