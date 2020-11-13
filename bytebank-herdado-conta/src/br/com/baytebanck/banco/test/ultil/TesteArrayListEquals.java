package br.com.baytebanck.banco.test.ultil;

import java.util.ArrayList;

import br.com.baytebanck.banco.modelo.Conta;
import br.com.baytebanck.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
//		Conta dd1 = new ContaCorrente(33, 33);
//		Conta dd2 = new ContaCorrente(33, 33);
//		
//		boolean iguale = dd1.ehIgual(dd2);
//		System.out.println(iguale);
		
		
		//<> Gererics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc3);
		
//		System.out.println("Já Existe?: "+ existe);
//		
//		for(Conta conta : lista) {
//			if(conta.ehIgual(cc3)) {
//				System.out.println("Já tenho está Conta	");
//			}
//		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
				
	}
}
