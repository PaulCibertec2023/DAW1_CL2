package com.cibertec.test;

import com.cibertec.dao.EmpleadoDao;
import com.cibertec.dao.impl.EmpleadoDaoImpl;

public class EmpleadoListaTest {

	public static void main(String[] args) {
		EmpleadoDao dao = new EmpleadoDaoImpl();
		
		dao.listarEmpleado().stream().forEach(System.out::println);
		
	}

}
