package Encapsulacion;

public class Cuenta {
	private String titular;
	private double saldo;
	private int Pin;
	
	public Cuenta(String titular, double saldo, int Pin) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.Pin = Pin;
	}
	
	// Método para sumar dinero al saldo
	public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso: +Q" + monto);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
        
    }
	
	// Método para restar dinero al saldo (Validación de saldo negativo)
    public void retirar(double monto, int PinIngresado) {
    	if(Pin == PinIngresado) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso: -Q" + monto);
        } else if (monto > this.saldo) {
            System.out.println("Error: Fondos insuficientes para retirar Q" + monto);
        } else {
            System.out.println("Error: El monto a retirar debe ser positivo.");
        }
    } else {
    	System.out.println("Error: Pin Incorrecto");
    }
    }
    
 // Método para consultar el estado de la cuenta
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Actual: Q" + saldo);
    }
}


