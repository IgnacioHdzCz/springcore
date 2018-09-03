package pbas.ignacio.cliente;

import org.springframework.stereotype.Component;

import pbas.ignacio.orden.SolicitarOrden;

@Component
public class SolicitarOrdenCliente {

	private SolicitarOrden solicitarOrden;

	// @Autowired no es mas requerido en Spring 4.3 y despues
	public SolicitarOrdenCliente(SolicitarOrden solicitarOrden) {
		this.solicitarOrden = solicitarOrden;

	}

	public void mostrarDetallesOrdenPendientes() {
		System.out.println(solicitarOrden.getDetallesOrden("100"));

	}

}
