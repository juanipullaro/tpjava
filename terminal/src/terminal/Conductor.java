package terminal;

import java.util.Date;

public class Conductor extends Persona{

	private Date fecha_inicio = new Date();
	private int contrato;
	
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public int getContrato() {
		return contrato;
	}
	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	
	public Conductor(Date fecha_inicio,int contrato) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.contrato = contrato;
		
	}
	
	
	
	

}
