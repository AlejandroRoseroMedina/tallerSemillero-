package com.clearminds.arm.bdd.test;

import com.clearminds.arm.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = ConexionBDD.leerPropiedad("propiedad1");
		System.out.println(valor);
		valor = ConexionBDD.leerPropiedad("xx");
		System.out.println(valor);
		

	}

}
