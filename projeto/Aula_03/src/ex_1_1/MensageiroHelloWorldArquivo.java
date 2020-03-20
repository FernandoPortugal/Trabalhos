package ex_1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MensageiroHelloWorldArquivo implements Mensageiro {

	@Override
	public void escrever() {
		try {
			PrintWriter escritor= new PrintWriter(" mensagem.txt");
		escritor.write("OLA,mundo!");
		escritor.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		
		}
		
	}

}
