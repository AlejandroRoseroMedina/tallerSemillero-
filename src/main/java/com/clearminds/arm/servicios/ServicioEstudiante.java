package com.clearminds.arm.servicios;

import java.sql.SQLException;
import java.sql.*;

import com.clearminds.arm.dtos.Estudiante;
import com.clearminds.arm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estu) throws BDDException, SQLException{
		abrirConexion();
		System.out.println("Insertando estudiante: "+estu);
		Statement stmt = null;
		stmt = getConexion().createStatement();
		String sql = "insert into estudiantes(nombre,apellido) values('"+estu.getNombre()+"', '"+estu.getApellido()+"')";
		System.out.println("Script: "+sql);
		stmt.executeUpdate(sql);
		cerrarConexion();
		
	
	}

}
