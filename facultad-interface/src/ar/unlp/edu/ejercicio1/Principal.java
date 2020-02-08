package ar.unlp.edu.ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona[] = new Persona[4];
		persona[0] = new Persona("Camila", "Castelli",19);
		persona[1] = new Persona("Marina", "Pulido",25);
		persona[2] = new Persona("Pablo", "Herrera",26);
		persona[3] = new Persona("Alan", "Castelli",24);
		
		Arrays.sort(persona);
		for(Persona p: persona) {
			System.out.println(p.getNombre() + " - " + p.getApellido());
		}
	}
		
		

}
