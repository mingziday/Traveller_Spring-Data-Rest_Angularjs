package com.huawei.traveller.config;

import java.nio.charset.StandardCharsets;
import java.util.EnumSet;

import javax.servlet.*;

import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter;

/*
 * 所有实现了WebApplicationInitializer接口的类都会在容器启动时自动被加载运行，用@Order注解设定加载顺序
 * 这是servlet3.0+后加入的特性，
 * web.xml中可以不需要配置内容，都硬编码到WebApplicationInitializer的实现类中
 * spring DispatcherServlet的配置,其它servlet和监听器等需要额外声明，用@Order注解设定启动顺序
 */
@Order(3)
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 指定开始被servlet处理的url,配置从/开始
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	/*
	 * 配置root上下文context,如Jpa数据源等的配置 应用上下文，除web部分
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {
	    DataAccessConfig.class,
		AppConfig.class, 
		CacheConfig.class,
		};
	}

	/*
	 * 配置dispatcher servlet web上下文
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { 
			WebMvcConfig.class,
			WebFlowConfig.class 
			};
	}

	/*
	 * 配置servlet过滤器 注册过滤器，映射路径与DispatcherServlet一致，
	 * 路径不一致的过滤器需要注册到另外的WebApplicationInitializer中
	 */

	@Override
	protected Filter[] getServletFilters() {
		/*字符编码过滤器*/
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding(StandardCharsets.UTF_8.name());
		characterEncodingFilter.setForceEncoding(true);
		
		/*Ehcache页面缓存过滤器*/
		/*
		logger.debug("webPageCacheFilter start...");
		FilterRegistration.Dynamic cacheFilterilterRegistration = servletContext.addFilter(
				"webPageCacheFilter", net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter.class);
		cacheFilterilterRegistration.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), false, "/test.*");
		logger.debug("webPageCacheFilter end...");
		*/
		return new Filter[] { characterEncodingFilter};
	}

	@Override
	protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic registration) {
		registration.setInitParameter("dispatchOptionsRequest", "true");
		registration.setAsyncSupported(true);
	}
	/*
	 * 创建一个可以在非spring管理bean中获得spring管理的相关bean的对象：CP_SpringContext.getBean(String
	 * beanName)
	 */
	// @Override
	// protected WebApplicationContext createRootApplicationContext() {
	// // TODO Auto-generated method stub
	// WebApplicationContext ctx = super.createRootApplicationContext();
	// CP_SpringContext.getInstance().setApplicationContext(ctx);
	// return ctx;
	// }

}