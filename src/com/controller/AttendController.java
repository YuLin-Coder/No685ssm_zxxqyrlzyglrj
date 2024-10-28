package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Attend;
import com.service.AttendService;
import com.entity.Dept;
import com.entity.Users;
import com.entity.Cate;
import com.service.DeptService;
import com.service.UsersService;
import com.service.CateService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/attend", produces = "text/plain;charset=utf-8")
public class AttendController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private AttendService attendService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private CateService cateService;

	// 准备添加数据
	@RequestMapping("createAttend.action")
	public String createAttend() {
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		Cate cate = new Cate();
		cate.setIsuse("是");
		List<Cate> cateList = this.cateService.getCateByCond(cate);
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/addattend";
	}

	// 添加数据
	@RequestMapping("addAttend.action")
	public String addAttend(Attend attend) {
		attend.setAddtime(VeDate.getStringDateShort());
		attend.setStatus("未结算");
		this.attendService.insertAttend(attend);
		return "redirect:/attend/createAttend.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteAttend.action")
	public String deleteAttend(String id) {
		this.attendService.deleteAttend(id);
		return "redirect:/attend/getAllAttend.action";
	}

	// 批量删除数据
	@RequestMapping("deleteAttendByIds.action")
	public String deleteAttendByIds() {
		String[] ids = this.getRequest().getParameterValues("attendid");
		for (String attendid : ids) {
			this.attendService.deleteAttend(attendid);
		}
		return "redirect:/attend/getAllAttend.action";
	}

	// 更新数据
	@RequestMapping("updateAttend.action")
	public String updateAttend(Attend attend) {
		this.attendService.updateAttend(attend);
		return "redirect:/attend/getAllAttend.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "";
		Attend attend = this.attendService.getAttendById(id);
		if (status.equals(attend.getStatus())) {
			status = "";
		}
		attend.setStatus(status);
		this.attendService.updateAttend(attend);
		return "redirect:/attend/getAllAttend.action";
	}

	// 显示全部数据
	@RequestMapping("getAllAttend.action")
	public String getAllAttend(String number) {
		List<Attend> attendList = this.attendService.getAllAttend();
		PageHelper.getPage(attendList, "attend", null, null, 10, number, this.getRequest(), null);
		return "admin/listattend";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryAttendByCond.action")
	public String queryAttendByCond(String cond, String name, String number) {
		Attend attend = new Attend();
		if (cond != null) {
			if ("deptid".equals(cond)) {
				attend.setDeptid(name);
			}
			if ("usersid".equals(cond)) {
				attend.setUsersid(name);
			}
			if ("cateid".equals(cond)) {
				attend.setCateid(name);
			}
			if ("addtime".equals(cond)) {
				attend.setAddtime(name);
			}
			if ("status".equals(cond)) {
				attend.setStatus(name);
			}
			if ("memo".equals(cond)) {
				attend.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.attendService.getAttendByLike(attend), "attend", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryattend";
	}

	// 按主键查询数据
	@RequestMapping("getAttendById.action")
	public String getAttendById(String id) {
		Attend attend = this.attendService.getAttendById(id);
		this.getRequest().setAttribute("attend", attend);
		List<Dept> deptList = this.deptService.getAllDept();
		this.getRequest().setAttribute("deptList", deptList);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		List<Cate> cateList = this.cateService.getAllCate();
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/editattend";
	}

	public AttendService getAttendService() {
		return attendService;
	}

	public void setAttendService(AttendService attendService) {
		this.attendService = attendService;
	}

}

