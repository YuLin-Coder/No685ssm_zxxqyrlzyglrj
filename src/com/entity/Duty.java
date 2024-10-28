package com.entity;

import com.util.VeDate;

public class Duty {
	private String dutyid = "D" + VeDate.getStringId();// 生成主键编号
	private String dutyname;// 职务名称
	private String salary;// 职务工资
	private String addtime;// 创建日期
	private String memo;// 备注

	public String getDutyid() {
		return dutyid;
	}

	public void setDutyid(String dutyid) {
		this.dutyid = dutyid;
	}

	public String getDutyname() {
		return this.dutyname;
	}

	public void setDutyname(String dutyname) {
		this.dutyname = dutyname;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Duty [dutyid=" + this.dutyid + ", dutyname=" + this.dutyname + ", salary=" + this.salary + ", addtime=" + this.addtime
				+ ", memo=" + this.memo + "]";
	}

}

/**
 * 
 */
