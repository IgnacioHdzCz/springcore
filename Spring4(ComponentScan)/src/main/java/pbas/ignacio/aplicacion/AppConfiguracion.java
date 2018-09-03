package pbas.ignacio.aplicacion;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import pbas.ignacio.bean.MiPrototipoBean;



@Configuration
@ComponentScan("pbas.ignacio.bean")
public class AppConfiguracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfiguracion.class);
		
		System.out.println("Contenedor de Spring empezando y listo");
	
		MiPrototipoBean bean = context.getBean(MiPrototipoBean.class);
		bean.hacerAlgo();
		((ConfigurableApplicationContext) context).close();
	}



}
