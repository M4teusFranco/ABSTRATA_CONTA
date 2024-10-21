package ClasseCon; // Pacote de Classe Concreta
import ClasseAbs.ContaBancaria; // Importa a Classe Conta Bancária do Pacote Classe Abstrata

// Criação da Conta Corrente, herdando a Classe Conta Bancária
public class ContaCorrente extends ContaBancaria{
	double taxaSaldo=5; // Taxa da Consulta de Saldo
	double taxaSaque=15; // Taxa do Saque
	double taxaDeposito=20; // Taxa do Depósito

	// Construtor da Classe Conta Corrente
	public ContaCorrente(double ValorSaldo, double ValorSaque, double ValorDeposito) {
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
		setValorSaldo(getValorSaldo()-taxaSaldo); // Calcula o Saldo atual
		System.out.println("Taxa de Saque: "+taxaSaque);// Exibe apenas a Taxa
	}

	// Método para taxar o Depósito
	@Override
	public void taxaDeposito() {
		setValorSaldo(getValorSaldo()-taxaDeposito); // Calcula o Saldo atual
		System.out.println("Taxa de Saque: "+taxaDeposito); // Exibe apenas a Taxa
	}
	
}
