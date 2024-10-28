package com.entity;

import com.util.VeDate;

public class Jobs {
	private String jobsid = "J" + VeDate.getStringId();// 生成主键编号
	private String title;// 标题
	private String deptid;// 部门
	private String dutyid;// 职务
	private String num;// 招聘人数
	private String asignnum;// 报名人数
	private String confirmnum;// 确认人数
	private String contents;// 详情
	private String addtime;// 发布日期
	private String hits;// 点击数
	private String status;// 状态
	private String memo;// 备注
	private String deptname;// 映射数据
	private String dutyname;// 映射数据

	public String getJobsid() {
		return jobsid;
	}

	public void setJobsid(String jobsid) {
		this.jobsid = jobsid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAsignnum() {
		return this.asignnum;
	}

	public void setAsignnum(String asignnum) {
		this.asignnum = asignnum;
	}

	public String getConfirmnum() {
		return this.confirmnum;
	}

	public void setConfirmnum(String confirmnum) {
		this.confirmnum = confirmnum;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getHits() {
		return this.hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
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

	public String getDutyname() {
		return this.dutyname;
	}

	public void setDutyname(String dutyname) {
		this.dutyname = dutyname;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Jobs [jobsid=" + this.jobsid + ", title=" + this.title + ", deptid=" + this.deptid + ", dutyid=" + this.dutyid + ", num="
				+ this.num + ", asignnum=" + this.asignnum + ", confirmnum=" + this.confirmnum + ", contents=" + this.contents + ", addtime="
				+ this.addtime + ", hits=" + this.hits + ", status=" + this.status + ", memo=" + this.memo + ", deptname=" + this.deptname
				+ ", dutyname=" + this.dutyname + "]";
	}

}

/**
 * 
 */
