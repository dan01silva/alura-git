package br.com.baytebanck.banco.test;

import br.com.baytebanck.banco.modelo.CalculadorDeImposto;
import br.com.baytebanck.banco.modelo.ContaCorrente;
import br.com.baytebanck.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
