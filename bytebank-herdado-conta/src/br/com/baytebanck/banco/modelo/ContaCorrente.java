package br.com.baytebanck.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteExeception {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente, " +super.toString();
	}

}
