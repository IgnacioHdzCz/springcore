package pbas.ignacio.bean;

import javax.annotation.PostConstruct;

public class ServicioImplB implements MiServicio {

	
	@PostConstruct// anotacion usada en un metodo que necesita ser ejecutado despues de la
	//inyeccion de dependencia
	private void init() {
		System.out.println("Inicializando al inicio" +
				this.getClass().getSimpleName());
	}
	
	
	@Override
	public String getMensage() {
				return "Mensaje de " + getClass().getSimpleName();
	}

}
