/**
 * �û���
 */
package com.impo.O2O.entity;

import java.util.Date;

/**
 * @author wuy
 *
 */
public class PersonInfo {	
	//�û�ID
	private long userId;
	//�û�����
	private String userName;
	//�û�ͷ��
	private String profileImg;
	//�û�����
	private String userEmail;
	//�û��ֻ���
	private String phoneNum;
	//�û����֤��
	private String userCard;
	//�û��Ա�
	private String gender;
	//�û�״̬
	private Integer enableStatus;
	//�û����ͣ�1.�˿� 2.��� 3.��������Ա
	private Integer userType;
	//�û�����ʱ��
	private Date createTime;
	//�û�����ʱ��
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
