package Encapsulacion;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	// Método que retorna un booleano
    public boolean esLargo() {
        if (this.paginas > 300) {
            return true;
        } else {
            return false;
        }
    }
    
 // Método para mostrar información básica
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
	
	

}
