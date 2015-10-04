package com.huawei.traveller;

import org.junit.Test;
import junit.framework.TestCase;

public class StudentServiceTest extends TestCase {

	/*
	 * @Test public void test() { // 通过spring.xml配置文件创建Spring的应用程序上下文环境
	 * ApplicationContext ac = new ClassPathXmlApplicationContext(
	 * "classpath:applicationContext.xml"); // 从Spring的IOC容器中获取bean对象
	 * UserService userService = (UserService) ac.getBean("userService"); //
	 * 执行测试方法 userService.test(); }
	 */
	@Test
	public void testPge() {
		/**
		 * 因为已经整合了Hibernate，UserServiceImpl类中使用到了userDao，
		 * userDao是由spring创建并且注入给UserServiceImpl类的
		 * ，而userDao中又使用到了sessionFactory对象
		 * 而创建sessionFactory对象时需要使用到spring-hibernate.xml这个配置文件中的配置项信息，
		 * 所以创建Spring的应用程序上下文环境时，需要同时使用spring.xml和spring-hibernate.xml这两个配置文件
		 * 否则在执行Maven install命令时，因为maven会先执行test方法中的代码，而代码执行到 UserServiceI
		 * userService = (UserServiceI) ac.getBean("userService");
		 * 这一行时就会因为userDao中使用到sessionFactory对象无法正常创建的而出错，这样执行Maven
		 * install命令编译项目时就会失败！
		 *
		 */
		/*
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml", "spring-hibernate.xml" });
		// 从Spring的IOC容器中获取bean对象
		StudentService userService = (StudentService) ac.getBean("studentServiceBean");
		// 执行测试方法
		Page<Student> list = userService.getSutdentPage("2");
		for(Student stu : list.getRecords())
		{
			System.out.println(stu.getStuId()+":"+stu.getStuNetname());
		}
		*/
	}

	/*
	 * @Test public void testSpringEnv(){
	 * 
	 * ApplicationContext context = new
	 * ClassPathXmlApplicationContext("applicationContext.xml");
	 * 
	 * Person person = (Person) context.getBean("person");
	 * System.out.println(person.getAge()); }
	 * 
	 * @Test public void testHibernateEnv(){ //加载指定目录下的配置文件，得到configuration对象
	 * Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	 * //根据configuration对象得到session工厂对象 SessionFactory factory =
	 * cfg.buildSessionFactory(); //使用工厂类打开一个session Session session =
	 * factory.openSession(); //开启事务 Transaction tx =
	 * session.beginTransaction(); //创建待插入数据库的对象 ApplicationContext context =
	 * new ClassPathXmlApplicationContext("applicationContext.xml"); Person p =
	 * (Person) context.getBean("person");
	 * p.setPid(UUID.randomUUID().toString()); p.setName("xxx"); //保存对象
	 * session.save(p); //提交事务 tx.commit(); //关闭资源 session.close();
	 * factory.close(); }
	 */
}
