package Encapsulacion;


public class Main {
	
	
	public static void main(String[] args) {
		//CLASE #1
		// Crear 3 objetos de la clase Persona usando el constructor 
		Persona persona1 = new Persona("Juan", "Pérez", 20);
		Persona persona2 = new Persona("María", "López", 22);
		Persona persona3 = new Persona("Carlos", "García", 19);
		
		
		// Mostrar los datos de cada objeto llamando al método mostrar()
		System.out.println("--- Mostrando Persona 1 ---");
		persona1.mostrar();
		
		System.out.println("\n--- Mostrando Persona 2 ---");
		persona2.mostrar();
		
		System.out.println("\n--- Mostrando Persona 3 ---");
		persona3.mostrar();
		
		// AGREGANDO PERSONA 4 PARA MOSTRAR LA VALIDACIÓN
		System.out.println("\n--- Intentando crear Persona 4 con edad negativa ---");

		try {
		    // Intentamos crear el objeto con -12
		    Persona persona4 = new Persona("Carlos", "García", -12);
		    
		    // Si el constructor capturó el error internamente, podemos mostrar los datos:
		    persona4.mostrar();
		    
		    System.out.println("Nota: La edad se validó es negativa y se asignó 0 automáticamente.");

		} catch (Exception e) {
		    // Este bloque se ejecuta si el error "sube" hasta el main
		    System.out.println("⚠️ No se pudo crear a la persona correctamente.");
		    System.out.println("Razón: " + e.getMessage());
		}
		
	
		
//######################################################################
        //CLASE #2
		// 1. Crear 2 objetos de la clase Rectángulo
        Rectangulo r1 = new Rectangulo(10.5, 5.0);
        Rectangulo r2 = new Rectangulo(7.0, 8.0); 
        
        System.out.println("=====================================");
        System.out.println("--- Datos Rectángulo 1 ---");
        r1.mostrarDatos();

        System.out.println("\n--- Datos Rectángulo 2 ---");
        r2.mostrarDatos();

        System.out.println("\n--------------------------");

        // 2. Comparar cuál tiene mayor área
        if (r1.area() > r2.area()) {
            System.out.println("El Rectángulo 1 tiene el área mayor.");
        } else if (r2.area() > r1.area()) {
            System.out.println("El Rectángulo 2 tiene el área mayor.");
        } else {
            System.out.println("Ambos rectángulos tienen la misma área.");
        }
 //######################################################################
        //CLASE #3
     // 1. Crear 2 productos con precios iniciales
        Producto prod1 = new Producto(101, "Laptop Gamer", 8500.0, 14);
        Producto prod2 = new Producto(102, "Mouse Óptico", 250.0, 12);
        
        System.out.println("=====================================");
        
        System.out.println("--- Precios Iniciales ---");
        prod1.mostrarInfo();
        prod2.mostrarInfo();
        System.out.println();

        // 2. Aplicar descuentos distintos
        prod1.aplicarDescuento(15.0); // 15% de descuento
        prod2.aplicarDescuento(50.0); // 50% de descuento (oferta)

        System.out.println("\n--- Precios con Descuento ---");
        prod1.mostrarInfo();
        prod2.mostrarInfo();
     // --- PRUEBA DEL MÉTODO VENDER ---
        System.out.println("\n--- Realizando Ventas ---");
        
        // Venta exitosa (descuenta del stock)
        prod1.Vender(4); 
        
        // Intento de venta mayor al stock (debería mostrar el error que programamos)
        prod2.Vender(20); 
        
        System.out.println("\n--- Estado Final de Inventario ---");
        prod1.mostrarInfo();
        prod2.mostrarInfo();
    
//######################################################################
    //CLASE # 4
     // 1. Crear una cuenta con saldo inicial
        System.out.println("=====================================");
        
        Cuenta miCuenta = new Cuenta ("Carlos Galicia", 500.0, 4567 );
        miCuenta.mostrarSaldo();
        System.out.println("----------------------------");

        // 2. Realizar un depósito
        miCuenta.depositar(200.0); // Saldo debería ser 700
        
        // 3. Realizar un retiro válido y uno invalido ingresando el pin
        miCuenta.retirar(150.0, 4567);
        miCuenta.retirar( 100, 1210 );
        
        // 4. Intentar un retiro inválido (más de lo que hay)
        miCuenta.retirar(1000.0, 4567);  // Debería mostrar error de fondos insuficientes
        
        // 5. Intentar un depósito negativo
        miCuenta.depositar(-50.0); // Debería mostrar error de monto positivo
        
        System.out.println("----------------------------");
        
        // 6. Mostrar el saldo final
        miCuenta.mostrarSaldo();
	
        
//######################################################################
        //CLASE # 5
     // 1. Crear 3 libros con diferentes cantidades de páginas
        System.out.println("=====================================");
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 1032);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        // 2. Evaluamos cada libro
        System.out.println("--- Análisis de Libros ---");
        
        evaluarLibro(libro1);
        evaluarLibro(libro2);
        evaluarLibro(libro3);
    }

    // Método auxiliar en el Main para no repetir código de impresión
    public static void evaluarLibro(Libro l) {
        l.mostrarInfo();
        if (l.esLargo()) {
            System.out.println("-> RESULTADO: Es un libro largo (más de 300 pág).\n");
        } else {
            System.out.println("-> RESULTADO: Es un libro corto.\n");
        }
//######################################################################
        //CLASE # 6
        
        System.out.println("=====================================");
     // 1. Prueba con números normales
        Calculadora calc1 = new Calculadora(10, 5);
        System.out.println("--- Prueba 1 ---");
        calc1.mostrarResultados();

        // 2. Prueba con división entre cero
        Calculadora calc2 = new Calculadora(8, 0);
        System.out.println("--- Prueba 2 (División entre cero) ---");
        calc2.mostrarResultados();
        
 //######################################################################
        //CLASE # 7
       
     // 1. Crear 3 objetos de tipo Fecha
        Fecha f1 = new Fecha(25, 12, 2024); // Válida
        Fecha f2 = new Fecha(40, 5, 2023);  // Inválida (día 40)
        Fecha f3 = new Fecha(10, 15, 2025); // Inválida (mes 15)

        // 2. Probar y mostrar resultados
        System.out.println("--- Verificación de Fechas ---");
        
        verificar(f1);
        verificar(f2);
        verificar(f3);
    }

    // Método auxiliar para imprimir el resultado de la validación
    public static void verificar(Fecha f) {
        f.mostrarFecha();
        if (f.esValida()) {
            System.out.println("Resultado: LA FECHA ES VÁLIDA.\n");
        } else {
            System.out.println("Resultado: ERROR - FECHA NO VÁLIDA.\n");
        }
        
           
    }
 
 
    

//	
  //FIN DE LA CLASE MAIN
	}
	
        
    
	




