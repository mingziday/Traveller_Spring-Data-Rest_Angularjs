package com.huawei.traveller.service;

import java.io.Serializable;
import java.util.List;

import com.huawei.traveller.common.Page;
import com.huawei.traveller.domain.Scence;

public interface ScenceService{

	List<Scence> getScences();
	List<Scence> getScencesByPage();
	Scence getScenceById(Integer id);
	boolean updateScence(Scence scence);
	boolean saveScence(Scence scence);
	boolean deleteScenceById(Integer Id);
	
}
