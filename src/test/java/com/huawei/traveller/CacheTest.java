package com.huawei.traveller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.huawei.traveller.config.AppConfig;
import com.huawei.traveller.config.CacheConfig;
import com.huawei.traveller.dao.ScenceRepository;
import com.huawei.traveller.dao.UserRepository;
import com.huawei.traveller.domain.Scence;
import com.huawei.traveller.domain.User;
import com.huawei.traveller.service.ScenceService;
import com.huawei.traveller.service.impl.ScenceServiceImpl;

public class CacheTest {
	
	private static final Logger log = LoggerFactory.getLogger(CacheTest.class);
	
	public static void main(String[] args) {
     
	    ApplicationContext context = new AnnotationConfigApplicationContext(
	    		AppConfig.class,CacheConfig.class);
	    
	    ScenceRepository obj = context.getBean(ScenceRepository.class);
	    Scence user = obj.findOne(1);
	    if (null == user)
	    {
	    	System.out.println("NULL");
	    }
	    else
	    {
	    	System.out.println(user.getName());
	    }
	    Scence user2 = obj.getOne(1);
	    System.out.println(user2.getName());
	   // log.debug("Result : {}", obj.findByDirector("dummy"));
	   // log.debug("Result : {}", obj.findByDirector("dummy"));
	  
	}
}