package es.kolbit.prueba.git;

public class Persona {
	private String nombre;
	private String apodo;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apodo) {
		super();
		this.nombre = nombre;
		this.apodo = apodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
}
