package questao_5;

public class Main {
	
	public static void main(String[] args) {
		
		Retangulo quadro= new Retangulo();
		Circulo aro= new Circulo();
		
		System.out.println("A area do quadro �-> "+quadro.getArea()+"\nO perimentro do quadro �-> "+quadro.getPerimetro());
		
		System.out.println("A area do aro �-> "+aro.getArea()+"\nO perimentro do aro �-> "+aro.getPerimetro());
	}

}
