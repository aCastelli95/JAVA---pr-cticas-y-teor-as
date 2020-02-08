package patron.creacional.abstractFactory;

public abstract class Automovil {
	protected String nombre;
	protected String modelo;
	protected String tipo;
	
	public Automovil(String nombre, String modelo, String tipo) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	
	public abstract void mostrarCaracteristicas();
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
