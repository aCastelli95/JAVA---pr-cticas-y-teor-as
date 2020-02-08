package patron.creacional.abstractFactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String nombre, String modelo, String tipo) {
		return new AutomovilGasolina(nombre, modelo, tipo);
	}

	@Override
	public Scooter crearScooter(String nombre, String modelo, String tipo) {
		return new ScooterGasolina(nombre, modelo, tipo);
	}

}
