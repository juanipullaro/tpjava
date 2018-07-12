package terminal;

public class Micro {
	
	private int numero;
	private String patente;
	private Conductor conductor = new Conductor();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public Micro(int numero, String patente, Conductor conductor) {
		this.numero = numero;
		this.patente = patente;
		this.conductor = conductor;
	}
	
	
	

}
