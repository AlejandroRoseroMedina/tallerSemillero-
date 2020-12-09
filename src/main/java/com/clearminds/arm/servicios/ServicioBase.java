package com.clearminds.arm.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.arm.bdd.ConexionBDD;
import com.clearminds.arm.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() throws BDDException, SQLException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		if(conexion!=null){
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al cerrar la conexion");
			e.printStackTrace();
		}
		System.out.println("Conexión cerrada");
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	

}
