package ClasseAbs; // Pacote de Classe Abstratas
		
// Criação da Classe Abstrata Conta Bancária
public abstract class ContaBancaria {
	private double ValorSaldo; // Atributos da Classe Conta Bancária
	private double ValorSaque;
	private double ValorDeposito;
	
	// Construtor da Classe Conta Bancária
	public ContaBancaria(double ValorSaldo, double ValorSaque, double ValorDeposito) {
	this.setValorSaldo(ValorSaldo); // Set do Valor do Saldo
	this.setValorSaque(ValorSaque); // Set do Valor do Saque
	this.setValorDeposito(ValorDeposito); // Set do Valor do Depósito
	}
	
	// Método para Consultar Saldo
	public void ConsultaSaldo() {
		System.out.println("Saldo: "+getValorSaldo());
	};
	
	// Método para Realizar Saque
	public void Saque() {
		setValorSaldo(getValorSaldo()-getValorSaque()); // Cálculo de Saldo pós-saque (Saldo menos Saque)
		System.out.println("\n"+getValorSaldo()+" - "+getValorSaque()); // Exibe o cálculo
		System.out.println("Saldo Pós-Saque e Taxa: "+getValorSaldo()); // Exibe o Pós-Saque e Taxa
	};
	
	// Método para Realizar o Depósito
	public void Deposito() {
		setValorSaldo(getValorSaldo()+getValorDeposito()); // Cálculo de Saldo pós-Depósito(Saldo mais Depósito)
		System.out.println("\n"+getValorSaldo()+" + "+getValorDeposito()); // Exibe o cálculo
		System.out.println("\nSaldo Pós-Depósito e Taxa: "+getValorSaldo()); // Exibe o Pós-Depósito e Taxa
	};
	
	// Método abstrato da Taxa de Saldo
	public abstract void taxaSaldo();
	
	// Método abstrato da Taxa de Saque
	public abstract void taxaSaque();
	
	// Método abstrato da Taxa de Depósito
	public abstract void taxaDeposito();

	
	// Criação do Get do Valor de Saldo
	public double getValorSaldo() {
		return ValorSaldo;
	}
	
	// Criação do Set do Valor de Saldo
	public void setValorSaldo(double valorSaldo) {
		ValorSaldo = valorSaldo;
	}

	// Criação do Get do Valor de Saque
	public double getValorSaque() {
		return ValorSaque;
	}

	// Criação do Set do Valor de Saque
	public void setValorSaque(double valorSaque) {
		ValorSaque = valorSaque;
	}

	// Criação do Get do Valor de Depósito
	public double getValorDeposito() {
		return ValorDeposito;
	}

	// Criação do Set do Valor de Depósito
	public void setValorDeposito(double valorDeposito) {
		ValorDeposito = valorDeposito;
	}

	

}
