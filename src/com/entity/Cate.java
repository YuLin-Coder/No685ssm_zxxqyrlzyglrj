package com.entity;

import com.util.VeDate;

public class Cate {
	private String cateid = "C" + VeDate.getStringId();// 生成主键编号
	private String catename;// 名称
	private String jiajian;// 加减
	private String salary;// 薪资
	private String isuse;// 是否启用
	private String memo;// 备注

	public String getCateid() {
		return cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getJiajian() {
		return this.jiajian;
	}

	public void setJiajian(String jiajian) {
		this.jiajian = jiajian;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getIsuse() {
		return this.isuse;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
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
		return "Cate [cateid=" + this.cateid + ", catename=" + this.catename + ", jiajian=" + this.jiajian + ", salary=" + this.salary
				+ ", isuse=" + this.isuse + ", memo=" + this.memo + "]";
	}

}

/**
 * 
 */
