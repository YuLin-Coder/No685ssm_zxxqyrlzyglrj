package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Salary;
import com.service.SalaryService;
import com.entity.Attend;
import com.entity.Dept;
import com.entity.Rewards;
import com.entity.Users;
import com.service.AttendService;
import com.service.DeptService;
import com.service.RewardsService;
import com.service.UsersService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/salary", produces = "text/plain;charset=utf-8")
public class SalaryController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private SalaryService salaryService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private AttendService attendService;
	@Autowired
	private RewardsService rewardsService;

	// 准备添加数据
	@RequestMapping("createSalary.action")
	public String createSalary() {
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		this.getRequest().setAttribute("yearx", VeDate.getStringYearMonth());
		return "admin/addsalary";
	}

	// 添加数据
	@RequestMapping("addSalary.action")
	public String addSalary(Salary salary) {
		double total = Double.parseDouble(salary.getAttend()) + Double.parseDouble(salary.getBasic()) + Double.parseDouble(salary.getReward())
				+ Double.parseDouble(salary.getOthers());
		salary.setTotal("" + VeDate.getDouble(total));
		salary.setStatus("未领取");
		this.salaryService.insertSalary(salary);
		Users users = this.usersService.getUsersById(salary.getUsersid());
		Attend attend = new Attend();
		attend.setAddtime(salary.getYearx());
		attend.setUsersid(users.getRealname());
		attend.setStatus("未结算");
		List<Attend> attendList = this.attendService.getAttendByLike(attend);
		for (Attend x : attendList) {
			x.setStatus("已结算");
			this.attendService.updateAttend(x);
		}
		Rewards rewards = new Rewards();
		rewards.setAddtime(salary.getYearx());
		rewards.setUsersid(users.getRealname());
		rewards.setStatus("未结算");
		List<Rewards> rewardsList = this.rewardsService.getRewardsByLike(rewards);
		for (Rewards x : rewardsList) {
			x.setStatus("已结算");
			this.rewardsService.updateRewards(x);
		}
		return "redirect:/salary/createSalary.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteSalary.action")
	public String deleteSalary(String id) {
		this.salaryService.deleteSalary(id);
		return "redirect:/salary/getAllSalary.action";
	}

	// 批量删除数据
	@RequestMapping("deleteSalaryByIds.action")
	public String deleteSalaryByIds() {
		String[] ids = this.getRequest().getParameterValues("salaryid");
		for (String salaryid : ids) {
			this.salaryService.deleteSalary(salaryid);
		}
		return "redirect:/salary/getAllSalary.action";
	}

	// 更新数据
	@RequestMapping("updateSalary.action")
	public String updateSalary(Salary salary) {
		this.salaryService.updateSalary(salary);
		return "redirect:/salary/getAllSalary.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "已领取";
		Salary salary = this.salaryService.getSalaryById(id);
		salary.setStatus(status);
		this.salaryService.updateSalary(salary);
		return "redirect:/salary/getAllSalary.action";
	}

	// 显示全部数据
	@RequestMapping("getAllSalary.action")
	public String getAllSalary(String number) {
		List<Salary> salaryList = this.salaryService.getAllSalary();
		PageHelper.getPage(salaryList, "salary", null, null, 10, number, this.getRequest(), null);
		return "admin/listsalary";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("querySalaryByCond.action")
	public String querySalaryByCond(String cond, String name, String number) {
		Salary salary = new Salary();
		if (cond != null) {
			if ("deptid".equals(cond)) {
				salary.setDeptid(name);
			}
			if ("usersid".equals(cond)) {
				salary.setUsersid(name);
			}
			if ("basic".equals(cond)) {
				salary.setBasic(name);
			}
			if ("attend".equals(cond)) {
				salary.setAttend(name);
			}
			if ("reward".equals(cond)) {
				salary.setReward(name);
			}
			if ("others".equals(cond)) {
				salary.setOthers(name);
			}
			if ("total".equals(cond)) {
				salary.setTotal(name);
			}
			if ("yearx".equals(cond)) {
				salary.setYearx(name);
			}
			if ("status".equals(cond)) {
				salary.setStatus(name);
			}
			if ("memo".equals(cond)) {
				salary.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.salaryService.getSalaryByLike(salary), "salary", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querysalary";
	}

	// 按主键查询数据
	@RequestMapping("getSalaryById.action")
	public String getSalaryById(String id) {
		Salary salary = this.salaryService.getSalaryById(id);
		this.getRequest().setAttribute("salary", salary);
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		return "admin/editsalary";
	}

	public SalaryService getSalaryService() {
		return salaryService;
	}

	public void setSalaryService(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

}

