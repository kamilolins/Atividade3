package questao_5;


public class Retangulo implements FormaGeometrica{
	
	private double largura;
	private double altura;
	
	public Retangulo(){
		this.largura=7;
		this.altura=3;
	}
	
	public double getArea() {
		
		return largura * altura;
	}
	
	public double getPerimetro() {
		
		return (2 * largura) + (2 * altura);
		
	}
	
	public void desenhar(){
		
	}

	public int hashcode() {
		final int entrada = 23;
		int hash = 7;
		hash = entrada * hash + (getArea() != 0 ? getArea().hashCode() : 0);
		return hash;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Retangulo)) {
			return false;
		}

		final Retangulo retangulo = (Retangulo) obj;

		if (getArea() == 0)
			return false;

		if (getPerimetro() == 0)
			return false;

		if (getArea() != retangulo.getArea())

			return false;

		if (getPerimetro() != retangulo.getPerimetro())

			return false;

		return true;

	}

	public String toString() {

		return super.toString();

	}

}
