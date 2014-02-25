package questao_5;

public class Circulo implements FormaGeometrica{
	
	static final double PI=3.14;
	private double raio;
	
	public Circulo(){
		this.raio=3;
	}
	
	public double getArea(){
		
		return PI * (this.raio * this.raio);
		
	}
	
	public double getPerimetro(){
		
		return this.raio * (2 * PI);
		
	}
	
	public void desenhar(){
		
	}

}
