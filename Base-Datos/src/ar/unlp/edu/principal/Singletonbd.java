package ar.unlp.edu.principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singletonbd {
	private String user;
	private String pass;
	private String host;
	private static Connection conexion;
	private static Singletonbd singletonbd;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Connection getConnection() {
		return conexion;
	}

	public void setConnection(Connection connection) {
		conexion = connection;
	}
	
	public Singletonbd(String user,String pass, String host, Connection connection) {
		this.user = user;
		this.pass = pass;
		this.host = host;
		conexion = connection;
	}
	
	public static Singletonbd getSingletonbd(String user,String pass,String host) throws SQLException {
		if(singletonbd == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
	            conexion = DriverManager.getConnection(host,user,pass);
	        } catch (SQLException ex) {
	            System.out.println("ya existe una coneexion a la base de datos");
	        } catch(ClassNotFoundException cf) {
	        	System.out.println("no existe el driver en su computadora");
	        }
			
			singletonbd = new Singletonbd(user,pass,host,conexion);
		}
		return singletonbd;
	}
}
