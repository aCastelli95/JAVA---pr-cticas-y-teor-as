package ar.unlp.edu.ejercicio1;

public class Empleado extends Persona{
	
	public long nroLegajo;
	double sueldo;
	
	public Empleado(String nombre, String apellido, int edad) {
		super(nombre, apellido,edad);
	}
	
	public long getNroLegajo() {
		return nroLegajo;
	}
	public void setNroLegajo(long nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
