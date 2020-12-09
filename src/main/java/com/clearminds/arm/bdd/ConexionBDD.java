package com.clearminds.arm.bdd;

import java.io.File;
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
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());
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
	
	public static Connection obtenerConexion() throws BDDException{
		
		String url=leerPropiedad("urlConexion");
		String user=leerPropiedad("usuario");
		String password=leerPropiedad("password");
		Connection con;
		try {
			con = DriverManager.getConnection(url+";"+"user="+user+";"+"password="+password+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("No se puede conectar a la base de datos");
		}
		return con;
		
		
	}
}
