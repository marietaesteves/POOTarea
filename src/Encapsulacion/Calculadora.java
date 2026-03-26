package Encapsulacion;

public class Calculadora {
	private int num1;
	private int num2;
	
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Métodos de operación
    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }
 // Método con validación de división entre cero
    public double dividir() {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; // Retornamos 0 como valor por defecto en caso de error
        }
        return num1 / num2;
    }

    // Método para mostrar todos los resultados a la vez
    public void mostrarResultados() {
        System.out.println("Operaciones con " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + (num2 == 0 ? "Indefinida" : dividir()));
        System.out.println("------------------------------------");
    }
    
	

}
