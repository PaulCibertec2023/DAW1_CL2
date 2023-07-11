package com.cibertec.test;

import com.cibertec.dao.EmpleadoDao;
import com.cibertec.dao.impl.EmpleadoDaoImpl;
import com.cibertec.model.Empleado;

public class ActualizarEmpleadoTest {

	public static void main(String[] args) {
		
		EmpleadoDao dao = new EmpleadoDaoImpl();
		
		Empleado empleado = dao.listaEmpleadoPorId(1);
		
		System.out.println(empleado);
		empleado.setNombre("Josimar Julio");
		String mensaje = dao.actualizarEmpleado(empleado);
		System.out.println(mensaje);
		System.out.println(empleado);
		
	}

}
