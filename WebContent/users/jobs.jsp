<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>${title}</title>
<link href="themes/nzblue/css/css.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/css_2.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/nzcms_top.css" rel="stylesheet" type="text/css">
<script language="javascript" src="js/validator.js"></script>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>

	<!--下拉这里开始 -->

	<table width="1004" border="0" align="center" cellpadding="0" cellspacing="8" bgcolor="#FFFFFF">
		<tr valign="top">
			<td align="center">
				<table width="98%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5" class="bg_qc">
					<tr>
						<td width="25" height="20" align="center"><img src="themes/nzblue/images/nzcms.xinxin.gif" alt="标" /></td>
						<td align="left" class="p12">您的位置： <a href="<%=basePath%>">首页</a>&nbsp;&gt;&gt;&nbsp;职位招聘
						</td>
					</tr>
				</table>
				<table height="10" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table> <!--文章显示 -->
				<table width="98%" border="0" cellpadding="0" cellspacing="0"
					background="themes/nzblue/images/nzcms/list_news_bg.gif">
					<tr>
						<td width="190" height="33" align="center" class="title14b">职位招聘信息</td>
						<td align="right">&nbsp;&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table height="20" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0" class="dx">
					<c:forEach items="${jobsList}" var="jobs">
						<tr>
							<td width="35" height="40" align="center"><img src="themes/nzblue/images/txt.png" alt="图标" /></td>
							<td align="left" class="p14"><a href="index/readjobs.action?id=${jobs.jobsid }"
								title="标题：${jobs.title }"><font class="p14"> ${jobs.title }</font> </a></td>
							<td width="110" align="left">浏览：${jobs.hits }次</td>
							<td width="140" align="left">发稿：${jobs.addtime }</td>
						</tr>
					</c:forEach>
				</table> <!--文章显示 -->
			</td>
		</tr>
	</table>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
