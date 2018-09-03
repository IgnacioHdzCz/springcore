package pbas.ignacio.cliente;

import org.springframework.beans.factory.annotation.Autowired;

import pbas.ignacio.servicio.Servicio;

public class ServicioCliente {
	
	@Autowired
	private Servicio servicio;
     
	
	
	public void mostrar() {
		servicio.saludo("Hola desde Spring!!");
	}
	
	
	
	
}
