package com.pk.simpleCRUD.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CrudItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String contactName;
	private String phone;
	private String remarks;
	
	public CrudItem() {
		
	}
	
	public CrudItem(Long id, String contactName,String phone, String remarks) {
		super();
		this.id = id;
		this.phone = phone;
		this.contactName = contactName;
		this.remarks = remarks;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
