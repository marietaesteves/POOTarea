package Encapsulacion;

public class Contacto {
    // Atributos privados
    private String nombre;
    private String telefono;
    private String email;

    // Constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        setTelefono(telefono); 
        setEmail(email);       
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Validar que el teléfono tenga exactamente 8 dígitos
    public void setTelefono(String telefono) {
        if (telefono.length() == 8) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: El teléfono de " + this.nombre + " debe tener 8 dígitos.");
            this.telefono = "00000000"; // Valor por defecto
        }
    }

    public String getEmail() {
        return email;
    }

    //Validar que el email contenga el carácter @
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: El email '" + email + "' no es válido (falta @).");
            this.email = "sin@correo.com"; // Valor por defecto
        }
    }

    //  Método mostrarContacto()
    public void mostrarContacto() {
        System.out.println("--- Ficha de Contacto ---");
        System.out.println("Nombre:   " + this.nombre);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Email:    " + this.email);
    }
}
