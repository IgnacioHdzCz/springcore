package pbas.ignacio.datasourceBean.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pbas.ignacio.datasourceBean.DataSourceBean;

@Configuration
public class DataSourceConfig {

	@Bean //es un metodo que regresara un bean de tipo DataSourceBean

	public DataSourceBean dataSourceBean() {
		return new DataSourceBean();

	}

}
