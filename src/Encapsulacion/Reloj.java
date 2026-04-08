package Encapsulacion;

public class Reloj {
    // Atributos privados
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // --- GETTERS Y SETTERS CON VALIDACIÓN ---

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: Hora inválida (0-23). Se asignó 0.");
            this.hora = 0;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: Minuto inválido (0-59). Se asignó 0.");
            this.minuto = 0;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Error: Segundo inválido (0-59). Se asignó 0.");
            this.segundo = 0;
        }
    }

    // REQUISITO: Método mostrarHora() en formato HH:MM:SS
    public String mostrarHora() {
        // Usamos String.format para asegurar que siempre haya 2 dígitos (ej: 09:05:01)
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
