package Encapsulacion;

public class ClasePrincipal2 {
    public static void main(String[] args) {
        // CLASE 4: CURSO Y CALIFICACIONES
        Curso curso1 = new Curso("Programacion I", 71, 69, 78);
        
        System.out.println("========================================");
        System.out.println("       REPORTE DE CALIFICACIONES        ");
        System.out.println("========================================");
        
        System.out.println("Curso: " + curso1.getNombreCurso());
        System.out.println("Nota 1: " + curso1.getNota1());
        System.out.println("Nota 2: " + curso1.getNota2());
        System.out.println("Nota 3: " + curso1.getNota3());
        
        System.out.println("----------------------------------------");
        
        double promedioFinal = curso1.promedio();
        String resultadoEstado = curso1.estado();
        
        System.out.printf("Promedio Final: %.2f\n", promedioFinal);
        System.out.println("Estado del Estudiante: " + resultadoEstado);
        System.out.println("========================================");
        
        System.out.println("\n--- Prueba de Seguridad ---");
        System.out.println("Intentando asignar una nota inválida (150)...");
        curso1.setNota1(150); 
        
        
        // CLASE 5: ESTUDIANTE Y BECAS
        System.out.println("\n========================================");
        System.out.println("       DATOS DEL ESTUDIANTE             ");
        System.out.println("========================================");

        // CORRECCIÓN: Quitamos las comillas y el guion al carnet para que sea un número (int)
        Estudiante est1 = new Estudiante(2024001, "Ana Martínez", 92.5);
        Estudiante est2 = new Estudiante(2024002, "Luis Tobar", 75.0);

        // Mostramos información de Estudiante 1
        System.out.println("Carnet: " + est1.getCarnet());
        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Promedio: " + est1.getPromedio());
        
        if (est1.esBecado()) {
            System.out.println("Resultado: ¡TIENE BECA ASIGNADA!");
        } else {
            System.out.println("Resultado: No califica para beca.");
        }

        System.out.println("----------------------------------------");

        // Mostramos información de Estudiante 2
        System.out.println("Estudiante: " + est2.getNombre());
        System.out.println("Promedio: " + est2.getPromedio());
        System.out.println("¿Es becado?: " + (est2.esBecado() ? "SÍ" : "NO"));
        
        System.out.println("========================================");
        
        
        
     // CLASE 6: TERMÓMETRO Y CONVERSIÓN
        System.out.println("\n========================================");
        System.out.println("       CONTROL DE TEMPERATURA           ");
        System.out.println("========================================");

       
        Termometro miTermometro = new Termometro(25.0); // 25 grados Celsius

        System.out.println("Temperatura actual: " + miTermometro.getCelsius() + "°C");
        
       
        System.out.printf("Conversión a Fahrenheit: %.2f°F\n", miTermometro.getFahrenheit());

        System.out.println("----------------------------------------");

        // 3. Prueba de validación (Cero absoluto)
        System.out.println("Intentando asignar -500°C (Imposible)...");
        miTermometro.setCelsius(-500);
        
        System.out.println("Temperatura ajustada al límite: " + miTermometro.getCelsius() + "°C");
        System.out.printf("Fahrenheit en el cero absoluto: %.2f°F\n", miTermometro.getFahrenheit());
        
        System.out.println("========================================");
        
        
     // CLASE 7: RELOJ Y FORMATO DE TIEMPO
        System.out.println("\n========================================");
        System.out.println("       CONTROL DE TIEMPO (RELOJ)        ");
        System.out.println("========================================");

        
        Reloj miReloj = new Reloj(14, 30, 5); // 14:30:05

        
        System.out.println("Hora configurada: " + miReloj.mostrarHora());

        System.out.println("----------------------------------------");

        
        System.out.println("Intentando configurar 25:70:99...");
        miReloj.setHora(25);
        miReloj.setMinuto(70);
        miReloj.setSegundo(99);
        
        System.out.println("Hora después de la validación: " + miReloj.mostrarHora());
        System.out.println("========================================");
        
     // CLASE 8: GESTIÓN DE CONTACTOS
        System.out.println("\n========================================");
        System.out.println("       AGENDA DE CONTACTOS              ");
        System.out.println("========================================");

        //  Crear un contacto válido
        Contacto c1 = new Contacto("Juan Pérez", "55443322", "juan@correo.com");
        c1.mostrarContacto();

        System.out.println("----------------------------------------");

        //Crear un contacto con errores para probar validaciones
        // Teléfono de 5 dígitos y correo sin @
        Contacto c2 = new Contacto("María López", "12345", "marialopez.com");
        
        System.out.println("\n--- Datos corregidos por el sistema ---");
        c2.mostrarContacto();
        
        System.out.println("========================================");
        
      // CLASE 9: JUEGO CON PUNTAJE MAXIMO
        System.out.println("\n========================================");
        System.out.println("       PUNTAJE MAXIMO              ");
        System.out.println("========================================");
        
        System.out.println("\n--- INFOMACIÓN DE LOS JUGADORES ---");
        Jugador p1 = new Jugador ("Artemis");
        p1.actualizarPuntaje(150);
        p1.actualizarPuntaje(100);
        p1.actualizarPuntaje(200);
        p1.mostrarJugador();
        
        
        Jugador p2 = new Jugador ("Jorge");
        p2.actualizarPuntaje(145);
        p2.actualizarPuntaje(500);
        p2.actualizarPuntaje(100);
        
        
        p2.mostrarJugador();
        
     // CLASE 10: FACTURA CON TOTAL
        System.out.println("\n========================================");
        System.out.println("      FACTURA CON TOTAL               ");
        System.out.println("========================================");
        
        System.out.println("\n--- DETALLES DE FACTURACION ---");
        Factura f1 = new Factura("FAC-001", "Monitor Gamer 24\"", 2, 1250.00);
        Factura f2 = new Factura("FAC-002", "Lapiz Optico",3, 125.00 );
        
        f1.mostrarFactura();
        f2.mostrarFactura();
        
    }
}
