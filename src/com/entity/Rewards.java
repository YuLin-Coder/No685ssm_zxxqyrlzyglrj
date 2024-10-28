package com.entity;

import com.util.VeDate;

public class Rewards {
	private String rewardsid = "R" + VeDate.getStringId();// 生成主键编号
	private String deptid;// 部门
	private String usersid;// 员工
	private String cate;// 奖惩类型
	private String reason;// 原因
	private String resultx;// 处理意见
	private String salary;// 奖惩金额
	private String addtime;// 日期
	private String manager;// 处理人
	private String status;// 状态
	private String memo;// 备注
	private String deptname;// 映射数据
	private String realname;// 映射数据

	public String getRewardsid() {
		return rewardsid;
	}

	public void setRewardsid(String rewardsid) {
		this.rewardsid = rewardsid;
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

	public String getResultx() {
		return this.resultx;
	}

	public void setResultx(String resultx) {
		this.resultx = resultx;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
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
		return "Rewards [rewardsid=" + this.rewardsid + ", deptid=" + this.deptid + ", usersid=" + this.usersid + ", cate=" + this.cate
				+ ", reason=" + this.reason + ", resultx=" + this.resultx + ", salary=" + this.salary + ", addtime=" + this.addtime
				+ ", manager=" + this.manager + ", status=" + this.status + ", memo=" + this.memo + ", deptname=" + this.deptname
				+ ", realname=" + this.realname + "]";
	}

}

/**
 * 
 */
