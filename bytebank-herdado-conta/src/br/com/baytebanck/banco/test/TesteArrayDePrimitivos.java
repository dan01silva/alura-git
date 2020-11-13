package br.com.baytebanck.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int idades []= new int[5];
		
		//acessando os dados em cada posição do Array
		for(int i = 0;i < idades.length;i++) {
			idades[i] *= 1;
			
		}
		
		for(int i = 0;i < idades.length;i++) {
			System.out.println(idades[1]);
		}
	}

}
