package ar.unlp.edu.ejercicioEXTRA;

public class CoffeExceptionFactory {
	private static final int TEMPERATURA_MAXIMA = 85;
	private static final int TEMPERATURA_MINIMA = 70;
	
	public void temperaturaCorrecta(int temp) throws CoffeException{
		
		if(this.TEMPERATURA_MAXIMA < temp) {
			throw new CoffeException("tiene demasiada temperatura la bebida");
		}
		
		if(this.TEMPERATURA_MINIMA > temp ) {
			throw new CoffeException("tiene BAJA temperatura la bebida");
		}
		
		System.out.println("Esta en la temperatura correcta");
	}

}
