package terminal;

import java.util.Date;


public class Servicio {
	
	
	private int numero;
	private Date fecha = new Date();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Servicio(int numero,Date fecha) {
		this.numero = numero;
		this.fecha = fecha;
	}
}
