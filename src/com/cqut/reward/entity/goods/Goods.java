package com.cqut.reward.entity.goods;

import com.cqut.reward.entity.base.Entity;
import com.cqut.reward.service.tableCreator.ID;


public class Goods extends Entity {
	@ID
	private String ID;
	private String name;
	private int type;
	private String description;
	private double price;
	private int number;
	private int is_promotion;
	private String store_id;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getIs_promotion() {
		return is_promotion;
	}

	public void setIs_promotion(int is_promotion) {
		this.is_promotion = is_promotion;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	
	
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Goods";
	}

	@Override
	public String getPrimaryKey() {
		// TODO Auto-generated method stub
		return "ID";
	}

}
