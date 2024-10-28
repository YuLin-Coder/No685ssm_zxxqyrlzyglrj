package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.entity.Attend;
import com.entity.Rewards;
import com.entity.Users;
import com.service.AttendService;
import com.service.RewardsService;
import com.service.UsersService;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/ajax", produces = "text/plain;charset=utf-8")
public class AjaxController extends BaseController {
	@Autowired
	private UsersService usersService;
	@Autowired
	private AttendService attendService;
	@Autowired
	private RewardsService rewardsService;

	@RequestMapping("getUser.action")
	@ResponseBody
	public String getUser() {
		String id = this.getRequest().getParameter("id");
		Users users = new Users();
		users.setDeptid(id);
		List<Users> usersList = this.usersService.getUsersByCond(users);
		JSONArray usersid = new JSONArray();
		JSONArray usersname = new JSONArray();// 定义count存放数值
		for (Users u : usersList) {
			usersid.add(u.getUsersid());
			usersname.add(u.getRealname());
		}
		JSONObject json = new JSONObject();
		json.put("usersid", usersid.toString().replaceAll("\"", ""));
		json.put("usersname", usersname.toString().replaceAll("\"", ""));
		System.out.println(json.toString());
		return json.toString();
	}

	@RequestMapping("getSalary.action")
	@ResponseBody
	public String getSalary() {
		String id = this.getRequest().getParameter("usersid");
		String years = this.getRequest().getParameter("yearx");
		Users users = this.usersService.getUsersById(id);
		String message = "正常";
		Attend attend = new Attend();
		attend.setAddtime(years);
		attend.setUsersid(users.getRealname());
		attend.setStatus("未结算");
		List<Attend> attendList = this.attendService.getAttendByLike(attend);
		if (attendList.size() == 0) {
			message = "错误";
		}
		double attendSalary = 0;
		for (Attend x : attendList) {
			if ("惩罚".equals(x.getJiajian())) {
				attendSalary = attendSalary - Double.parseDouble(x.getSalary());
			} else {
				attendSalary = attendSalary + Double.parseDouble(x.getSalary());
			}
		}
		Rewards rewards = new Rewards();
		rewards.setAddtime(years);
		rewards.setUsersid(users.getRealname());
		rewards.setStatus("未结算");
		double rewardSalary = 0;
		List<Rewards> rewardsList = this.rewardsService.getRewardsByLike(rewards);
		for (Rewards x : rewardsList) {
			if ("奖励".equals(x.getCate())) {
				rewardSalary = rewardSalary + Double.parseDouble(x.getSalary());
			} else {
				rewardSalary = rewardSalary - Double.parseDouble(x.getSalary());
			}
		}
		JSONObject json = new JSONObject();
		json.put("duty", Double.parseDouble(users.getMoney()));
		json.put("attendSalary", attendSalary);
		json.put("rewardSalary", rewardSalary);
		json.put("message", message.toString().replaceAll("\"", ""));
		System.out.println(json.toString());
		return json.toString();
	}
}
