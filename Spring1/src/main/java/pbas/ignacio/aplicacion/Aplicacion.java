package pbas.ignacio.aplicacion;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pbas.ignacio.cliente.ServicioCliente;
import pbas.ignacio.servicio.Servicio;
import pbas.ignacio.servicio.implementacion.ServicioImpl;

@Configuration
public class Aplicacion {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Aplicacion.class);
		ServicioCliente bean = context.getBean(ServicioCliente.class);
		bean.mostrar();
		
		((ConfigurableApplicationContext) context).close();
		
	}

	@Bean
	public Servicio crearServicio() {
		return new ServicioImpl();

	}

	@Bean
	public ServicioCliente crearCliente() {
		return new ServicioCliente();

	}

}