package br.com.santanderExercicio01;

public class ContaCorrente extends Conta {

	private double limiteEspecial;
	
	public ContaCorrente(String clienteNumero, String clienteSobrenome, String clienteRg,
			String clienteCpf, double saldoCliente, double limiteEspecial){
		super(clienteNumero, clienteSobrenome, clienteRg, clienteCpf, saldoCliente);
		
		this.limiteEspecial = limiteEspecial;
		
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	//deposito em dinheiro
	public double depositoDinheiro(double valor) {
		double saldoAtualizado = this.saldoCliente + valor;
		this.setSaldoCliente(this.getSaldoCliente() + valor);
		System.out.println("saldo em conta: " + saldoCliente + " valor do deposito :" + valor);
		return saldoAtualizado;
	}
	
	//deposito em cheque
	public double depositoCheque(double valor, String bancoEmissor, String dataPagamento) {
		double saldoAtualizado = this.saldoCliente + valor;
		this.setSaldoCliente(this.getSaldoCliente() + valor);
		System.out.println("Deposito Cheque via banco emissor: " + bancoEmissor + " Valor: " + valor);
		return saldoAtualizado;
		
	}
	
	public double saque(double valor) {
		saldoCliente = this.getSaldoCliente();
		double saldoAtualizado = 0;
		if (saldoCliente >= valor) {
			saldoAtualizado = saldoCliente - valor;
			this.setSaldoCliente(saldoAtualizado);
		} else if ((saldoCliente + limiteEspecial) >= valor ){
			saldoAtualizado = (saldoCliente + limiteEspecial) - valor;
			this.limiteEspecial -= valor - saldoCliente;
			
		} else  {
			System.out.println("Valor Indisponível");
		} 
		 
		return saldoAtualizado;
	}
}
