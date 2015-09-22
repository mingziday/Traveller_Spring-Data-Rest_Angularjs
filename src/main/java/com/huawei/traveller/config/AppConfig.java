package com.huawei.traveller.config;

import org.springframework.context.annotation.*;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import java.beans.PropertyVetoException;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.*;
import org.springframework.stereotype.Controller;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
 
@EnableJpaRepositories(basePackages = {"com.huawei.traveller.dao"})
@ComponentScan(basePackages = "com.huawei.traveller", excludeFilters = {
		@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
		@ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION) })
		 
public class AppConfig extends RepositoryRestMvcConfiguration {


  @Override
	public RepositoryRestConfiguration config() {
		RepositoryRestConfiguration config = super.config();
		//config.setBaseUri("/traveller");
		config.setDefaultPageSize(6);/*设置默认页大小*/
		return config;
	}

	/*
	 * try { Properties cfgpp = new Properties(); cfgpp.load(AppConfig.class
	 * .getResourceAsStream("hibernate4.properties"));
	 * ds.setDriverClass(cfgpp.getProperty("driverClassName"));
	 * ds.setJdbcUrl(cfgpp.getProperty("jdbc_url"));
	 * ds.setUser(cfgpp.getProperty("jdbc_username"));
	 * ds.setPassword(cfgpp.getProperty("jdbc_password")); } catch
	 * (Exception e) { e.printStackTrace(); return null; }
	 */

	@Bean
	public DataSource dataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl(
					"jdbc:mysql://localhost:3306/happycardata?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
			ds.setUser("root");
			ds.setPassword("123456");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			return null;
		}
		return ds;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabase(Database.MYSQL);
		return adapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws ClassNotFoundException {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("com.huawei.traveller.domain");
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());

		return factoryBean;
	}

	@Bean
	public JpaTransactionManager transactionManager() throws ClassNotFoundException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

		return transactionManager;
	}

	@Bean
	public Properties jpaProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		properties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
		properties.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		properties.put("hibernate.hbm2ddl.auto", "validate");

		return properties;
	}
	
}
