package questao_7;

public class Main {
	
	public static void main(String[] args) {
		
		Caixa caixa1 = new Caixa();
		Caixa caixa2 = new Caixa();
		Caixa caixa3 = new Caixa();
		Caixa caixa4 = new Caixa();
		
		
		Caixa.filaDeEspera.offer("kamilo");
		Caixa.filaDeEspera.offer("naria");
		Caixa.filaDeEspera.offer("Jose");
		Caixa.filaDeEspera.offer("rafa");
		Caixa.filaDeEspera.offer("luis");
		Caixa.filaDeEspera.offer("xica");
		Caixa.filaDeEspera.offer("xupeta");
		Caixa.filaDeEspera.offer("doido");
		Caixa.filaDeEspera.offer("varrido");
		Caixa.filaDeEspera.offer("Lucia");
		Caixa.filaDeEspera.offer("Fer");
		Caixa.filaDeEspera.offer("angel");
		Caixa.filaDeEspera.offer("Tito");
		Caixa.filaDeEspera.offer("pipa");
		
		caixa1.proximo();
		caixa2.proximo();
		caixa3.proximo();
		caixa4.proximo();
		caixa1.proximo();
		caixa4.proximo();
		caixa4.proximo();
		caixa2.proximo();
		
		System.out.println("caixa1->"+caixa1.getAtendidos());
		System.out.println("caixa2->"+caixa2.getAtendidos());
		System.out.println("caixa3->"+caixa3.getAtendidos());
		System.out.println("caixa4->"+caixa4.getAtendidos());
		
		
		
		
		
		
	
	}
	
	
	


}
