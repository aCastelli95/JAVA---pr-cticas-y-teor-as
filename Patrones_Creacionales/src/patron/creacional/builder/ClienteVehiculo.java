package patron.creacional.builder;

import java.util.HashMap;
import java.util.Map;

public class ClienteVehiculo {

	public static void main(String[] args)
	{
		Map<String, ConstructorDocumentacionVehiculo> usuarioInfoDoc = new HashMap<String, ConstructorDocumentacionVehiculo>();
	
		usuarioInfoDoc.put("Alan", new ConstructorDocumentacionVehiculoHtml());
		usuarioInfoDoc.put("Pablito", new ConstructorDocumentacionVehiculoPdf());
		
		for(Map.Entry<String, ConstructorDocumentacionVehiculo> usuario: usuarioInfoDoc.entrySet()) {
			Vendedor vendedor = new Vendedor(usuario.getValue());
			Documentacion documentacion = vendedor.construye(usuario.getKey());
			documentacion.imprimir();
		}
	}
}
