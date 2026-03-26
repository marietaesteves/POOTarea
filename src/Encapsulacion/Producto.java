package Encapsulacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void aplicarDescuento(double porcentaje) {
        double descuento = this.precio * (porcentaje / 100);
        this.precio = this.precio - descuento;
        System.out.println("Se aplicó un descuento del " + porcentaje + "% a " + nombre);
    }

    // Método para ver el estado actual del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Código: " + codigo + " | Precio Actual: Q" + precio);
    }
	
	

}
