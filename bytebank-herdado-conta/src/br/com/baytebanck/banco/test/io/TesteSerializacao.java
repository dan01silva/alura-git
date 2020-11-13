package br.com.baytebanck.banco.test.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.baytebanck.banco.modelo.Cliente;
import br.com.baytebanck.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {

		Cliente cliente = new Cliente();
		cliente.setNome("Daniel");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("42689614880");
		
		ContaCorrente cc = new ContaCorrente(0123, 44234);
		cc.deposita(222.3);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
