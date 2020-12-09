package com.clearminds.arm.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.arm.bdd.ConexionBDD;
import com.clearminds.arm.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try {
			Connection conexion= ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
			
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			// TODO: handle exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
