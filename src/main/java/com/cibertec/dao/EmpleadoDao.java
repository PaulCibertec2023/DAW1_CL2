package com.cibertec.dao;

import java.util.List;

import com.cibertec.model.Empleado;

public interface EmpleadoDao {
	
	public String registrarEmpleado(Empleado empleado);
	
	public Empleado buscarEmpleado(int id);
	
	List<Empleado> listarEmpleado();
	
	public Empleado listaEmpleadoPorId(int id);
	
	public String actualizarEmpleado(Empleado empleado);
	
	public String eliminarEmpleado(int id);

}
