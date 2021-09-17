package es.kolbit.prueba.git;

public class GitTest {
	public static void main(String[] args) {
		System.out.println("He modificado el código!!!");
		System.out.println("Ahora he agregado nuevo código");
		
		System.out.println("Estos cambios son despues de subir hithub");
		System.out.println("modificaciones con una nueva rama");
		
		Persona p = new Persona("Pablito");
		
		System.out.println("\nHola " + p.getNombre());
	}
}
