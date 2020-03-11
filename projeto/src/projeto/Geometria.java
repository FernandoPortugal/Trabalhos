package projeto;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Circulo(1.0));
		figuras.add(new Circulo(2.0));
		figuras.add(new Retangulo(3,5));
		figuras.add(new Quadrado(5));
		figuras.add(new Triangulo(4,6,5));
		figuras.add(new Losango(8,6,5));
		figuras.add(new Trapezio(7,4,6));
		
		for(Figura figura: figuras) {
			System.out.println("**********************************************");
			System.out.println(figura);
			System.out.println("Área = "+figura.area());
			System.out.println("Perimetro = "+figura.perimetro());
			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}
		
		}
	}

}
