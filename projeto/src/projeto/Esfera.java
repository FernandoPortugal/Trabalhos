package projeto;

public class Esfera extends Circulo implements Volume {
	private double altura;

	public Esfera(double raio, double altura) {
		super(raio);
		this.altura=altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public double volume() {
		return 1.3333 * Math.PI * Math.pow(raio, 3);
	}
	
	
	@Override
	public double area() {
		return 4*Math.PI *Math.pow(getRaio(), 2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI *getRaio();
	}
	
	
	@Override
	public String toString() {
		return "Esfera [Raio=" + getRaio() + ", Altura=" + getAltura() + "]";
	}
	
	

}
