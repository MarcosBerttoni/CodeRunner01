package manejadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;


public class DatabaseManager {
	
	private static Connection databaseConnection;
	private static String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/VETERINARIA";
	private static String USUARIO = "postgres";
	//private static String CLAVE = "123456";
	private static String CLAVE = "admin";
	
	static{
		try {

			Locale.setDefault(new Locale("es","ES"));
			databaseConnection = DriverManager.getConnection(CONNECTION_STRING,USUARIO,CLAVE);

		} catch (SQLException e) {
			System.out.println("Error creando la conexi�n a la base de datos" + e);
		} 

	}
	
	public static Connection getConnection() {
		
		return databaseConnection;
		
	}

}


