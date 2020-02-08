package patron.creacional.abstractFactory;

public class ScooterGasolina extends Scooter{

	public ScooterGasolina(String nombre, String modelo, String tipo) {
		super(nombre, modelo, tipo);
	}

	@Override
	public void mostrarCaracteristicas(String nombre, String modelo, String tipo) {
		System.out.println(this.getNombre() + "-" + this.getNombre()+ "-" + this.getTipo());
		
	}

}
