package patron.creacional.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion {
	
	protected List<String> contenido = new ArrayList<String>();
	
	public abstract void agregarDocumentacion(String formato);
	
	public void imprimir() {
		contenido.stream().forEach(a -> System.out.println(a));
	}
}
