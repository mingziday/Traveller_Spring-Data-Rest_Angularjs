package com.huawei.traveller.domain;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the v_users database table.
 * 
 */
@Entity
@Table(name = "v_users" , catalog = "happycardata")
//@NamedQuery(name="User.findAll", query="SELECT v FROM VUser v")
public class User extends AbstractEntity {
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private int country;

	private String email;

	/*否则会报错*/
	@Column(name = "enabled", columnDefinition = "BIT", length = 1)
	private boolean enabled;

	@Lob
	@Column(name = "info", columnDefinition = "TEXT")
	private String info;

	private String name;

	private String nickname;

	private String password;

	private String phone;

	private String picture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regdate;

	public User() {
	}


	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}