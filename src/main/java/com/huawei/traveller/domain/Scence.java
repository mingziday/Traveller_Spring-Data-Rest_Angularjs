package com.huawei.traveller.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the v_scences database table.
 * 
 */
@Entity
@Table(name="v_scences")
@NamedQuery(name="Scence.findAll", query="SELECT v FROM Scence v")
public class Scence extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	/*
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private int id;
	*/
	private String address;

	private short country;

	private int hearts;

	@Column(name = "info", columnDefinition = "TEXT")
	private String info;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regdate;

	//bi-directional many-to-one association to Image
	@OneToMany
	@JoinColumn(name="scenceid")
	private Set<Image> Images;

	public Scence() {
	}
	/*
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	*/
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public short getCountry() {
		return this.country;
	}

	public void setCountry(short country) {
		this.country = country;
	}

	public int getHearts() {
		return this.hearts;
	}

	public void setHearts(int hearts) {
		this.hearts = hearts;
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

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Set<Image> getImages() {
		return this.Images;
	}

	public void setImages(Set<Image> Images) {
		this.Images = Images;
	}
	
	/*
	public Image addImage(Image Image) {
		getImages().add(Image);
		Image.setScence(this);
		return Image;
	}

	public Image removeImage(Image Image) {
		getImages().remove(Image);
		Image.setScence(null);
		return Image;
	}
	*/
}