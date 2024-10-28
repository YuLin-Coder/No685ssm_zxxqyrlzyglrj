package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Training;
import com.service.TrainingService;
import com.entity.Dept;
import com.entity.Users;
import com.service.DeptService;
import com.service.UsersService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/training", produces = "text/plain;charset=utf-8")
public class TrainingController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private UsersService usersService;

	// 准备添加数据
	@RequestMapping("createTraining.action")
	public String createTraining() {
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		return "admin/addtraining";
	}

	// 添加数据
	@RequestMapping("addTraining.action")
	public String addTraining(Training training) {
		this.trainingService.insertTraining(training);
		return "redirect:/training/createTraining.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteTraining.action")
	public String deleteTraining(String id) {
		this.trainingService.deleteTraining(id);
		return "redirect:/training/getAllTraining.action";
	}

	// 批量删除数据
	@RequestMapping("deleteTrainingByIds.action")
	public String deleteTrainingByIds() {
		String[] ids = this.getRequest().getParameterValues("trainingid");
		for (String trainingid : ids) {
			this.trainingService.deleteTraining(trainingid);
		}
		return "redirect:/training/getAllTraining.action";
	}

	// 更新数据
	@RequestMapping("updateTraining.action")
	public String updateTraining(Training training) {
		this.trainingService.updateTraining(training);
		return "redirect:/training/getAllTraining.action";
	}

	// 显示全部数据
	@RequestMapping("getAllTraining.action")
	public String getAllTraining(String number) {
		List<Training> trainingList = this.trainingService.getAllTraining();
		PageHelper.getPage(trainingList, "training", null, null, 10, number, this.getRequest(), null);
		return "admin/listtraining";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryTrainingByCond.action")
	public String queryTrainingByCond(String cond, String name, String number) {
		Training training = new Training();
		if (cond != null) {
			if ("deptid".equals(cond)) {
				training.setDeptid(name);
			}
			if ("usersid".equals(cond)) {
				training.setUsersid(name);
			}
			if ("cate".equals(cond)) {
				training.setCate(name);
			}
			if ("reason".equals(cond)) {
				training.setReason(name);
			}
			if ("thestart".equals(cond)) {
				training.setThestart(name);
			}
			if ("theend".equals(cond)) {
				training.setTheend(name);
			}
			if ("memo".equals(cond)) {
				training.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.trainingService.getTrainingByLike(training), "training", nameList, valueList, 10, number, this.getRequest(),
				"query");
		name = null;
		cond = null;
		return "admin/querytraining";
	}

	// 按主键查询数据
	@RequestMapping("getTrainingById.action")
	public String getTrainingById(String id) {
		Training training = this.trainingService.getTrainingById(id);
		this.getRequest().setAttribute("training", training);
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		return "admin/edittraining";
	}

	public TrainingService getTrainingService() {
		return trainingService;
	}

	public void setTrainingService(TrainingService trainingService) {
		this.trainingService = trainingService;
	}

}

