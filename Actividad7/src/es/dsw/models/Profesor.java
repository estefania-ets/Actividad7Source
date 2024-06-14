package es.dsw.models;

public class Profesor {

	private String nombre, appelido1, apellido2, nif;

	public Profesor(String nombre, String appelido1, String apellido2, String nif) {
		this.nombre = nombre;
		this.appelido1 = appelido1;
		this.apellido2 = apellido2;
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppelido1() {
		return appelido1;
	}

	public void setAppelido1(String appelido1) {
		this.appelido1 = appelido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
	
	
}
