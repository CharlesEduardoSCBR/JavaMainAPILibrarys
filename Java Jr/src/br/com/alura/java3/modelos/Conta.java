package br.com.alura.java3.modelos;

public abstract class Conta {

	protected double saldo;
	
	@Override
	public String toString() {    
        return "esse objeto é uma conta com saldo R$" + this.saldo;
    }
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
}
