package ar.unlp.edu.principal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
 

public class principal {

	public static void main(String[] args) throws SQLException {
		
		Set<Peliculas> resultPersona = new HashSet<Peliculas>();
		Singletonbd singletonbd = Singletonbd.getSingletonbd("system","oracle", "jdbc:oracle:thin:@//127.0.0.1:1522/xe");
		
		System.out.println(singletonbd.getHost());
		System.out.println(singletonbd.getConnection());
		
		String SQL = "SELECT p.TITULO, d.NOMBRE FROM ALAN.PELICULAS p INNER JOIN ALAN.PELICULAS_DIRECTOR pd ON ("
				+ "p.ID = pd.PELICULA_ID) "
				+ "INNER JOIN ALAN.DIRECTORES d ON ("
				+ "pd.DIRECTOR_ID = d.ID)";
		try {
			Statement stmt = singletonbd.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				Peliculas p = new Peliculas();
				p.setDirector(rs.getString("TITULO"));
				p.setNombre(rs.getString("NOMBRE"));
				//p.setFechaEstreno(!rs.wasNull()?rs.getDate("FECHA_ESTRENO"):new Date(1111,11,11));
				//p.setDuracion(!rs.wasNull()?rs.getInt("DURACION"):0);
				resultPersona.add(p);
				System.out.println(rs.getString("TITULO") + " - " + rs.getString("NOMBRE"));
			}
		}catch (SQLException S) {
			System.out.println(S);
		}
		
		
		 
		
	}

/*	public static void solution (int N) {
 * //int N = 421204;
		//solution(N);
		//System.out.println(stringsolver("HOOLA"));  
		int enable_print = N % 10;// ultimo numero de la izquierda
		while (N > 0) { 
			if (enable_print == 0) { //ambiguo, no puede ser 0 enable_rpint, como se corrige 
				enable_print = 1; //sin sentidlo
			}
			if (enable_print >= 1) {
				System.out.print(N % 10);
			}
			N = N / 10;
		}
	}
	public static String stringsolver(String palabra){
		int maxVal = 0;
		for (int i = 0; i < palabra.length(); i++) {
			int auxVal = (int) palabra.charAt(i); //ascii code of the char
			if (auxVal > maxVal) {
				maxVal = auxVal;
			}
		}
		return ""+(char)maxVal;
	}
*/
}


