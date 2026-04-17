
//USO DE PACKAGE
package PracticasRoadmap;

	//Herencia de clase padre cuenta 
	public class CuentaAhorro extends Cuenta {

	    // CONSTRUCTOR
	    public CuentaAhorro(String titular, double saldo) {
	        super(titular, saldo); // llama al constructor padre
	    }

	    //SOBRESCRITURA 
	    @Override
	    public void retirar(double monto) {
	        System.out.println("Retiro desde cuenta de ahorro");
	        super.retirar(monto); // usa la lógica del padre
	    }
	}


