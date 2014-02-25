package questao_5;

public class Main {
	
	public static void main(String[] args) {
		
		Retangulo quadro= new Retangulo();
		Circulo aro= new Circulo();
		
		System.out.println("A area do quadro é-> "+quadro.getArea()+"\nO perimentro do quadro é-> "+quadro.getPerimetro());
		
		System.out.println("A area do aro é-> "+aro.getArea()+"\nO perimentro do aro é-> "+aro.getPerimetro());
	}

}
