<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<title>欢迎使用网站考勤管理系统</title>
<link rel="stylesheet" type="text/css" href="h-ui/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/css/style.css" />
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="h-ui/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="h-ui/h-ui.admin/js/H-ui.admin.js"></script>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>员工奖惩管理 <span class="c-gray en">&gt;</span>
		员工奖惩查询 <a class="btn btn-success radius r" style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"> <i class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<table class="table table-border table-bordered table-bg">
			<thead>
				<tr>
					<th scope="col" colspan="11">员工奖惩查询</th>
				</tr>
				<tr class="text-c">
					<th class="center">部门</th>
					<th class="center">员工</th>
					<th class="center">奖惩类型</th>
					<th class="center">原因</th>
					<th class="center">处理意见</th>
					<th class="center">奖惩金额</th>
					<th class="center">日期</th>
					<th class="center">处理人</th>
					<th class="center">状态</th>
					<th class="center">备注</th>
				</tr>
			</thead>
			<c:forEach items="${rewardsList}" var="rewards">
				<tr class="text-c">
					<td class="center">${rewards.deptname}</td>
					<td class="center">${rewards.realname}</td>
					<td class="center">${rewards.cate}</td>
					<td class="center">${rewards.reason}</td>
					<td class="center">${rewards.resultx}</td>
					<td class="center">${rewards.salary}</td>
					<td class="center">${rewards.addtime}</td>
					<td class="center">${rewards.manager}</td>
					<td class="center">${rewards.status}</td>
					<td class="center">${rewards.memo}</td>
				</tr>
			</c:forEach>
		</table>
		<div class="cl pd-5 mt-20"></div>
		<div class="text-c">
			<form action="rewards/queryRewardsByCond.action" name="myform" method="post">
				查询条件： <span class="select-box" style="width: 200px;"><select name="cond" class="select">
						<option value="deptid">按部门查询</option>
						<option value="usersid">按员工查询</option>
						<option value="cate">按奖惩类型查询</option>
						<option value="reason">按原因查询</option>
						<option value="resultx">按处理意见查询</option>
						<option value="salary">按奖惩金额查询</option>
						<option value="addtime">按日期查询</option>
						<option value="manager">按处理人查询</option>
						<option value="status">按状态查询</option>
						<option value="memo">按备注查询</option>
				</select></span>&nbsp;&nbsp;关键字<input type="text" name="name" required style="width: 200px" class="input-text" />
				<button type="submit" class="btn btn-success radius">
					<i class="Hui-iconfont">&#xe665;</i> 查询
				</button>
			</form>
		</div>
	</div>
</body>
</html>

