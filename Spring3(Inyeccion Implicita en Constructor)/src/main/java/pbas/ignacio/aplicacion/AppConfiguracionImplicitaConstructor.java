package pbas.ignacio.aplicacion;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import pbas.ignacio.cliente.SolicitarOrdenCliente;

@Configuration
@ComponentScan({ "pbas.ignacio.orden", "pbas.ignacio.cliente" })
public class AppConfiguracionImplicitaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfiguracionImplicitaConstructor.class);
		
		SolicitarOrdenCliente bean = context.getBean(SolicitarOrdenCliente.class);
		bean.mostrarDetallesOrdenPendientes();
		((ConfigurableApplicationContext) context).close();
	}



}
