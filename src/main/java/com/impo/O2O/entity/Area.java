package com.impo.O2O.entity;

import java.util.Date;

public class Area{
	//ID
	private Integer areaId;
	//权重（排序作用）
	private Integer priority;
	//名称
	private String areaName;
	//创建时间
	private Date createTime;
	//更新时间
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
