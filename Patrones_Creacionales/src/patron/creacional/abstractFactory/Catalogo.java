package patron.creacional.abstractFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalogo {

	public static void main(String[] args) {
		FabricaVehiculo fabricaVehiculo;
		String i;
		
		HashMap<String,String> catalogoAuto = new HashMap<String,String>();
		HashMap<String,String> catalogoScooter = new HashMap<String,String>();
		List<Automovil> automoviles = new ArrayList<Automovil>();
		catalogoAuto.put("Chevrolet","Corsa"); // nafta 
		catalogoAuto.put("Volkswagen", "T-Cross"); // electrico
		catalogoScooter.put("motoChevrolet", "laMoto1.0");
		catalogoScooter.put("motoVolkswagen","laMoto2.0MejorQue1.0");
		
		for(String valor: catalogoAuto.keySet()) {
			if(valor.equals("Chevrolet")) {
				fabricaVehiculo = new FabricaVehiculoGasolina();
				i = "Soy a gasolina";	
			} else {
				fabricaVehiculo = new FabricaVehiculoElectrico();
				i = "Soy a nafta";
			}
			automoviles.add(fabricaVehiculo.crearAutomovil(valor, catalogoAuto.get(valor), i));
		}
		
		for(Automovil a : automoviles) {
			System.out.println(a.nombre + " - " + a.modelo + " - " + a.tipo);
		}
		
	}

}
