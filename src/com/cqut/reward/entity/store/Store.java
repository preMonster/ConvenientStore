package com.cqut.reward.entity.store;

import com.cqut.reward.entity.base.Entity;
import com.cqut.reward.service.tableCreator.ID;

public class Store extends Entity{
	@ID
	private String id;
	private String name;
	private String store_code;
	private String phone;
	private String address;
	private String number;
	private String area;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStore_code() {
		return store_code;
	}

	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "store";
	}

	@Override
	public String getPrimaryKey() {
		// TODO Auto-generated method stub
		return "id";
	}

}
