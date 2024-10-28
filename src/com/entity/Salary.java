package com.entity;

import com.util.VeDate;

public class Salary {
	private String salaryid = "S" + VeDate.getStringId();// 生成主键编号
	private String deptid;// 部门
	private String usersid;// 员工
	private String basic;// 基本工资
	private String attend;// 考勤工资
	private String reward;// 奖惩工资
	private String others;// 其他工资
	private String total;// 总计
	private String yearx;// 年月
	private String status;// 状态
	private String memo;// 备注
	private String deptname;// 映射数据
	private String realname;// 映射数据

	public String getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(String salaryid) {
		this.salaryid = salaryid;
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

	public String getBasic() {
		return this.basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getAttend() {
		return this.attend;
	}

	public void setAttend(String attend) {
		this.attend = attend;
	}

	public String getReward() {
		return this.reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getOthers() {
		return this.others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getYearx() {
		return this.yearx;
	}

	public void setYearx(String yearx) {
		this.yearx = yearx;
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

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Salary [salaryid=" + this.salaryid + ", deptid=" + this.deptid + ", usersid=" + this.usersid + ", basic=" + this.basic
				+ ", attend=" + this.attend + ", reward=" + this.reward + ", others=" + this.others + ", total=" + this.total + ", yearx="
				+ this.yearx + ", status=" + this.status + ", memo=" + this.memo + ", deptname=" + this.deptname + ", realname=" + this.realname
				+ "]";
	}

}

/**
 * 
 */
