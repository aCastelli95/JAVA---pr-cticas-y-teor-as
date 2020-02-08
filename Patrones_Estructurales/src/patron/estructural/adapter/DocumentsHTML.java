package patron.estructural.adapter;

public class DocumentsHTML implements Documents {

	@Override
	public void setContenido(String contenido) {
		System.out.println("Se modifica el contenido del pdf desde DocumentsHtml");
	}

	@Override
	public void dibujo() {	
		System.out.println("Se modifica el dibujo html");
	}

	@Override
	public void imprime() {
		System.out.println("Se imprime el dibujo HTML");
	}

}
