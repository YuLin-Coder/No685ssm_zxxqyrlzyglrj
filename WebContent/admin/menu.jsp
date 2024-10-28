<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">

		<dl id="menu-admin">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>管理员信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admin/createAdmin.action" data-title="新增管理员" href="javascript:void(0)">新增管理员信息</a></li>
					<li><a data-href="admin/getAllAdmin.action" data-title="管理员列表" href="javascript:void(0)">管理员信息列表</a></li>
					<li><a data-href="admin/queryAdminByCond.action" data-title="管理员查询" href="javascript:void(0)">管理员信息查询</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-member">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>员工账户信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="users/getAllUsers.action" data-title="职工账户列表" href="javascript:void(0)">员工账户信息列表</a></li>
					<li><a data-href="users/queryUsersByCond.action" data-title="职工账户查询" href="javascript:void(0)">员工账户信息查询</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>部门信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="dept/createDept.action" data-title="新增部门" href="javascript:void(0)">新增部门信息</a></li>
					<li><a data-href="dept/getAllDept.action" data-title="部门列表" href="javascript:void(0)">部门信息列表</a></li>
					<li><a data-href="dept/queryDeptByCond.action" data-title="部门查询" href="javascript:void(0)">部门信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>职务信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="duty/createDuty.action" data-title="新增职务" href="javascript:void(0)">新增职务信息</a></li>
					<li><a data-href="duty/getAllDuty.action" data-title="职务列表" href="javascript:void(0)">职务信息列表</a></li>
					<li><a data-href="duty/queryDutyByCond.action" data-title="职务查询" href="javascript:void(0)">职务信息查询</a></li>
				</ul>
			</dd>
		</dl>



		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>考勤类别信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="cate/createCate.action" data-title="新增考勤类别" href="javascript:void(0)">新增考勤类别信息</a></li>
					<li><a data-href="cate/getAllCate.action" data-title="考勤类别列表" href="javascript:void(0)">考勤类别信息列表</a></li>
					<li><a data-href="cate/queryCateByCond.action" data-title="考勤类别查询" href="javascript:void(0)">考勤类别信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>员工考勤信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="attend/createAttend.action" data-title="新增员工考勤" href="javascript:void(0)">新增员工考勤信息</a></li>
					<li><a data-href="attend/getAllAttend.action" data-title="员工考勤列表" href="javascript:void(0)">员工考勤信息列表</a></li>
					<li><a data-href="attend/queryAttendByCond.action" data-title="员工考勤查询" href="javascript:void(0)">员工考勤信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>员工奖惩信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="rewards/createRewards.action" data-title="新增员工奖惩" href="javascript:void(0)">新增员工奖惩信息</a></li>
					<li><a data-href="rewards/getAllRewards.action" data-title="员工奖惩列表" href="javascript:void(0)">员工奖惩信息列表</a></li>
					<li><a data-href="rewards/queryRewardsByCond.action" data-title="员工奖惩查询" href="javascript:void(0)">员工奖惩信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>员工培训信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="training/createTraining.action" data-title="新增员工培训" href="javascript:void(0)">新增员工培训信息</a></li>
					<li><a data-href="training/getAllTraining.action" data-title="员工培训列表" href="javascript:void(0)">员工培训信息列表</a></li>
					<li><a data-href="training/queryTrainingByCond.action" data-title="员工培训查询" href="javascript:void(0)">员工培训信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>员工薪资信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="salary/createSalary.action" data-title="新增员工薪资" href="javascript:void(0)">新增员工薪资信息</a></li>
					<li><a data-href="salary/getAllSalary.action" data-title="员工薪资列表" href="javascript:void(0)">员工薪资信息列表</a></li>
					<li><a data-href="salary/querySalaryByCond.action" data-title="员工薪资查询" href="javascript:void(0)">员工薪资信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>网站栏目信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="banner/createBanner.action" data-title="新增网站栏目" href="javascript:void(0)">新增网站栏目信息</a></li>
					<li><a data-href="banner/getAllBanner.action" data-title="网站栏目列表" href="javascript:void(0)">网站栏目信息列表</a></li>
					<li><a data-href="banner/queryBannerByCond.action" data-title="网站栏目查询" href="javascript:void(0)">网站栏目信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>网站内容信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="article/createArticle.action" data-title="新增网站内容" href="javascript:void(0)">新增网站内容信息</a></li>
					<li><a data-href="article/getAllArticle.action" data-title="网站内容列表" href="javascript:void(0)">网站内容信息列表</a></li>
					<li><a data-href="article/queryArticleByCond.action" data-title="网站内容查询" href="javascript:void(0)">网站内容信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>职位招聘信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="jobs/createJobs.action" data-title="新增职位招聘" href="javascript:void(0)">新增职位招聘信息</a></li>
					<li><a data-href="jobs/getAllJobs.action" data-title="职位招聘列表" href="javascript:void(0)">职位招聘信息列表</a></li>
					<li><a data-href="jobs/queryJobsByCond.action" data-title="职位招聘查询" href="javascript:void(0)">职位招聘信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>求职简历信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="applys/getAllApplys.action" data-title="求职简历列表" href="javascript:void(0)">求职简历信息列表</a></li>
					<li><a data-href="applys/queryApplysByCond.action" data-title="求职简历查询" href="javascript:void(0)">求职简历信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>留言交流信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="bbs/getAllBbs.action" data-title="留言交流列表" href="javascript:void(0)">留言交流信息列表</a></li>
					<li><a data-href="bbs/queryBbsByCond.action" data-title="留言交流查询" href="javascript:void(0)">留言交流信息查询</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>留言回复信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="rebbs/getAllRebbs.action" data-title="留言回复列表" href="javascript:void(0)">留言回复信息列表</a></li>
					<li><a data-href="rebbs/queryRebbsByCond.action" data-title="留言回复查询" href="javascript:void(0)">留言回复信息查询</a></li>
				</ul>
			</dd>
		</dl>

	</div>
</aside>


