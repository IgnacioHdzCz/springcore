package pbas.ignacio.datasourceBean.Configuracion;

import org.springframework.context.annotation.Bean;

import pbas.ignacio.datasourceBean.DataSourceBean;

public class DataSourceConfig {

	@Bean //es un metodo que regresara un bean de tipo DataSourceBean

	public DataSourceBean dataSourceBean() {
		return new DataSourceBean();

	}

}
