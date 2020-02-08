package ar.unlp.edu.ejercicioEXTRA;

public class principal {

	public static void main(String[] args) {
		CoffeExceptionFactory coffeException = new CoffeExceptionFactory(); 
		int temperatura = 90;
		try {
			coffeException.temperaturaCorrecta(temperatura);	
			System.out.println("paso la prueba");
		}catch(CoffeException c) {
			System.out.println("No paso la prueba");
			System.out.println(c.getMessage());
		}
	}

}
