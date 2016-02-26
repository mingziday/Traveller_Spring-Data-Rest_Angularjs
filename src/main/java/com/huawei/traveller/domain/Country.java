package com.huawei.traveller.domain;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the v_country database table.
 * 
 */
@Entity
@Table(name="Country")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String flag;

	private String name;

	private Timestamp updatetime;

	public Country() {
	}


	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

}