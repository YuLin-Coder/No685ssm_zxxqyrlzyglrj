package com.entity;

import com.util.VeDate;

public class Users {
	private String usersid = "U" + VeDate.getStringId();// 生成主键编号
	private String username;// 用户名
	private String password;// 密码
	private String realname;// 姓名
	private String sex;// 性别
	private String birthday;// 出生日期
	private String deptid;// 所在部门
	private String dutyid;// 职务
	private String graduate;// 毕业院校
	private String xueli;// 学历
	private String idcard;// 身份证
	private String contact;// 联系方式
	private String address;// 家庭住址
	private String workdate;// 入职日期
	private String status;// 状态
	private String image;// 头像
	private String regdate;// 注册日期
	private String deptname;// 映射数据
	private String dutyname;// 映射数据
	private String money;

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getUsersid() {
		return usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDutyid() {
		return this.dutyid;
	}

	public void setDutyid(String dutyid) {
		this.dutyid = dutyid;
	}

	public String getGraduate() {
		return this.graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public String getXueli() {
		return this.xueli;
	}

	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWorkdate() {
		return this.workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRegdate() {
		return this.regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDutyname() {
		return this.dutyname;
	}

	public void setDutyname(String dutyname) {
		this.dutyname = dutyname;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Users [usersid=" + this.usersid + ", username=" + this.username + ", password=" + this.password + ", realname=" + this.realname
				+ ", sex=" + this.sex + ", birthday=" + this.birthday + ", deptid=" + this.deptid + ", dutyid=" + this.dutyid + ", graduate="
				+ this.graduate + ", xueli=" + this.xueli + ", idcard=" + this.idcard + ", contact=" + this.contact + ", address="
				+ this.address + ", workdate=" + this.workdate + ", status=" + this.status + ", image=" + this.image + ", regdate="
				+ this.regdate + ", deptname=" + this.deptname + ", dutyname=" + this.dutyname + "]";
	}

}

/**
 * 
 */
