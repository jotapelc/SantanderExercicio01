package br.com.santanderExercicio01;

public class Cliente {

	private String clienteNumero;
	private String clienteSobrenome;
	private String clienteRg;
	private String clienteCpf;
	
	public Cliente(String clienteNumero, String clienteSobrenome, String clienteRg,
			String clienteCpf) {
		super();
		this.clienteNumero = clienteNumero;
		this.clienteSobrenome = clienteSobrenome;
		this.clienteRg = clienteRg;
		this.clienteCpf = clienteCpf;
	}

	public String getClienteNumero() {
		return clienteNumero;
	}

	public void setClienteNumero(String clienteNumero) {
		this.clienteNumero = clienteNumero;
	}

	public String getClienteSobrenome() {
		return clienteSobrenome;
	}

	public void setClienteSobrenome(String clienteSobrenome) {
		this.clienteSobrenome = clienteSobrenome;
	}

	public String getClienteRg() {
		return clienteRg;
	}

	public void setClienteRg(String clienteRg) {
		this.clienteRg = clienteRg;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

}
