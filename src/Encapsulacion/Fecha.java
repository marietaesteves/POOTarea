package Encapsulacion;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	// Método que valida rangos básicos
    public boolean esValida() {
        // Validamos que el mes esté entre 1 y 12
        // Y que el día esté entre 1 y 31
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar la fecha en formato legible
    public void mostrarFecha() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
    }
	
	

}
