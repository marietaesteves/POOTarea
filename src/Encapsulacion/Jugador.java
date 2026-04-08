package Encapsulacion;

public class Jugador {
	private String nombre;
	private int puntajeActual;
	private int puntajeMaximo;
	
	public Jugador(String nombre, int puntajeActual, int puntajeMaximo) {
		this.nombre = nombre;
		this.puntajeActual = puntajeActual = 0;
		this.puntajeMaximo = puntajeMaximo = 0;
		
	}
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	    this.puntajeActual = 0;
	    this.puntajeMaximo = 0;
	}

	public void actualizarPuntaje(int nuevoPuntaje) {
		if (nuevoPuntaje < 0) {
			System.out.println("Error: El puntaje no puede ser negativo. ");
			return;
		}
		
		this.puntajeActual = nuevoPuntaje;
		
		if (this.puntajeActual > puntajeMaximo) {
			this.puntajeMaximo = this.puntajeActual;
			System.out.println("¡Nuevo record personal para " + nombre + "!");
		}
	}
	
	public void mostrarJugador() {
        System.out.println("--- JUGADOR ---");
        System.out.println("Nombre:   " + this.nombre);
        System.out.println("Puntaje Actual: " + this.puntajeActual);
        System.out.println("Puntaje Maximo: " + this.puntajeMaximo);
    }
	
	
	
	

}
