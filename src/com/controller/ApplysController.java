package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Applys;
import com.service.ApplysService;
import com.entity.Jobs;
import com.service.JobsService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/applys", produces = "text/plain;charset=utf-8")
public class ApplysController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private ApplysService applysService;
	@Autowired
	private JobsService jobsService;

	// 准备添加数据
	@RequestMapping("createApplys.action")
	public String createApplys() {
		List<Jobs> jobsList = this.jobsService.getAllJobs();
		this.getRequest().setAttribute("jobsList", jobsList);
		return "admin/addapplys";
	}

	// 添加数据
	@RequestMapping("addApplys.action")
	public String addApplys(Applys applys) {
		applys.setAddtime(VeDate.getStringDateShort());
		applys.setStatus("");
		this.applysService.insertApplys(applys);
		return "redirect:/applys/createApplys.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteApplys.action")
	public String deleteApplys(String id) {
		this.applysService.deleteApplys(id);
		return "redirect:/applys/getAllApplys.action";
	}

	// 批量删除数据
	@RequestMapping("deleteApplysByIds.action")
	public String deleteApplysByIds() {
		String[] ids = this.getRequest().getParameterValues("applysid");
		for (String applysid : ids) {
			this.applysService.deleteApplys(applysid);
		}
		return "redirect:/applys/getAllApplys.action";
	}

	// 更新数据
	@RequestMapping("updateApplys.action")
	public String updateApplys(Applys applys) {
		this.applysService.updateApplys(applys);
		return "redirect:/applys/getAllApplys.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "确认";
		Applys applys = this.applysService.getApplysById(id);
		applys.setStatus(status);
		this.applysService.updateApplys(applys);
		Jobs jobs = this.jobsService.getJobsById(applys.getJobsid());
		jobs.setConfirmnum("" + (Integer.parseInt(jobs.getConfirmnum()) + 1));
		this.jobsService.updateJobs(jobs);
		return "redirect:/applys/getAllApplys.action";
	}

	@RequestMapping("refuse.action")
	public String refuse(String id) {
		String status = "拒绝";
		Applys applys = this.applysService.getApplysById(id);
		applys.setStatus(status);
		this.applysService.updateApplys(applys);
		return "redirect:/applys/getAllApplys.action";
	}

	// 显示全部数据
	@RequestMapping("getAllApplys.action")
	public String getAllApplys(String number) {
		List<Applys> applysList = this.applysService.getAllApplys();
		PageHelper.getPage(applysList, "applys", null, null, 10, number, this.getRequest(), null);
		return "admin/listapplys";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryApplysByCond.action")
	public String queryApplysByCond(String cond, String name, String number) {
		Applys applys = new Applys();
		if (cond != null) {
			if ("ano".equals(cond)) {
				applys.setAno(name);
			}
			if ("jobsid".equals(cond)) {
				applys.setJobsid(name);
			}
			if ("filurl".equals(cond)) {
				applys.setFilurl(name);
			}
			if ("addtime".equals(cond)) {
				applys.setAddtime(name);
			}
			if ("status".equals(cond)) {
				applys.setStatus(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.applysService.getApplysByLike(applys), "applys", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryapplys";
	}

	// 按主键查询数据
	@RequestMapping("getApplysById.action")
	public String getApplysById(String id) {
		Applys applys = this.applysService.getApplysById(id);
		this.getRequest().setAttribute("applys", applys);
		List<Jobs> jobsList = this.jobsService.getAllJobs();
		this.getRequest().setAttribute("jobsList", jobsList);
		return "admin/editapplys";
	}

	public ApplysService getApplysService() {
		return applysService;
	}

	public void setApplysService(ApplysService applysService) {
		this.applysService = applysService;
	}

}

