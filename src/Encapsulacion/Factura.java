package Encapsulacion;

public class Factura {
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor con validaciones
    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        
        // Validación: cantidad > 0
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 1; // Valor por defecto
            System.out.println("Nota: Cantidad ajustada a 1 (mínimo requerido).");
        }

        // Validación: precio > 0
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 0.0;
            System.out.println("Nota: Precio unitario no puede ser negativo.");
        }
    }

    // Retorna el cálculo
    public double calcularTotal() {
        return this.cantidad * this.precioUnitario;
    }

    // Imprime detalles + total
    public void mostrarFactura() {
        System.out.println("Código de Factura: " + codigoFactura);
        System.out.println("Descripción:       " + descripcion);
        System.out.println("Cantidad:          " + cantidad);
        System.out.println("Precio Unitario:   Q" + precioUnitario);
        System.out.println("----------------------------------------");
        System.out.println("TOTAL A PAGAR:     Q" + calcularTotal());
        System.out.println("----------------------------------------");
    }
}