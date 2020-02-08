package patron.creacional.builder;

public class DocumentacionPDF extends Documentacion {

	@Override
	public void agregarDocumentacion(String formato) {
		if (formato.contains("PDF")) {
			contenido.add("es un archivo PDF - " + formato);
		}
		
	}

}
