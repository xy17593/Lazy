/**
 * 用户类
 */
package com.impo.O2O.entity;

import java.util.Date;

/**
 * @author wuy
 *
 */
public class PersonInfo {	
	//用户ID
	private long userId;
	//用户名称
	private String userName;
	//用户头像
	private String profileImg;
	//用户邮箱
	private String userEmail;
	//用户手机号
	private String phoneNum;
	//用户身份证号
	private String userCard;
	//用户性别
	private String gender;
	//用户状态
	private Integer enableStatus;
	//用户类型：1.顾客 2.店家 3.超级管理员
	private Integer userType;
	//用户创建时间
	private Date createTime;
	//用户更新时间
	private Date lastEditTime;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getUserCard() {
		return userCard;
	}
	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
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
	
	public PersonInfo() {
		super();
	}
	public PersonInfo(long userId, String userName, String profileImg, String userEmail, String phoneNum, String userCard,
			String gender, Integer enableStatus, Integer userType, Date createTime, Date lastEditTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.profileImg = profileImg;
		this.userEmail = userEmail;
		this.phoneNum = phoneNum;
		this.userCard = userCard;
		this.gender = gender;
		this.enableStatus = enableStatus;
		this.userType = userType;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	
}
