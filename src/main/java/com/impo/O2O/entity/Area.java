package com.impo.O2O.entity;

import java.util.Date;

public class Area{
	//ID
	private Integer areaId;
	//Ȩ�أ��������ã�
	private Integer priority;
	//����
	private String areaName;
	//����ʱ��
	private Date createTime;
	//����ʱ��
	private Date lastEditTime;
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	
	public Area() {
		super();
	}
	public Area(Integer areaId, Integer priority, String areaName, Date createTime, Date lastEditTime) {
		super();
		this.areaId = areaId;
		this.priority = priority;
		this.areaName = areaName;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	
}
