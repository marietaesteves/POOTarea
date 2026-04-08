package Encapsulacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	
	public Producto(int codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		try {
            setprecio(precio);
        } catch (Exception e) {
            System.out.println("Aviso: " + e.getMessage());
        }
		
		
		try {
            setstock(stock);
        } catch (Exception e) {
            System.out.println("Aviso: " + e.getMessage());
        }
	}

	
	public void aplicarDescuento(double porcentaje) {
        double descuento = this.precio * (porcentaje / 100);
        this.precio = this.precio - descuento;
        System.out.println("Se aplicó un descuento del " + porcentaje + "% a " + nombre);
    }

    // Método para ver el estado actual del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Código: " + codigo + " | Precio Actual: Q" + precio +"Stock Disponible: " + stock );
    }
	
    public void setprecio(double precio) throws Exception {
    	if(precio<0) {
    		this.precio=0;
    		throw new Exception ("El precio no puede ser menor a 0:");
    	}
    	this.precio=precio;
    }
    	
    public void setstock(int stock) throws Exception {
    	if (stock<0) {
    	this.stock=0;
    	throw new Exception ("No hay mas productos disponibles");
    	}
    	this.stock=stock;
    	
    }
    
    //Método vender
    public void Vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0");
            return; 
        }

        if (this.stock >= cantidad) {
            this.stock = this.stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " Unidades de " + nombre);
            System.out.println("Stock restante: " + this.stock);
        } else { 
            System.out.println("Error: No hay suficiente stock disponible. Stock Actual: " + this.stock);
        }
    }
}
    
	
