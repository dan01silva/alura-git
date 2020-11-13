package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws Exception {
		
		
		
		/**
		 * trasformando em um arquivo binário
		 */
//		String nome = "Daniel Mattos";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
//		oos.writeObject(nome);
//		oos.close();
		/**
		 * trasformando o fluxo de bits e bytes e transformando para objeto novamente
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
	}

}
