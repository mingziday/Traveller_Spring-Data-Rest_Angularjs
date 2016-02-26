package com.huawei.traveller.config;

import org.springframework.context.annotation.*;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.huawei.traveller.domain.Country;
import com.huawei.traveller.domain.Scence;
import com.huawei.traveller.domain.User;

@Configuration
@EnableJpaRepositories(basePackages = { "com.huawei.traveller.dao" })
@EnableTransactionManagement
@ComponentScan(basePackages = "com.huawei.traveller", excludeFilters = {
		@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
		@ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION) })

public class AppConfig extends RepositoryRestMvcConfiguration {

	@Override
	public RepositoryRestConfiguration config() {
		RepositoryRestConfiguration config = super.config();
		// config.setBaseUri("/traveller");
		config.setDefaultPageSize(6);/* 设置默认页大小 */
		// 设置返回的json Body中显示id
		config.exposeIdsFor(Scence.class);
		config.exposeIdsFor(User.class);
		config.exposeIdsFor(Country.class);
		// 设置创建成果后返回创建成果的结果,实际上我们不需要这样
		// config.setReturnBodyOnCreate(true);
		return config;
	}
	
	/*
	 * try { Properties cfgpp = new Properties(); cfgpp.load(AppConfig.class
	 * .getResourceAsStream("hibernate4.properties"));
	 * ds.setDriverClass(cfgpp.getProperty("driverClassName"));
	 * ds.setJdbcUrl(cfgpp.getProperty("jdbc_url"));
	 * ds.setUser(cfgpp.getProperty("jdbc_username"));
	 * ds.setPassword(cfgpp.getProperty("jdbc_password")); } catch (Exception e)
	 * { e.printStackTrace(); return null; }
	 */
}
