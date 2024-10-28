package com.entity;

import com.util.VeDate;

public class Attend {
	private String attendid = "A" + VeDate.getStringId();// 生成主键编号
	private String deptid;// 部门
	private String usersid;// 员工
	private String cateid;// 考勤类型
	private String addtime;// 日期
	private String status;// 状态
	private String memo;// 备注
	private String deptname;// 映射数据
	private String realname;// 映射数据
	private String catename;// 映射数据
	private String jiajian;
	private String salary;

	public String getJiajian() {
		return jiajian;
	}

	public void setJiajian(String jiajian) {
		this.jiajian = jiajian;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAttendid() {
		return attendid;
	}

	public void setAttendid(String attendid) {
		this.attendid = attendid;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getUsersid() {
		return this.usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getCateid() {
		return this.cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Attend [attendid=" + this.attendid + ", deptid=" + this.deptid + ", usersid=" + this.usersid + ", cateid=" + this.cateid
				+ ", addtime=" + this.addtime + ", status=" + this.status + ", memo=" + this.memo + ", deptname=" + this.deptname
				+ ", realname=" + this.realname + ", catename=" + this.catename + "]";
	}

}

/**
 * 
 */
