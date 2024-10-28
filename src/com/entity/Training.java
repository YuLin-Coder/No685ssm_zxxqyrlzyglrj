package com.entity;

import com.util.VeDate;

public class Training {
	private String trainingid = "T" + VeDate.getStringId();// 生成主键编号
	private String deptid;// 部门
	private String usersid;// 员工
	private String cate;// 培训类型
	private String reason;// 培训原因
	private String thestart;// 开始日期
	private String theend;// 结束日期
	private String memo;// 备注
	private String deptname;// 映射数据
	private String realname;// 映射数据

	public String getTrainingid() {
		return trainingid;
	}

	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
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

	public String getCate() {
		return this.cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getThestart() {
		return this.thestart;
	}

	public void setThestart(String thestart) {
		this.thestart = thestart;
	}

	public String getTheend() {
		return this.theend;
	}

	public void setTheend(String theend) {
		this.theend = theend;
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

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Training [trainingid=" + this.trainingid + ", deptid=" + this.deptid + ", usersid=" + this.usersid + ", cate=" + this.cate
				+ ", reason=" + this.reason + ", thestart=" + this.thestart + ", theend=" + this.theend + ", memo=" + this.memo + ", deptname="
				+ this.deptname + ", realname=" + this.realname + "]";
	}

}

/**
 * 
 */
