package patron.creacional.abstractFactory;

public class ScooterElectrico extends Scooter{

	public ScooterElectrico(String nombre, String modelo, String tipo) {
		super(nombre, modelo, tipo);
		
	}
	@Override
	public void mostrarCaracteristicas(String nombre, String modelo, String tipo) {
		System.out.println(this.getNombre() + "-" + this.getNombre()+ "-" + this.getTipo());
	}

}
