package terminal;

public class Butaca {
	int numero;
	Persona persona = new Persona();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Butaca(int numero, Persona persona) {
		this.numero = numero;
		this.persona = persona;
	}
	
	
	
	
}
