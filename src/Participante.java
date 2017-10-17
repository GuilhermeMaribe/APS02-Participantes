
public class Participante {
	private String nome,email;
	private int numPart;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getNumPart() {
		return numPart;
	}

	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}
	
	@Override
	public String toString() {
		return "\nParticipante n°: "+ numPart +"\nNome: " + nome + "\nE-mail: " + email+"\n";
	}

}
