package questao_3;

public class Anexo {

	private String nome;
	private String texto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTexto() {
		return texto;
	}

	public boolean containss(String p) {

		if (texto.toLowerCase().contains(p.toLowerCase())) {

			return true;

		} else {

			return false;

		}

	}

	public int hashcode() {
		final int entrada = 23;
		int hash = 7;
		hash = entrada * hash
				+ (getTexto() != null ? getTexto().hashCode() : 0);

		return hash;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Anexo)) {
			return false;
		}

		final Anexo anexo = (Anexo) obj;

		if (getNome() == null)
			return false;

		if (getTexto() == null)
			return false;

		return getTexto().equals(anexo.getTexto());

	}

	public String toString() {

		return super.toString();

	}

}
