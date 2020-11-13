package br.com.baytebanck.banco.test;

import br.com.baytebanck.banco.modelo.ContaCorrente;
import br.com.baytebanck.banco.modelo.SaldoInsuficienteExeception;

public class TesteSaca {
	public static void main(String[] args) {
		
		 ContaCorrente  contac = new  ContaCorrente(132, 231) {};
		
		contac.deposita(200);
			try {
			contac.saca(190.00);	
			}catch( SaldoInsuficienteExeception e) {
				e.printStackTrace();	
			}
			System.out.println(contac.getSaldo());

	}
}