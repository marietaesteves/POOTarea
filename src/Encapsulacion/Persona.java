package Encapsulacion;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	// Método para mostrar los datos
		public void mostrar() {
			System.out.println("--- Datos de la Persona ---");
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido: " + apellido);
			System.out.println("Edad: " + edad + " años");
		}
		
		
	}
	
	
	
	


