package questao_6;

public class Contador {
	
	final int inicio=0;
	private int valorAtual;
	private boolean incrementou;
	
	public Contador(){
	
		this.valorAtual = inicio;
		this.incrementou=false;
	
	}
	
	public void incrementarI(){
		
		valorAtual++;
		incrementou=true;
		
	}
	
	public int getValor(){
	
		return valorAtual;
	
	}
	
	public void desfazer(){
	
		if (valorAtual <= inicio){
		
			System.out.println("O valor atual não pode ser decrementado pois é menor ou igual a 0!!!");
		
		}else{
			
			if(incrementou){
			
				valorAtual--;
				incrementou=false;
			
			}else{
			
				System.out.println("O ultimo incremento ja foi desfeito!!!");
			
			}
		
		}
		
	}

}
