package patron.creacional.builder;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo{

	public ConstructorDocumentacionVehiculoHtml(){
		documentacion = new DocumentacionHTML();
	}
	
	public void construyeSolicitudPedido(String nombreCliente){
		String documento;
		documento = "<HTML>Solicitud de pedido Cliente: " +
		nombreCliente + "</HTML>";
		documentacion.agregarDocumentacion(documento);
	}
	
	public void construyeSolicitudMatriculacion(String nombreSolicitante){
		String documento;
		documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregarDocumentacion(documento);
	}

}
