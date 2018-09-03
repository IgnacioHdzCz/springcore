package pbas.ignacio.cliente;



import org.springframework.beans.factory.annotation.Autowired;

import pbas.ignacio.datasourceBean.DataSourceBean;


public class Cliente {
	
	// variable de tipo DataSourceBean
	@Autowired
	private DataSourceBean dataSourceBean;
	
//	// constructor de la clase
//	public Cliente(DataSourceBean dataSourceBean) {
//		this.dataSourceBean = dataSourceBean;
//	
//	}
//	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarDato() {
		
		System.out.println(dataSourceBean.getDato());
	}
	
	
	
	
}
