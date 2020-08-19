package br.com.santanderExercicio01;

public class ContaPoupanca extends Conta{
	
	private double jurosMensais;

	public ContaPoupanca(String clienteNumero, String clienteSobrenome, String clienteRg, String clienteCpf,
			double saldoCliente, double jurosMensais) {
		super(clienteNumero, clienteSobrenome, clienteRg, clienteCpf, saldoCliente);
		
		this.jurosMensais = jurosMensais;
	}

	public double getJurosMensais() {
		return jurosMensais;
	}

	public void setJurosMensais(double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}
	
	public double depositoPoupanca(double valor) {
		double saldoAtualizado = this.getSaldoCliente() + valor;
		this.setSaldoCliente(this.getSaldoCliente() + valor);
		return saldoAtualizado;
	}
	
	public double recolhaJuros(double jurosMes) {
		double saldoAtualizado = this.getSaldoCliente();
		saldoAtualizado += saldoAtualizado*jurosMensais;
		saldoAtualizado = saldoAtualizado + this.getSaldoCliente();
		return saldoAtualizado;
	}

}
