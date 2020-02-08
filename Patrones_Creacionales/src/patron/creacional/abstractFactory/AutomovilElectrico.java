package patron.creacional.abstractFactory;

public class AutomovilElectrico extends Automovil{
	
	public AutomovilElectrico(String nombre, String modelo, String tipo){	
		super(nombre,modelo,tipo);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(this.getNombre() + "-" + this.getNombre()+ "-" + this.getTipo());
	}
}
