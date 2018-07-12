package terminal;

import java.util.Date;


public class Servicio {
	
	
	private int numero;
	private Date datetime = new Date();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
}
