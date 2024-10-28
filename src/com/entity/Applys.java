package com.entity;

import com.util.VeDate;

public class Applys {
	private String applysid = "A" + VeDate.getStringId();// 生成主键编号
	private String ano;// 求职单号
	private String jobsid;// 招聘信息
	private String filurl;// 简历文件
	private String addtime;// 报名日期
	private String status;// 状态
	private String title;// 映射数据

	public String getApplysid() {
		return applysid;
	}

	public void setApplysid(String applysid) {
		this.applysid = applysid;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getJobsid() {
		return this.jobsid;
	}

	public void setJobsid(String jobsid) {
		this.jobsid = jobsid;
	}

	public String getFilurl() {
		return this.filurl;
	}

	public void setFilurl(String filurl) {
		this.filurl = filurl;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Applys [applysid=" + this.applysid + ", ano=" + this.ano + ", jobsid=" + this.jobsid + ", filurl=" + this.filurl + ", addtime="
				+ this.addtime + ", status=" + this.status + ", title=" + this.title + "]";
	}

}

/**
 * 
 */
