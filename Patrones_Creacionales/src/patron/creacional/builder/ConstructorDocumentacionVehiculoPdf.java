package patron.creacional.builder;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo{

	public ConstructorDocumentacionVehiculoPdf(){
		documentacion = new DocumentacionPDF();
	}
	
	@Override
	public void construyeSolicitudPedido(String nombreCliente)
	{
		String documento;
		documento = "<PDF>Solicitud de pedido Cliente: " +
		nombreCliente + "</PDF>";
		documentacion.agregarDocumentacion(documento);
	}
	
	public void construyeSolicitudMatriculacion(String nombreSolicitante){
		String documento;
		documento = "<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</PDF>";
		documentacion.agregarDocumentacion(documento);
	}
	
}
