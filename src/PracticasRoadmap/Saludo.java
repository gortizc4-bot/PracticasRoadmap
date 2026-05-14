package PracticasRoadmap;

public class Saludo {

	 // Método que recibe un nombre
    public void hola(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // Sobrecarga:
    // mismo nombre del método pero con 2 parámetros
    public void hola(String nombre, int edad) {
        System.out.println("Hola soy " + nombre + ", tengo " + edad + " años");
    }
}
