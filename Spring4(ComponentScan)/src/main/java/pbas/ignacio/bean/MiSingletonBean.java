package pbas.ignacio.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class MiSingletonBean {
	@PostConstruct
	public void init() {
		System.out.println("Inicializando Bean " +
					this.getClass().getSimpleName());
	}

}
