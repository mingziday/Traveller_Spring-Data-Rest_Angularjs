package com.huawei.traveller.config;

import java.nio.charset.StandardCharsets;

import javax.servlet.*;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic registration) {
    registration.setInitParameter("dispatchOptionsRequest", "true");
    registration.setAsyncSupported(true);
  }

  //配置root上下文context,如Jpa数据源等的配置
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { AppConfig.class };
  }
  
  //配置dispatcher servlet
  @Override
  protected Class<?>[] getServletConfigClasses() {
      return new Class<?>[] { WebConfig.class };
  }

  //指定开始被servlet处理的url,配置从/开始
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  //配置servlet过滤器
  @Override
  protected Filter[] getServletFilters() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding(StandardCharsets.UTF_8.name());
    characterEncodingFilter.setForceEncoding(true);
    return new Filter[] { characterEncodingFilter };
  }
    
}