package com.huawei.traveller.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.huawei.traveller.domain.Scence;

@Repository
@RepositoryRestResource(collectionResourceRel="scences",path="scences")
public interface ScenceRepository extends JpaRepository<Scence, Integer> {
	/*
	 * save/delete/upadte/findAll自带
	 */
	//获取最新增加的6个
	List<Scence> findFirst4ByOrderByRegdateDesc();
	//获取分页
	Page<Scence> findAll(Pageable pageable);
	
}