
package com.huawei.traveller.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.util.Log4jConfigListener;

/** 
 *Description: <web.xml通用设置>.
 *<配置相关Listener，servlet，filter等等>
 * @author Administrator  
 * @version V1.0                             
 */
/*Order表示启动顺序*/
@Order(1)
public class CommonInitializer implements WebApplicationInitializer{
	private static final Logger logger = LoggerFactory.getLogger(CommonInitializer.class);
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		
		//Log4jConfigListener监听器
		servletContext.setInitParameter("log4jConfigLocation", "classpath:log4j.properties");
		//-开一条watchdog线程每600秒扫描一下配置文件的变化
		servletContext.setInitParameter("log4jRefreshInterval", "600000");
		servletContext.addListener(Log4jConfigListener.class);

		//OpenSessionInViewFilter
		//针对JPA版本，需要的是OpenEntityManagerInViewFilter
		//openSessionInView配置 解决service层延迟加载引起的问题，过滤/结尾的文件
		OpenSessionInViewFilter hibernateSessionInViewFilter = new OpenSessionInViewFilter();
		// No bean named 'sessionFactory' is defined
		hibernateSessionInViewFilter.setSessionFactoryBeanName("sessionFactory");
		FilterRegistration.Dynamic filterRegistration = servletContext.addFilter(
				"hibernateFilter", hibernateSessionInViewFilter);
		filterRegistration.addMappingForUrlPatterns(
				EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/");
		/*Ehcache页面缓存过滤器*/
		logger.debug("webPageCacheFilter start...");
		//AnnotationConfigWebApplicationContext rootContext  =new AnnotationConfigWebApplicationContext();
		//rootContext.register(CacheConfig.class);
		FilterRegistration.Dynamic cacheFilterilterRegistration =servletContext.addFilter(
				"webPageCacheFilter", net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter.class);
		cacheFilterilterRegistration.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), false, "/test.*");
		logger.debug("webPageCacheFilter end...");
		/*DemoServlet
		DemoServlet demoServlet = new DemoServlet();
		ServletRegistration.Dynamic dynamic = servletContext.addServlet(
				"demoServlet", demoServlet);
		dynamic.setLoadOnStartup(2);
		dynamic.addMapping("/demo_servlet");
		*/
		
	}

	
}


