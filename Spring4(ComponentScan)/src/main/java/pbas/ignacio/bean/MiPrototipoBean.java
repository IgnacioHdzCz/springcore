package pbas.ignacio.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class MiPrototipoBean {
	@Autowired
	@Qualifier("servicio-basico")
	private MiServicio miServicio;
	
	public void hacerAlgo() {
		System.out.println(miServicio.getMensage());
		
	}

}
