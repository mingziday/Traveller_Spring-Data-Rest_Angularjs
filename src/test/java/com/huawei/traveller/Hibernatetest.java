package com.huawei.traveller;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Hibernatetest {
	/**
	 * 这个before方法在所有的测试方法之前执行，并且只执行一次 
	 * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
	 * 比如在before方法里面初始化ApplicationContext和userService
	 */
/*
	private StudentService studentService;

	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml", "spring-hibernate.xml" });
		studentService = (StudentService) ac.getBean("studentService");

	}

	@Test
	public void testSaveMethod() {
		// ApplicationContext ac = new ClassPathXmlApplicationContext(new
		// String[]{"spring.xml","spring-hibernate.xml"});
		// UserServiceI userService = (UserServiceI) ac.getBean("userService");
		Student student = new Student();
		student.setStuNetname("mingziday");
		student.setStuPassword("mingming");
		student.setStuRegistdate(new Date());
		
		studentService.save(student);
		System.out.println("ID is " + student.getStuId());
	}
	*/
}