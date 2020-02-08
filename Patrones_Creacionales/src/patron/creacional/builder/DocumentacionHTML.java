package patron.creacional.builder;

public class DocumentacionHTML extends Documentacion{
	
	@Override
	public void agregarDocumentacion(String formato) {
		if (formato.contains("HTML")) {
			contenido.add("es un archivo HTML - " + formato);
		}
		
	}

}
