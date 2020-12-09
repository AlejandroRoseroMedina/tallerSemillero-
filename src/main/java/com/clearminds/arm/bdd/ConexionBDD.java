package com.clearminds.arm.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.arm.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad){
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			return p.getProperty(nombrePropiedad);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	//	System.out.println(nombrePropiedad+p.getProperty(nombrePropiedad));
		
	}
	
	public static Connection obtenerConexion() throws BDDException, SQLException{
		
		String url=leerPropiedad("urlConexion");
		String user=leerPropiedad("usuario");
		String password=leerPropiedad("password");
		Connection con;
		con = DriverManager.getConnection(url+";"+"user="+user+";"+"password="+password+";");
		return con;
		
		
	}
}
