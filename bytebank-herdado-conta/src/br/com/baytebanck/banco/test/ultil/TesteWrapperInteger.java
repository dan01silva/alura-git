package br.com.baytebanck.banco.test.ultil;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[10];
		
		int idade = 29;
		
		//Autoboxing 
		Integer idadeRef = Integer.valueOf(29);
		//Unboxing 
		int valor = idadeRef.intValue();
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		String s = args[0];//10
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing 
		
	}

}
