package br.com.baytebanck.banco.test;

import br.com.baytebanck.banco.modelo.Conta;
import br.com.baytebanck.banco.modelo.ContaCorrente;
import br.com.baytebanck.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
        
        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());

	}

}
