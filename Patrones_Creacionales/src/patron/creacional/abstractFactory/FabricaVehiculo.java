package patron.creacional.abstractFactory;

public interface FabricaVehiculo {
	
	public Automovil crearAutomovil(String nombre, String modelo, String tipo);
	public Scooter crearScooter(String nombre, String modelo, String tipo);
}
