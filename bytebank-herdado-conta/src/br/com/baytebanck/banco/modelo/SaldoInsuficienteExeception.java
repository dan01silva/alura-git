package br.com.baytebanck.banco.modelo;

public class SaldoInsuficienteExeception extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  SaldoInsuficienteExeception(String msg) {
		super(msg);
	};

}
