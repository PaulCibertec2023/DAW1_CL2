package com.cibertec.test;

import com.cibertec.dao.EmpleadoDao;
import com.cibertec.dao.impl.EmpleadoDaoImpl;
import com.cibertec.model.Empleado;

public class RegistroEmpleadoTest {
	
	public static void main(String[] args) {
		
		EmpleadoDao dao = new EmpleadoDaoImpl();
		Empleado empleado = new Empleado("Jim","Fuk","45642867" );
		String mensaje = dao.registrarEmpleado(empleado);
		System.out.println(mensaje);

	}

}
