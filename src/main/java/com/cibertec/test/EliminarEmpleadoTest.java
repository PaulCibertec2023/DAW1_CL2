package com.cibertec.test;

import com.cibertec.dao.EmpleadoDao;
import com.cibertec.dao.impl.EmpleadoDaoImpl;

public class EliminarEmpleadoTest {

	public static void main(String[] args) {
		EmpleadoDao dao = new EmpleadoDaoImpl();
		String mensaje = dao.eliminarEmpleado(1);
		System.out.println(mensaje);
	}
}
