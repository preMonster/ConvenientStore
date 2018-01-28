package com.cqut.reward.entity.order;

import java.util.Date;

import com.cqut.reward.entity.base.Entity;
import com.cqut.reward.service.tableCreator.ID;

public class Order extends Entity{
	@ID
	private String id;
	private String order_code;
	private Date create_time;
	private Date finish_time;
	private int state;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getFinish_time() {
		return finish_time;
	}

	public void setFinish_time(Date finish_time) {
		this.finish_time = finish_time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "order";
	}

	@Override
	public String getPrimaryKey() {
		// TODO Auto-generated method stub
		return "id";
	}

}
