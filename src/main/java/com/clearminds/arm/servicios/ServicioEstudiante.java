package com.clearminds.arm.servicios;

import java.sql.SQLException;

import com.clearminds.arm.dtos.Estudiante;
import com.clearminds.arm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estu) throws BDDException, SQLException{
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		srvEstudiante.abrirConexion();
		System.out.println("Insertando estudiante: "+estu);
		srvEstudiante.cerrarConexion();
	
	}

}
