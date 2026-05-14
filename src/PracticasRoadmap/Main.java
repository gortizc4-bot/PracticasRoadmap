
//USO DE PACKAGE 
package PracticasRoadmap;

public class Main {


	    public static void main(String[] args) {

	        //CREACIÓN DE OBJETO
	        CuentaAhorro cuenta1 = new CuentaAhorro("Giselle", 500);

	        //DEPÓSITO
	        cuenta1.depositar(200);

	        //RETIRO (prueba error)
	        cuenta1.retirar(1000);

	        //MOSTRAR SALDO
	        System.out.println("Saldo actual: " + cuenta1.getSaldo());

	        //TYPE CASTING → conversión de tipos
	        double cantidad = 150.75;
	        int cantidadEntera = (int) cantidad;
	        System.out.println("Cantidad convertida: " + cantidadEntera);

	        //EXCEPTION adicional
	        try {
	        } catch (Exception e) {
	            System.out.println("Error detectado: " + e.getMessage());
	        }
	        
	        System.out.println("\n========Polimorfismo=========");
	        // Objeto tipo Animal pero con forma de Perro
	        Animal a1 = new Perro();

	        // Objeto tipo Animal pero con forma de Gato
	        Animal a2 = new Gato();

	        // Cada objeto ejecuta su propio método
	        a1.sonido();
	        a2.sonido();
	    }
	    }
	


