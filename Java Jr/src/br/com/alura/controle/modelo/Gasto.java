package br.com.alura.controle.modelo;

import java.util.Calendar;

import br.com.alura.java3.modelos.Funcionario;

public class Gasto {
	
	private double valor;
    private String tipo;
    private Funcionario funcionario;
    private Calendar data;
    
	public Gasto(double valor, String tipo, Funcionario funcionario, Calendar data) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
    
    @Override
    public String toString() {
    	return this.funcionario.toString();
    }
}