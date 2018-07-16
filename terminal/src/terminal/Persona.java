package terminal;

import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String tipo_dni;
	private Date fecha_nacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTipo_dni() {
		return tipo_dni;
	}
	public void setTipo_dni(String tipo_dni) {
		this.tipo_dni = tipo_dni;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fechaNacimiento) {
		this.fecha_nacimiento = fechaNacimiento;
	}
	
	public Persona(String nombre, String apellido,int dni, String tipo_dni, Date fecha_nacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipo_dni = tipo_dni;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
		

}
