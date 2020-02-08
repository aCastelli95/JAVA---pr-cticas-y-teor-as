package patron.estructural.adapter;

public class ComponentePDF {
	private String titulo;
	private String descripcion;
	private String autor;
	
	public ComponentePDF(String titulo, String descripcion, String autor) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.autor = autor;
	}
	
	/**Muestra la descripcion**/
	public String pdfFijaContenido() {
		return this.descripcion;
	}
	
	/**Muestra del titulo**/
	public String pdfFijaTitulo() {
		return this.titulo;
	}
	
	/**Muestra Autor**/
	public String pdfFijaVisualizacion() {
		return this.autor;
	}
}
