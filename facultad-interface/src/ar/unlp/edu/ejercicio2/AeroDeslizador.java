package ar.unlp.edu.ejercicio2;

public class AeroDeslizador implements VehiculoDeMar,VehiculoDeTierra{

	@Override
	public void conducir() {
		System.out.println("Conducir aerodeslizador");
	}

	@Override
	public void emprenderMarcha() {
		System.out.println("EmprenderMarch AeroDeslizadora");
	}

}
