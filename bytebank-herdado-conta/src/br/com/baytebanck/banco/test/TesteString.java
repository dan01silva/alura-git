package br.com.baytebanck.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		
		//int a = 3;
		String nome = "Alura";//object literal
		//String outro = new String("Alura");
		 
		//char b = 'A';
		//char c = nome.charAt(3); 
//		char d = nome.charAt(3);
//		System.out.println(d);
		
		
		/**
		 * IsEmpty Perguntando para o java se a String est� vazia, e ele devolve um boolean (False ou True)
		 */
		String vazio = "  Alura  ";
		//m�todo Trim remove os espa�os da String e reapresenta ela
		String outroVazio = vazio.trim();
		System.out.println(vazio.isEmpty());
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		/**
		 * L� quantos todos os caracteres dentro da String
		 */
//		System.out.println(nome.length());
//		//Exemplo de uso:
//		for(int i = 0; i < nome.length();i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		/**
		 * SubString, recebe um inteiro e cria uma SubString a partir da posi��o inserida
		 */
//		String sub= nome.substring(1);
//		System.out.println(sub);
		
		/**
		 * Passado uma String, return a posi��o inicial desse Caracter desntro da String 
		 */
//		int pos = nome.indexOf("ur");
//		System.out.println(pos); 
		
		/**
		 * Altera a String do primeiro argumento pela do Segundo Argumento
		 */
		//String outro = nome.replace("A", "a");
		
		/**
		 * Altera o formato da String, Lower para min�sculo e Upper para mai�sculas 
		 */
//		String outro = nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outro);	
	}

}
