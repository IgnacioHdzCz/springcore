package pbas.ignacio.aplicacion;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import pbas.ignacio.orden.SolicitarOrden;

@Configuration
@ComponentScan({ "pbas.ignacio.orden", "pbas.ignacio.cliente" })
public class ConfiguracionImplicitaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfiguracionImplicitaConstructor.class);
		Object servicio = context.getBean("servicio");
		System.out.println(servicio);
		((ConfigurableApplicationContext) context).close();
	}

	private final SolicitarOrden solicitarOrden;

	public ConfiguracionImplicitaConstructor(SolicitarOrden solicitarOrden) {
		this.solicitarOrden = solicitarOrden;

	}

	@Bean(name = "servicio")
	public java.util.List<SolicitarOrden> servicio() {
		return Arrays.asList(solicitarOrden);

	}

}
