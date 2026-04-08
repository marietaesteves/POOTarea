package Encapsulacion;

public class Estudiante {
	private int carnet;
	private String nombre;
	private double promedio;
	
	public Estudiante(int carnet, String nombre, double promedio) {
		this.carnet = carnet;
		this.nombre = nombre;
		setPromedio(promedio);
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		if(promedio >=0 && promedio <=100) {
		this.promedio = promedio;
		}else { 
		System.out.println("Error: El promedio de: "+ this.nombre + "Debe estar entre cero y 100");
		this.promedio = 0;
	  }
	}
	
	//Beca
	public boolean esBecado() {
		if(this.promedio >=85) {
			return true;
		}else {
			return false;
		}
	}
	}

