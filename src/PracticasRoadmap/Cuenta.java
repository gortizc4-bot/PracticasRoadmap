
//USO DE PACKAGE
package PracticasRoadmap;

public class Cuenta {
	
	
	    // ENCAPSULACIÓN  atributo privado
	    private double saldo;

	    // ACCESS SPECIFIER → protected (lo usan las clases hijas)
	    protected String titular;

	    // INITIALIZER BLOCK → se ejecuta al crear el objeto
	    {
	        System.out.println("Cuenta creada correctamente");
	    }

	    //CONSTRUCTOR
	    public Cuenta(String titular, double saldo) {
	        this.titular = titular;
	        this.saldo = saldo;
	    }

	    //MÉTODO depositar
	    public void depositar(double monto) {
	        saldo += monto;
	    }

	    //MÉTODO retirar con  EXCEPTION HANDLING
	    public void retirar(double monto) {
	        try {
	            if (monto > saldo) {
	                throw new Exception("Fondos insuficientes");
	            }
	            saldo -= monto;
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    // GETTER → acceso al saldo (encapsulación)
	    public double getSaldo() {
	        return saldo;
	    }
	}


