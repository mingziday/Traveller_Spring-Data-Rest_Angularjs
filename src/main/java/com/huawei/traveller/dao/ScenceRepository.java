package com.huawei.traveller.dao;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.huawei.traveller.domain.Scence;

@Repository
@RepositoryRestResource(collectionResourceRel="scences",path="scences")
public interface ScenceRepository extends JpaRepository<Scence, Integer> {

	@Cacheable(value = "scenceCache")
	Scence findOne(Integer id);
	//获取最新增加的4个
	@Cacheable(value="scenceCache")
	List<Scence> findFirst4ByOrderByRegdateDesc();
	//获取分页列表，如何对每一个进行缓存
	@Cacheable(value = "scenceCache")
	Page<Scence> findAll(Pageable pageable);
	//保存
	//@SuppressWarnings("unchecked")
	//@CacheEvict(value = "scenceCache", key="#entity.id")
	//Scence save(Scence entity);
	//删除
	@CacheEvict(value = "scenceCache", key="#id")
	void delete(Integer id);
	
}