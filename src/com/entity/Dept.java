package com.entity;

import com.util.VeDate;

public class Dept {
	private String deptid = "D" + VeDate.getStringId();// 生成主键编号
	private String deptname;// 部门名称
	private String manager;// 负责人
	private String business;// 业务范围
	private String address;// 地址
	private String contact;// 联系方式
	private String addtime;// 创建日期
	private String memo;// 备注

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Dept [deptid=" + this.deptid + ", deptname=" + this.deptname + ", manager=" + this.manager + ", business=" + this.business
				+ ", address=" + this.address + ", contact=" + this.contact + ", addtime=" + this.addtime + ", memo=" + this.memo + "]";
	}

}

/**
 * 
 */
