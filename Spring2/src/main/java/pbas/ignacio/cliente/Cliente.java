package pbas.ignacio.cliente;



import pbas.ignacio.datasourceBean.DataSourceBean;


public class Cliente {
	
	// variable de tipo DataSourceBean
	private DataSourceBean dataSourceBean;
	
	// constructor de la clase
	public Cliente(DataSourceBean dataSourceBean) {
		this.dataSourceBean = dataSourceBean;
	
	}
	
	
	public void mostrarDato() {
		
		System.out.println(dataSourceBean.getDato());
	}
	
	
	
	
}
