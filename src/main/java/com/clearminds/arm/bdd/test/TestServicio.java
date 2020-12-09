package com.clearminds.arm.bdd.test;

import com.clearminds.arm.dtos.Estudiante;
import com.clearminds.arm.excepciones.BDDException;
import com.clearminds.arm.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvEstudiante=new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Lina", "Rojas"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		} 

	}

}
