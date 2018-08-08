package com.zhx.myspringboot.sys.user.bean;

import com.zhx.myspringboot.frame.BaseEntity;

public class SysUser extends BaseEntity {

	private String id;
	private String userCode;
	private String userName;
	private String password;
	private String nickName;
	private String phone;
	private String mail;
	private String sex;
	private String age;
	private String type;
	private String useStatus;
	private String lastLoginTime;
	private String loginTotal;
	private String themeId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUse_status(String useStatus) {
		this.useStatus = useStatus;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLoginTotal() {
		return loginTotal;
	}
	public void setLoginTotal(String loginTotal) {
		this.loginTotal = loginTotal;
	}
	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	@Override
	public String toString() {
		return "SysUser [id=" + id + ", userCode=" + userCode + ", userName="
				+ userName + ", password=" + password + ", nickName="
				+ nickName + ", phone=" + phone + ", mail=" + mail + ", sex="
				+ sex + ", age=" + age + ", type=" + type + ", useStatus="
				+ useStatus + ", lastLoginTime=" + lastLoginTime
				+ ", loginTotal=" + loginTotal + ", isDel=" + getIsDel()
				+ ", creator=" + getCreator() + ", createTime=" + getCreateTime()
				+ ", updator=" + getUpdator()+ ", updateTime=" + getUpdateTime()
				+ ", themeId=" + themeId +",pageNo="+getPageNo()+",pageSize="+getPageSize()+ "]";
	}
	
}
