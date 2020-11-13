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
		 * IsEmpty Perguntando para o java se a String está vazia, e ele devolve um boolean (False ou True)
		 */
		String vazio = "  Alura  ";
		//método Trim remove os espaços da String e reapresenta ela
		String outroVazio = vazio.trim();
		System.out.println(vazio.isEmpty());
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		/**
		 * Lê quantos todos os caracteres dentro da String
		 */
//		System.out.println(nome.length());
//		//Exemplo de uso:
//		for(int i = 0; i < nome.length();i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		/**
		 * SubString, recebe um inteiro e cria uma SubString a partir da posição inserida
		 */
//		String sub= nome.substring(1);
//		System.out.println(sub);
		
		/**
		 * Passado uma String, return a posição inicial desse Caracter desntro da String 
		 */
//		int pos = nome.indexOf("ur");
//		System.out.println(pos); 
		
		/**
		 * Altera a String do primeiro argumento pela do Segundo Argumento
		 */
		//String outro = nome.replace("A", "a");
		
		/**
		 * Altera o formato da String, Lower para minúsculo e Upper para maiúsculas 
		 */
//		String outro = nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outro);	
	}

}
