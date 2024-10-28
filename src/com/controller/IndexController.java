package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Applys;
import com.entity.Article;
import com.entity.Attend;
import com.entity.Banner;
import com.entity.Bbs;
import com.entity.Dept;
import com.entity.Duty;
import com.entity.Jobs;
import com.entity.Rebbs;
import com.entity.Rewards;
import com.entity.Salary;
import com.entity.Training;
import com.entity.Users;
import com.service.ApplysService;
import com.service.ArticleService;
import com.service.AttendService;
import com.service.BannerService;
import com.service.BbsService;
import com.service.DeptService;
import com.service.DutyService;
import com.service.JobsService;
import com.service.RebbsService;
import com.service.RewardsService;
import com.service.SalaryService;
import com.service.TrainingService;
import com.service.UsersService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping("/index")
public class IndexController extends BaseController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private DutyService dutyService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private AttendService attendService;
	@Autowired
	private RewardsService rewardsService;
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private SalaryService salaryService;
	@Autowired
	private BannerService bannerService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private JobsService jobsService;
	@Autowired
	private ApplysService applysService;
	@Autowired
	private BbsService bbsService;
	@Autowired
	private RebbsService rebbsService;

	// 公共方法 提供公共查询数据
	private void front() {
		this.getRequest().setAttribute("title", "考勤管理系统");
		List<Banner> bannerList = this.bannerService.getAllBanner();
		this.getRequest().setAttribute("bannerList", bannerList);
	}

	// 首页显示
	@RequestMapping("index.action")
	public String index() {
		this.front();
		List<Banner> bannerList = this.bannerService.getAllBanner();
		List<Banner> frontList = new ArrayList<Banner>();
		for (Banner banner : bannerList) {
			List<Article> articleList = this.articleService.getArticleByBanner(banner.getBannerid());
			banner.setArticleList(articleList);
			frontList.add(banner);
		}
		this.getRequest().setAttribute("frontList", frontList);
		List<Article> topList = this.articleService.getTopArticle();
		List<Article> favList = this.articleService.getFlvArticle();
		this.getRequest().setAttribute("topList", topList);
		this.getRequest().setAttribute("favList", favList);
		return "users/index";
	}

	// 新闻公告
	@RequestMapping("article.action")
	public String article(String id, String number) {
		this.front();
		Article article = new Article();
		article.setBannerid(id);
		List<Article> articleList = this.articleService.getArticleByCond(article);
		PageHelper.getIndexPage(articleList, "article", "article", id, 10, number, this.getRequest());
		Banner banner = this.bannerService.getBannerById(id);
		this.getRequest().setAttribute("banner", banner);
		return "users/article";
	}

	// 阅读公告
	@RequestMapping("read.action")
	public String read(String id) {
		this.front();
		Article article = this.articleService.getArticleById(id);
		article.setHits("" + (Integer.parseInt(article.getHits()) + 1));
		this.articleService.updateArticle(article);
		this.getRequest().setAttribute("article", article);
		return "users/read";
	}

	// 招聘信息
	@RequestMapping("jobs.action")
	public String jobs(String number) {
		this.front();
		Jobs jobs = new Jobs();
		jobs.setStatus("未结束");
		List<Jobs> jobsList = this.jobsService.getJobsByCond(jobs);
		PageHelper.getIndexPage(jobsList, "jobs", "jobs", null, 10, number, this.getRequest());
		return "users/jobs";
	}

	// 查看招聘信息
	@RequestMapping("readjobs.action")
	public String readjobs(String id) {
		this.front();
		Jobs jobs = this.jobsService.getJobsById(id);
		jobs.setHits("" + (Integer.parseInt(jobs.getHits()) + 1));
		this.jobsService.updateJobs(jobs);
		this.getRequest().setAttribute("jobs", jobs);
		return "users/readjobs";
	}

	@RequestMapping("preApplys.action")
	public String preApplys(String id) {
		this.front();
		this.getRequest().setAttribute("ano", "AS" + VeDate.getStringDatex());
		Jobs jobs = this.jobsService.getJobsById(id);
		this.getRequest().setAttribute("jobs", jobs);
		return "users/addApplys";
	}

	@RequestMapping("addApplys.action")
	public String addApplys(Applys applys) {
		this.front();
		applys.setStatus("未确认");
		applys.setAddtime(VeDate.getStringDate());
		this.applysService.insertApplys(applys);
		Jobs jobs = this.jobsService.getJobsById(applys.getJobsid());
		jobs.setAsignnum("" + (Integer.parseInt(jobs.getAsignnum()) + 1));
		this.jobsService.updateJobs(jobs);
		this.getSession().setAttribute("message", "投递简历成功");
		return "redirect:/index/readjobs.action?id=" + applys.getJobsid();
	}

	// 准备登录
	@RequestMapping("preLogin.action")
	public String prelogin() {
		this.front();
		return "users/login";
	}

	// 用户登录
	@RequestMapping("login.action")
	public String login() {
		this.front();
		String username = this.getRequest().getParameter("username");
		String password = this.getRequest().getParameter("password");
		Users u = new Users();
		u.setUsername(username);
		List<Users> usersList = this.usersService.getUsersByCond(u);
		if (usersList.size() == 0) {
			this.getSession().setAttribute("message", "用户名不存在");
			return "redirect:/index/preLogin.action";
		} else {
			Users users = usersList.get(0);
			if (password.equals(users.getPassword())) {
				this.getSession().setAttribute("userid", users.getUsersid());
				this.getSession().setAttribute("username", users.getUsername());
				this.getSession().setAttribute("users", users);
				return "redirect:/index/index.action";
			} else {
				this.getSession().setAttribute("message", "密码错误");
				return "redirect:/index/preLogin.action";
			}
		}
	}

	// 准备注册
	@RequestMapping("preReg.action")
	public String preReg() {
		this.front();
		List<Dept> deptList = this.deptService.getAllDept();
		List<Duty> dutyList = this.dutyService.getAllDuty();
		this.getRequest().setAttribute("deptList", deptList);
		this.getRequest().setAttribute("dutyList", dutyList);
		return "users/register";
	}

	// 用户注册
	@RequestMapping("register.action")
	public String register(Users users) {
		this.front();
		Users u = new Users();
		u.setUsername(users.getUsername());
		List<Users> usersList = this.usersService.getUsersByCond(u);
		if (usersList.size() == 0) {
			users.setWorkdate(VeDate.getStringDateShort());
			users.setRegdate(VeDate.getStringDateShort());
			users.setStatus("正常");
			this.usersService.insertUsers(users);
		} else {
			this.getSession().setAttribute("message", "用户名已存在");
			return "redirect:/index/preReg.action";
		}

		return "redirect:/index/preLogin.action";
	}

	// 退出登录
	@RequestMapping("exit.action")
	public String exit() {
		this.front();
		this.getSession().removeAttribute("userid");
		this.getSession().removeAttribute("username");
		this.getSession().removeAttribute("users");
		return "redirect:/index/index.action";
	}

	// 准备修改密码
	@RequestMapping("prePwd.action")
	public String prePwd() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		return "users/editpwd";
	}

	// 修改密码
	@RequestMapping("editpwd.action")
	public String editpwd() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		String password = this.getRequest().getParameter("password");
		String repassword = this.getRequest().getParameter("repassword");
		Users users = this.usersService.getUsersById(userid);
		if (password.equals(users.getPassword())) {
			users.setPassword(repassword);
			this.usersService.updateUsers(users);
		} else {
			this.getSession().setAttribute("message", "旧密码错误");
			return "redirect:/index/prePwd.action";
		}
		return "redirect:/index/prePwd.action";
	}

	@RequestMapping("usercenter.action")
	public String usercenter() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		return "users/usercenter";
	}

	@RequestMapping("userinfo.action")
	public String userinfo() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		this.getSession().setAttribute("users", this.usersService.getUsersById(userid));
		return "users/userinfo";
	}

	@RequestMapping("personal.action")
	public String personal(Users users) {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		this.usersService.updateUsers(users);
		return "redirect:/index/userinfo.action";
	}

	// 留言板
	@RequestMapping("bbs.action")
	public String bbs() {
		this.front();
		List<Bbs> bbsList = this.bbsService.getAllBbs();
		this.getRequest().setAttribute("bbsList", bbsList);
		return "users/bbs";
	}

	// 发布留言
	@RequestMapping("addbbs.action")
	public String addbbs() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Bbs bbs = new Bbs();
		bbs.setAddtime(VeDate.getStringDate());
		bbs.setContents(getRequest().getParameter("contents"));
		bbs.setHits("0");
		bbs.setRepnum("0");
		bbs.setTitle(getRequest().getParameter("title"));
		bbs.setUsersid(userid);
		this.bbsService.insertBbs(bbs);
		return "redirect:/index/bbs.action";
	}

	// 查看留言
	@RequestMapping("readbbs.action")
	public String readbbs() {
		this.front();
		Bbs bbs = this.bbsService.getBbsById(getRequest().getParameter("id"));
		bbs.setHits("" + (Integer.parseInt(bbs.getHits()) + 1));
		this.bbsService.updateBbs(bbs);
		this.getRequest().setAttribute("bbs", bbs);
		Rebbs rebbs = new Rebbs();
		rebbs.setBbsid(bbs.getBbsid());
		List<Rebbs> rebbsList = this.rebbsService.getRebbsByCond(rebbs);
		this.getRequest().setAttribute("rebbsList", rebbsList);
		return "users/readbbs";
	}

	// 回复留言
	@RequestMapping("rebbs.action")
	public String rebbs() {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Rebbs rebbs = new Rebbs();
		rebbs.setAddtime(VeDate.getStringDate());
		rebbs.setContents(getRequest().getParameter("contents"));
		rebbs.setBbsid(getRequest().getParameter("bbsid"));
		rebbs.setUsersid(userid);
		this.rebbsService.insertRebbs(rebbs);
		Bbs bbs = this.bbsService.getBbsById(rebbs.getBbsid());
		bbs.setRepnum("" + (Integer.parseInt(bbs.getRepnum()) + 1));
		this.bbsService.updateBbs(bbs);
		String path = "redirect:/index/readbbs.action?id=" + bbs.getBbsid();
		return path;
	}

	@RequestMapping("myAttend.action")
	public String myAttend(String number) {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Attend attend = new Attend();
		attend.setUsersid(userid);
		List<Attend> attendList = this.attendService.getAttendByCond(attend);
		PageHelper.getIndexPage(attendList, "attend", "myAttend", null, 10, number, this.getRequest());
		return "users/myAttend";
	}

	@RequestMapping("myReward.action")
	public String myReward(String number) {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Rewards rewards = new Rewards();
		rewards.setUsersid(userid);
		List<Rewards> rewardsList = this.rewardsService.getRewardsByCond(rewards);
		PageHelper.getIndexPage(rewardsList, "rewards", "myReward", null, 10, number, this.getRequest());
		return "users/myReward";
	}

	@RequestMapping("myTraining.action")
	public String myTraining(String number) {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Training training = new Training();
		training.setUsersid(userid);
		List<Training> trainingList = this.trainingService.getTrainingByCond(training);
		PageHelper.getIndexPage(trainingList, "training", "myTraining", null, 10, number, this.getRequest());
		return "users/myTraining";
	}

	@RequestMapping("mySalary.action")
	public String mySalary(String number) {
		this.front();
		if (this.getSession().getAttribute("userid") == null) {
			return "redirect:/index/preLogin.action";
		}
		String userid = (String) this.getSession().getAttribute("userid");
		Salary salary = new Salary();
		salary.setUsersid(userid);
		List<Salary> salaryList = this.salaryService.getSalaryByCond(salary);
		PageHelper.getIndexPage(salaryList, "salary", "mySalary", null, 10, number, this.getRequest());
		return "users/mySalary";
	}

}
