package ar.unlp.edu.ejercicioEXTRA;

@SuppressWarnings("serial")
public class CoffeException extends RuntimeException{ 
	
	private String message;

	public CoffeException() {
		super();
		this.setMessage("Su cafe se encuentra frio, punto, sin explciacion");
	}
	
	public CoffeException(String descripcion) {
		super(descripcion);
		this.setMessage(descripcion);
	}
	
	public CoffeException(int tmax, int tmin, String description) {
		super(description);
		this.setMessage(description);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
