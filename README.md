# Sistema Bancário com Classes Abstratas em Java

### 📋 Descrição do Projeto

O sistema consiste em:

Classe Abstrata ContaBancaria que define:

- Métodos básicos: ConsultaSaldo(), Saque(), Deposito()
- Métodos abstratos para taxas: taxaSaldo(), taxaSaque(), taxaDeposito()
- Atributos comuns: saldo, valor de saque e valor de depósito

Classes Concretas que herdam de ContaBancaria:

- ContaCorrente: com taxas mais altas e permite saques além do saldo (cheque especial)
- ContaPoupanca: com taxas mais baixas e não permite saques maiores que o saldo

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Eclipse IDE (ou outra IDE Java de sua preferência)
  
### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/ABSTRATA_CONTA
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Execute a classe Main localizada no pacote Main para ver a demonstração do sistema.

### 🛠️ Funcionalidades Implementadas

- Consulta de saldo com taxa
- Operações de saque com taxas específicas
- Operações de depósito com taxas específicas
- Implementação diferenciada para Conta Corrente e Poupança

### 📝 Exemplo de Saída

Ao executar a classe Main, você verá uma demonstração das operações para ambos os tipos de conta, mostrando:

```
 - Conta Poupança -
Saldo: 500.0
Taxa de Consulta de Saldo: 2.5

397.5 - 100.0

Saldo Pós-Saque e Taxa: 397.5
Taxa de Saque: 10.0

447.5 + 50.0

Saldo Pós-Depósito e Taxa: 447.5
Taxa de Depósito: 12.0


 - Conta Corrente - 
Saldo: 750.0
Taxa de Consulta de Saldo: 5.0

695.0 - 50.0

Saldo Pós-Saque e Taxa: 695.0
Taxa de Consulta de Saldo: 5.0

840.0 + 150.0

Saldo Pós-Depósito e Taxa: 840.0
Taxa de Saque: 20.0
```

## ✒️ Autores

* **Mateus Franco Bezerra** - CLASSE ABSTRATA 1/2
