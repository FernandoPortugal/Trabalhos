package ex_8_2;

import ex_8_1.observer.Noticiario;
import ex_8_1.subject.FonteNoticias;

public class Agregadores extends Noticiario {
		
    private int a = 0;
    private int b = 0;
    private String top;
	
	public Agregadores(FonteNoticias fonte, String nome, String top) {
		super(fonte, nome);
		this.top = top;
		
		}
    
	String agregadorTopico = "";
    String agregadorMensal = "";
    
    
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {

		if(top == topico) {
		a = a + 1;
		agregadorTopico = agregadorTopico +"Veiculo: "+this.getNome()+"\nTopico: "+topico+"\nData: "+dia+"/"+mes+"\n"+textoNoticia+"\n----------------------------\n";
        if (a == 16) {	
        System.out.println(agregadorTopico);
        a = 0;
        agregadorTopico = "";
		}
		}
		
		if (b == 0) {
			b = mes;
			}
		
		if (b == mes) {
			agregadorMensal = agregadorMensal +"Veiculo: "+this.getNome()+" Topico: MENSAL" +"\nData: 0"+"/"+mes+"\n"+textoNoticia+"\n----------------------------\n";
		} else {
			System.out.println(agregadorMensal);
			agregadorMensal = "";
		}
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.notificaNoticia(textoNoticia, dia, mes, topico);
		
	}
	


}