package ex_8_2;

import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public class Teste {

	public static void main(String[] args) {
		
FonteNoticias fonte = new FonteNoticias();
		
		Agregadores obs1 = new Agregadores(fonte, "Globoesporte", "esporte");	
		obs1.assina();
        Publicadores obs2 = new Publicadores(fonte, "Estadao");
        obs2.assina();
		
		Noticia noticia = new Noticia();
		noticia.setTexto(" Após pausa na NBA devido ao Covid-19, Houston rockets volta com tudo e atropela Milwaukee Bucks. ");
		noticia.setDia(2);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Em jogo dificil, LeBron James faz a diferenca e Lakers vence Oklahoma por 120-118. ");
		noticia.setDia(3);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" No treino qualificátorio para a corrida da Australia de Formula 1, Lando Norris domina e conquista a primeira pole da carreira. ");
		noticia.setDia(4);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Com show de McLaren e Renault, Lando Norris vence a corrida de ponta a ponta, Daniel Ricciardo faz corrida incrivel e conquista a segunda posicao, Leclerc é terceiro. ");
		noticia.setDia(5);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Utah Jazz conquista sua décima vitoria seguida. ");
		noticia.setDia(7);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Com oscilacoes do Bucks, Raptors conquista a lideranca na conferencia do leste. ");
		noticia.setDia(8);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Crise no Bucks? Time perde a quinta partida seguida. ");
		noticia.setDia(10);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Semifinais do paulista decidido, Santo Andre surpreende e Corinthians fica fora. ");
		noticia.setDia(11);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Sobe o preço do barril de petroleo. ");
		noticia.setDia(13);
		noticia.setMes(4);
		noticia.setTopico("economia");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Decidido os playoffs da NBA. ");
		noticia.setDia(14);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Houston Rockets vence com facilidade o Dallas Mavericks, Jazz mantem boa fase e desbanca Denver Nuggets,"
				+ " Miami Heats surpreende e o gigante Boston Celtics cai na primeira fase. ");
		noticia.setDia(17);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Daniel Ricciardo conquista a pole no GP da Malasia. ");
		noticia.setDia(18);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Charles Leclers vence a primeira do ano, Hamilton é apenas o setimo, seria o comeco do fim para a Mercedes? ");
		noticia.setDia(19);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Bucks sofre mas ganha, Jazz cai para o Lakers, finais de conferencias sao decididas: Rockets x Lakers, Bucks x Heat.  ");
		noticia.setDia(22);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" James Harden mostra porque e o mvp da temporada, brilha, e Houston Rockets conquista o titulo da conferencia do oeste,"
				+ " em jogo apertado Bucks vence a conferencia do leste. ");
		noticia.setDia(25);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Em uma final dominante, James Harden guia o Houston Rockets para a vitoria e vence o titulo da NBA. ");
		noticia.setDia(30);
		noticia.setMes(4);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Com show de Marinho e Carlos Sanchez, Santos vence o Palmeiras e e campeao do Paulista. ");
		noticia.setDia(3);
		noticia.setMes(5);
		noticia.setTopico("esporte");
		fonte.setNoticia(noticia);

	}
}