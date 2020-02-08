package patron.estructural.adapter;

public class DocumentsPDF implements Documents{

	protected ComponentePDF componentePdf =  new ComponentePDF("TITULO","CUERPO","VTV");
	
	@Override
	public void setContenido(String contenido) {
		componentePdf.pdfFijaContenido();
	}

	@Override
	public void dibujo() {
		System.out.println("--------------Dibujo-----------------");
		System.out.println(componentePdf.pdfFijaTitulo());
		System.out.println(componentePdf.pdfFijaContenido());
		System.out.println(componentePdf.pdfFijaVisualizacion());
	}

	@Override
	public void imprime() {
		System.out.println("---------------Imprime---------------");
		System.out.println(componentePdf.pdfFijaTitulo());
		System.out.println(componentePdf.pdfFijaContenido());
		System.out.println(componentePdf.pdfFijaVisualizacion());
	}

}
