package questao_7;


import java.util.PriorityQueue;
import java.util.Queue;

public class Caixa {
	
	public static Queue <String> filaDeEspera; 
	private Queue <String> atendidos;
	
	


	public Caixa(){
		this.filaDeEspera = new PriorityQueue<String>();
		this.atendidos = new PriorityQueue<String>();
	}
	
	
	public Queue<String> getAtendidos() {
		return atendidos;
	}

	
	public void proximo(){
		
		atendidos.offer(filaDeEspera.poll());
		
	}

}
