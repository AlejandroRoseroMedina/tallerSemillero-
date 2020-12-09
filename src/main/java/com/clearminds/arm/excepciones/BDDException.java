package com.clearminds.arm.excepciones;

import java.sql.SQLException;

public class BDDException extends Exception{

	private static final long serialVersionUID = 1L;

	public BDDException(String mensaje){
		super(mensaje);
	} 
}
