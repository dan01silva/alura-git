package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Fluxo de saída do arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem.txt2");
//		Writer osw = new OutputStreamWriter(fos);
		
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem.txt2"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("id est laborum.");
		bw.close();
	}

}
