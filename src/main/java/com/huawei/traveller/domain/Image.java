package com.huawei.traveller.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the v_images database table.
 * 
 */
@Entity
@Table(name="v_images")
@NamedQuery(name="Image.findAll", query="SELECT i FROM Image i")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name = "info", columnDefinition = "TEXT")
	private String info;

	private String name;

	private int poster;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedate;

	//bi-directional many-to-one association to Scence
	//@ManyToOne
	//private Scence Scence;
	
	public Image() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoster() {
		return this.poster;
	}

	public void setPoster(int poster) {
		this.poster = poster;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	/*
	public Scence getScence() {
		return this.Scence;
	}

	public void setScence(Scence Scence) {
		this.Scence = Scence;
	}
	*/
}