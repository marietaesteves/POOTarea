package Encapsulacion;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		try {
            setEdad(edad);
        } catch (Exception e) {
            System.out.println("Aviso: " + e.getMessage() + ". Se asignó 0 por defecto.");
        }
	}
	
	
	
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



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) throws Exception  {
		if (edad<0) {
			this.edad=0;
			throw new Exception("La edad no puede ser negativa");
		}
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
	
	
	
	


