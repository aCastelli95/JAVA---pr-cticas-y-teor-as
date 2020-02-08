package patron.estructural.adapter;

import java.util.Arrays;

public class principal {
	
	public static void main(String[] args) {
		
		DocumentsHTML documentoHTML = new DocumentsHTML();
		documentoHTML.imprime();
		documentoHTML.dibujo();
		DocumentsPDF documentoPDF = new DocumentsPDF();
		documentoPDF.imprime();
		documentoPDF.dibujo();
	 
		
		
	    
	}

}
