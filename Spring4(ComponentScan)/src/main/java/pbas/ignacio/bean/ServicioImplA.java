package pbas.ignacio.bean;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("servicio-basico")
//@Qualifier ("servicio-basico")
public class ServicioImplA implements MiServicio {
	
	@PostConstruct
	private void init() {
		System.out.println("Inicializando lento " +
	   this.getClass().getSimpleName());
	}
	

	@Override
	public String getMensage() {
		// TODO Auto-generated method stub
		return "Mensaje de " + getClass().getSimpleName();
	}

}
