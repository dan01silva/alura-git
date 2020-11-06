package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Fluxo de saída do arquivo
		 */
//		OutputStream fos = new FileOutputStream("lorem.txt2");
//		Writer osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem.txt2"));
		PrintStream ps = new PrintStream(new File("Lorem.txt2"));
		PrintWriter pw = new PrintWriter("Lorem.txt2");
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.write(System.lineSeparator());
		pw.write(System.lineSeparator());
		bw.write("id est laborum.");
		bw.close();
	}

}
