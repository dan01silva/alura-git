package br.com.baytebanck.banco.modelo;

import java.io.Serializable;

public abstract class Conta implements Comparable<Conta>, Serializable {

	protected double saldo;
	protected int agencia;
	protected int numero;
	protected transient Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		if (this.agencia < 0) {
			throw new IllegalArgumentException("Agencia Invalida");
		}
		this.agencia = agencia;
		if (this.numero < 0) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		this.numero = numero;
		Conta.total++;
		// System.out.println("O total de contas Ã© " + Conta.total);
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteExeception {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteExeception("Saldo da conta: " + this.saldo + " , valor do Saque:" + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExeception {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.numero != outra.numero || this.agencia != outra.agencia) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		return "Número da Agencia e Conta: " + this.agencia + " " + this.getNumero();
	}

}