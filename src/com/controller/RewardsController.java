package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Rewards;
import com.service.RewardsService;
import com.entity.Dept;
import com.entity.Users;
import com.service.DeptService;
import com.service.UsersService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/rewards", produces = "text/plain;charset=utf-8")
public class RewardsController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private RewardsService rewardsService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private UsersService usersService;

	// 准备添加数据
	@RequestMapping("createRewards.action")
	public String createRewards() {
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		return "admin/addrewards";
	}

	// 添加数据
	@RequestMapping("addRewards.action")
	public String addRewards(Rewards rewards) {
		rewards.setStatus("未结算");
		this.rewardsService.insertRewards(rewards);
		return "redirect:/rewards/createRewards.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteRewards.action")
	public String deleteRewards(String id) {
		this.rewardsService.deleteRewards(id);
		return "redirect:/rewards/getAllRewards.action";
	}

	// 批量删除数据
	@RequestMapping("deleteRewardsByIds.action")
	public String deleteRewardsByIds() {
		String[] ids = this.getRequest().getParameterValues("rewardsid");
		for (String rewardsid : ids) {
			this.rewardsService.deleteRewards(rewardsid);
		}
		return "redirect:/rewards/getAllRewards.action";
	}

	// 更新数据
	@RequestMapping("updateRewards.action")
	public String updateRewards(Rewards rewards) {
		this.rewardsService.updateRewards(rewards);
		return "redirect:/rewards/getAllRewards.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "";
		Rewards rewards = this.rewardsService.getRewardsById(id);
		if (status.equals(rewards.getStatus())) {
			status = "";
		}
		rewards.setStatus(status);
		this.rewardsService.updateRewards(rewards);
		return "redirect:/rewards/getAllRewards.action";
	}

	// 显示全部数据
	@RequestMapping("getAllRewards.action")
	public String getAllRewards(String number) {
		List<Rewards> rewardsList = this.rewardsService.getAllRewards();
		PageHelper.getPage(rewardsList, "rewards", null, null, 10, number, this.getRequest(), null);
		return "admin/listrewards";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryRewardsByCond.action")
	public String queryRewardsByCond(String cond, String name, String number) {
		Rewards rewards = new Rewards();
		if (cond != null) {
			if ("deptid".equals(cond)) {
				rewards.setDeptid(name);
			}
			if ("usersid".equals(cond)) {
				rewards.setUsersid(name);
			}
			if ("cate".equals(cond)) {
				rewards.setCate(name);
			}
			if ("reason".equals(cond)) {
				rewards.setReason(name);
			}
			if ("resultx".equals(cond)) {
				rewards.setResultx(name);
			}
			if ("salary".equals(cond)) {
				rewards.setSalary(name);
			}
			if ("addtime".equals(cond)) {
				rewards.setAddtime(name);
			}
			if ("manager".equals(cond)) {
				rewards.setManager(name);
			}
			if ("status".equals(cond)) {
				rewards.setStatus(name);
			}
			if ("memo".equals(cond)) {
				rewards.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.rewardsService.getRewardsByLike(rewards), "rewards", nameList, valueList, 10, number, this.getRequest(),
				"query");
		name = null;
		cond = null;
		return "admin/queryrewards";
	}

	// 按主键查询数据
	@RequestMapping("getRewardsById.action")
	public String getRewardsById(String id) {
		Rewards rewards = this.rewardsService.getRewardsById(id);
		this.getRequest().setAttribute("rewards", rewards);
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		return "admin/editrewards";
	}

	public RewardsService getRewardsService() {
		return rewardsService;
	}

	public void setRewardsService(RewardsService rewardsService) {
		this.rewardsService = rewardsService;
	}

}

