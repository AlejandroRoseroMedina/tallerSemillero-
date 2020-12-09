package com.clearminds.arm.bdd.test;

import java.sql.SQLException;

import com.clearminds.arm.dtos.Estudiante;
import com.clearminds.arm.excepciones.BDDException;
import com.clearminds.arm.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServicioEstudiante srv = new ServicioEstudiante();
		try {
			srv.actualizarEstudiante(new Estudiante("mona","rosa",5));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
