package com.cqut.reward.entity.role;

import java.util.Date;

import com.cqut.reward.entity.base.Entity;
import com.cqut.reward.service.tableCreator.ID;

public class Role extends Entity{
	
	@ID
	private String ID;
	private String name;
	private String createID;
	private Date createTime;
	private String description;
	
	public String getID() {
		return ID;
	}	
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateID() {
		return createID;
	}	
	
	public void setCreateID(String createID) {
		this.createID = createID;
	}
	public Date getCreateTime() {
		return createTime;
	}	
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDescription() {
		return description;
	}	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [" +  "ID=" + ID  + ", " +  "name=" + name +  ", " +  "createID=" + createID  + ", " +  "createTime=" + createTime  + ", " +  "description=" + description  + ", "   + "]";
	}
	
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "role";
	}

	@Override
	public String getPrimaryKey() {
		// TODO Auto-generated method stub
		return "ID";
	}
}
