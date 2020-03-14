package projeto;

public class Piramide extends Triangulo implements Volume {
	private double largura;
	
	public Piramide(double base, double altura, double lado, double largura) {
		super(base, altura, lado);
		this.largura=largura;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}



	public double volume() {
		return 0.3333 * getBase() * getAltura() * getLargura();
	}
	
	@Override
	public double area() {
		return (getBase() * getAltura())*4;
	}
	
	@Override
	public double perimetro() {
		return getLado() + getLado() + getLado() + getLado() ;
	}
	
	@Override
	public String toString() {
		return "Piramide [Base=" + getBase() + ", Altura=" + getAltura() + ", Lado=" + getLado() + ", Largura=" + getLargura() + "]";
	}
	
	

}
