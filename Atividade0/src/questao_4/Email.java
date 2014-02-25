package questao_4;


public class Email {
	
	private String enderecoOrigem;
	private String enderecoDestino;
	private String mensagem;
	private String data;
	private String anexo1;
	private String anexo2;
	private String anexo3;
	
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getAnexo1() {
		return anexo1;
	}
	
	public void setAnexo1(String anexo1) {
		
		if(!anexo1.equals(null)){
			
			if((!anexo1.equals(anexo2)) &&(!anexo1.equals(anexo3)) ){
				this.anexo1 = anexo1;
			}
		}
		
		
	}
	
	public String getAnexo2() {
		return anexo2;
	}
	
	public void setAnexo2(String anexo2) {
		
		if(!anexo2.equals(null)){
			
			if((!anexo2.equals(anexo1)) &&(!anexo2.equals(anexo3)) ){
				this.anexo2 = anexo2;
			}
		}
		
		
	}
	
	public String getAnexo3() {
		return anexo3;
	}
	
	public void setAnexo3(String anexo3) {
		
		if(!anexo3.equals(null)){
			
			if((!anexo3.equals(anexo1)) &&(!anexo3.equals(anexo2)) ){
				this.anexo3 = anexo3;
			}
		}
		
		
	}
	
	public int hashcode() {
		final int entrada=23;
		int hash = 7;
		hash =  entrada * hash + (getEnderecoOrigem() != null ? getEnderecoOrigem().hashCode() : 0);
		hash =  entrada * hash + (getEnderecoDestino() != null ? getEnderecoDestino().hashCode() : 0);
		hash =  entrada * hash + (getMensagem() != null ? getMensagem().hashCode() : 0);
		hash =  entrada * hash + (getAnexo1() != null ? getAnexo1().hashCode() : 0);
		hash =  entrada * hash + (getAnexo2() != null ? getAnexo2().hashCode() : 0);
		hash =  entrada * hash + (getAnexo3() != null ? getAnexo3().hashCode() : 0);

		return hash;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Email)) {
			return false;
		}

		final Email email = (Email) obj;

		if (getEnderecoOrigem() == null)
			return false;

		if (getEnderecoDestino() == null)
			return false;

		if (getMensagem() == null)
			return false;

		if (getData() == null)
			return false;

		if (getAnexo1() == null)
			return false;

		if (getAnexo2() == null)
			return false;

		if (getAnexo3() == null)
			return false;

		if (!getEnderecoOrigem().equals(email.getEnderecoOrigem()))
			return false;

		if (!getEnderecoDestino().equals(email.getEnderecoDestino()))
			return false;

		if (!getAnexo1().equals(email.getAnexo1()))
			return false;

		if (!getAnexo2().equals(email.getAnexo2()))
			return false;

		if (!getAnexo3().equals(email.getAnexo3()))
			return false;

		return getMensagem().equals(email.getMensagem());

	}

	public String toString() {

		return super.toString();

	}
	

}
