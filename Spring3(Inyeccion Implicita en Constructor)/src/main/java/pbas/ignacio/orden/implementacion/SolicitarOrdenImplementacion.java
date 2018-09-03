package pbas.ignacio.orden.implementacion;

import org.springframework.stereotype.Component;

import pbas.ignacio.orden.SolicitarOrden;

@Component
public class SolicitarOrdenImplementacion implements SolicitarOrden {

	@Override
	public String getDetallesOrden(String ordenarId) {
	
		return "Detalles de orden de implementacion 1, para orden id=" + ordenarId;
	}

}
