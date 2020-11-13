package br.com.baytebanck.banco.test;

import br.com.baytebanck.banco.modelo.ContaPoupanca;
import br.com.baytebanck.banco.modelo.ContaCorrente;
import br.com.baytebanck.banco.modelo.Cliente;
import br.com.baytebanck.banco.modelo.Conta;

public class TesteObject {

	public static void main(String[] args) {
//		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Conta c = new ContaCorrente(523,1254);
		Object cp = new ContaPoupanca(231,1223);
		ContaCorrente cc = new ContaCorrente(451,1535);
		Cliente cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		//println(cliente);
	}

}
