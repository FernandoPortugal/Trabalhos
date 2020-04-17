package ex_5_1;

public class IOFacade {	
	
	public void lerTxt() {
	
		LerArquivoTexto txt = new LerArquivoTexto();
		String stxt = "";
		stxt = txt.lerArquivoTxt();
		System.out.println(stxt+"\n");
	}
	
	public void lerBinario() {
	
		LerArquivoBinario bn = new LerArquivoBinario();
		String sbn = "";
		sbn = bn.lerArquivoBinario();
		System.out.println(sbn+"\n");
	}

	public void lerObjeto() {
	
		LerArquivoObjeto obj = new LerArquivoObjeto();
		String sobj = "";
		sobj = obj.lerArquivoObjeto();
		System.out.println(sobj+"\n");
	}
}