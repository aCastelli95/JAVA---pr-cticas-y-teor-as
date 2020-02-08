package patron.creacional.abstractFactory;

public class FabricaVehiculoElectrico implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String nombre, String modelo, String tipo) {
		return new AutomovilElectrico(nombre, modelo, tipo);
	}

	@Override
	public Scooter crearScooter(String nombre, String modelo, String tipo) {
		return new ScooterElectrico(nombre, modelo, tipo);
	}

}
