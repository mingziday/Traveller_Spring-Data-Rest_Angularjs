package com.huawei.traveller.service.impl;

import org.springframework.stereotype.Service;

import com.huawei.traveller.service.UserService;

@Service("userServiceBean")
public class UserServiceImpl implements UserService {
	/*
	@Autowired
	public UserDaoImpl userDaoImpl;

	@Override
	public List<User> findAll() {
		return userDaoImpl.getListByHQL(" from User");
	}
	
	
	 @Override
	public Serializable saveStudent(Student student) {
		return studentDaoImpl.save(student);
	}

	@Override
	public List<Student> listAllStudent() {
		return studentDaoImpl.getListByHQL(" from Student");
	}

	@Override
	public Page<Student> getSutdentPage(int currentPageNum) {
		// 没有指定页码，默认查询第一页
		if (currentPageNum <= 0) 
		{
			currentPageNum = 1;
		}
		//可以带参数取得总数
		int totalRecordsNums = studentDaoImpl.countByHQL(" select count(*) from Student");

		// 创建Page对象
		Page<Student> page = new Page<Student>(currentPageNum, totalRecordsNums);
		//参数取得记录
		System.out.println(page.getStartIndex());
		page.setRecords(studentDaoImpl.getListPageByHQL(" from Student ",page.getStartIndex(), page.getPageSize()));
		return page;
	}

	@Override
	public Student getStudent(int stuId) {
		return studentDaoImpl.get(stuId);
	}

	@Override
	public Serializable updateStudent(Student student) {
		studentDaoImpl.update(student);
		return 1;
	}

	@Override
	public Student getStudentByEmailAndPwd(String email, String password) {
		return studentDaoImpl.getByHQL(" from Student where stuEmail = ? and stuPassword = ?", email,password);
	}

	@Override
	public Student getStudentByNameAndPwd(String name, String password) {
		return studentDaoImpl.getByHQL(" from Student where stuNetname = ? and stuPassword = ?", name,password);

	}
	*/

}
