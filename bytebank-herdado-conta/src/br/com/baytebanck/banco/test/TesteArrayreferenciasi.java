package br.com.baytebanck.banco.test;

import br.com.baytebanck.banco.modelo.ContaCorrente;

public class TesteArrayreferenciasi {

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente[] contas= new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(465,7789);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(223, 4422);
		contas[1] = cc2;
		
		System.out.println(cc2.getNumero());
		
		/**
		 * Acessando método da classe por uma cópia da referencia
		 */
		System.out.println( contas[0].getNumero());
		ContaCorrente refCopia = contas[0];
		System.out.println(refCopia.getNumero());
					//igual á:
		System.out.println(cc2.getNumero());
		
		
		
	}

}
