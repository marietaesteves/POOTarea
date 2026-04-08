package Encapsulacion;

public class Termometro {
	private double celsius;

    
    public Termometro(double celsius) {
        setCelsius(celsius);
    }

   
    public double getCelsius() {
        return celsius;
    }

    // Validar el cero absoluto (-273.15)
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Error: Temperatura por debajo del cero absoluto (-273.15°C).");
            this.celsius = -273.15; // Lo fijamos al límite mínimo
        }
    }

    // REQUISITO: Conversión a Fahrenheit
    // Fórmula: (Celsius * 9/5) + 32
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}


