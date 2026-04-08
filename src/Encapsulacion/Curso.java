package Encapsulacion;

public class Curso {
	private String nombreCurso;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
		this.nombreCurso = nombreCurso;
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNota1() {
		return nota1;
	}

	// Agregamos la validación de 0 a 100
	public void setNota1(double nota1) {
		if (nota1 >= 0 && nota1 <= 100) {
			this.nota1 = nota1;
		} else {
			System.out.println("Error: Nota 1 fuera de rango (0-100).");
		}
	}

	public double getNota2() {
		return nota2;
	}

	// Agregamos la validación de 0 a 100
	public void setNota2(double nota2) {
		if (nota2 >= 0 && nota2 <= 100) {
			this.nota2 = nota2;
		} else {
			System.out.println("Error: Nota 2 fuera de rango (0-100).");
		}
	}

	public double getNota3() {
		return nota3;
	}

	//Agregamos la validación de 0 a 100
	public void setNota3(double nota3) {
		if (nota3 >= 0 && nota3 <= 100) {
			this.nota3 = nota3;
		} else {
			System.out.println("Error: Nota 3 fuera de rango (0-100).");
		}
	}
	// --- MÉTODOS 

	// Método promedio
	public double promedio() {
		double suma = this.nota1 + this.nota2 + this.nota3;
		return suma / 3;
	}

	// Método estado
	public String estado() {
		if (this.promedio() >= 61) {
			return "Aprobado";
		} else {
			return "Reprobado";
		}
	}
}