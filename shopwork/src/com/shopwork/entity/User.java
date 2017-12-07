package com.shopwork.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	private String mail;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="info")
	private String info;        //������Ϣ���ṩ������Ϣ�޸Ĺ���
	@Column(name="address")
	private String address;		//�ջ���ַ
	@Column(name="iconpath")
	private String iconPath;	//�û�ͷ��
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	
	
}
