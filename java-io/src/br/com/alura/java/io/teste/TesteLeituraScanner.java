package br.com.alura.java.io.teste;
import java.io.File;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		//falta adicionar o arquivo a fonte do projeto
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
	}	

}
