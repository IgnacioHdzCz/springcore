package pbas.ignacio.aplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pbas.ignacio.cliente.Cliente;

import pbas.ignacio.datasourceBean.Configuracion.DataSourceConfig;

@Configuration
public class Aplicacion {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Aplicacion.class, DataSourceConfig.class);
		 context.getBean(Cliente.class).mostrarDato();
		
		
			((ConfigurableApplicationContext) context).close();
	}
	

	
	
@Autowired
private DataSourceConfig dataSourceConfig;

@Bean
Cliente clienteBean() {
	return new Cliente(dataSourceConfig.dataSourceBean());
	
}

}
