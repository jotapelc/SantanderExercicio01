package br.com.santanderExercicio01;
import br.com.santanderExercicio01.Cliente;

public class Conta extends Cliente {
	
	protected double saldoCliente;

	public Conta(String clienteNumero, String clienteSobrenome, String clienteRg, String clienteCpf,
			double saldoCliente) {
		super(clienteNumero,  clienteSobrenome, clienteRg, clienteCpf);
		
		this.saldoCliente = saldoCliente;
	}


	public double getSaldoCliente() {
		return saldoCliente;
	}

	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public String getClieteNumero(String clienteNumero) {
		return clienteNumero;
	}
	
	public void setClienteNumero(String numeroCliente) {
		this.getClieteNumero(getClienteNumero());
	}
	
}
