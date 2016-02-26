package com.huawei.traveller.config;

import org.springframework.context.annotation.*;
import java.beans.PropertyVetoException;
import java.util.Collections;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableJpaRepositories(basePackages = { "com.huawei.traveller.dao" })
@EnableTransactionManagement
@ComponentScan(basePackages = "com.huawei.traveller", excludeFilters = {
		@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
		@ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION) })

public class DataAccessConfig {
	/*hsqldb内存数据库源+资源池*/
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:hsqldb:mem:travellerdb", "sa", "");
		dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		return dataSource;
	}
	@Bean
	public DataSource dataSourceHsqldb() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass("org.hsqldb.jdbcDriver");
			//ds.setJdbcUrl("jdbc:hsqldb:mem:travellerdb?default_schema=travellerschema");
			ds.setJdbcUrl("jdbc:hsqldb:mem:travellerdb");
			ds.setUser("sa");
			ds.setPassword("");
			ds.setMaxPoolSize(20);
			ds.setMinPoolSize(2);
			ds.setInitialPoolSize(2);
			ds.setMaxIdleTime(60);
			ds.setCheckoutTimeout(3000);
			ds.setAcquireIncrement(2);
			ds.setAutoCommitOnClose(false);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			return null;
		}
		return ds;
	}
	/*Mysql数据库 C30p资源池*/
	@Bean
	public DataSource dataSourceMysql() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl(
					"jdbc:mysql://localhost:3306/travellerdb?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
			ds.setUser("root");
			ds.setPassword("123456");
			ds.setMaxPoolSize(20);
			ds.setMinPoolSize(2);
			ds.setInitialPoolSize(2);
			ds.setMaxIdleTime(60);
			ds.setCheckoutTimeout(3000);
			ds.setAcquireIncrement(2);
			ds.setAutoCommitOnClose(false);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			return null;
		}
		return ds;
	}
	/*Hibernate属性*/
	@Bean
	public Properties jpaPropertiesMysql() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		properties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
		properties.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		properties.put("hibernate.hbm2ddl.auto", "validate");
		return properties;
	}
	@Bean
	public Properties jpaPropertiesHsql() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		properties.put("hibernate.cache.provider_class", "org.hibernate.cache.HashtableCacheProvider");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		properties.put("hibernate.session_factory_name", "sessionFactory");
		//properties.put("hibernate.default_schema","travellerschema");
		properties.put("hibernate.hbm2ddl.auto", "create-drop");/*mysql:validate*/
		return properties;
	}
	/*hibernate和Jpa适配起来*/
	@Bean
	public JpaVendorAdapter hibernateJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabase(Database.HSQL);/*mysql:Database.MYSQL*/
		return adapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws ClassNotFoundException {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSourceHsqldb());/*数据源*/
		factoryBean.setPackagesToScan("com.huawei.traveller.domain");
		factoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter());/*jpa交给Hibernate*/
		factoryBean.setJpaProperties(jpaPropertiesHsql());/*JPA属性*/
		//factoryBean.setJpaPropertyMap(Collections.singletonMap("hibernate.session_factory_name", "sessionFactory"));
		return factoryBean;
	}
	/*事务要配置到那些方法上呢?解答：CRDU默认事务开启,事务的最终配置*/
	@Bean
	public JpaTransactionManager transactionManager() throws ClassNotFoundException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	/*采用Hibernate的TransactionManger？
	@Bean(name = "transactionManager")
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(localSessionFactoryBean()
				.getObject());
		return hibernateTransactionManager;
	}
	*/
	

}
