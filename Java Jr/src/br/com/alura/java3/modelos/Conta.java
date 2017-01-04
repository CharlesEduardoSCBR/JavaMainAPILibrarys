package br.com.alura.java3.modelos;

public abstract class Conta {

	protected double saldo;
	private int numero;

	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero;
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
