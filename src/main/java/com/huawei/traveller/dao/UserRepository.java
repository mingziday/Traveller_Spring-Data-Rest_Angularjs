package com.huawei.traveller.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huawei.traveller.domain.Scence;
import com.huawei.traveller.domain.User;

@Repository
@RepositoryRestResource(collectionResourceRel="users",path="users")
public interface UserRepository extends JpaRepository<User, Integer> {
	/*
	 * save/delete/upadte/findAll自带
	 */
	//获取所有
	List<User> findAll();
	//获取最新增加的6个
	List<User> findFirst6ByOrderByRegdateDesc();
	//获取分页
	Page<User> findAll(Pageable pageable);
	
	@Cacheable(value = "userCache")
	User findOne(Integer id);

}