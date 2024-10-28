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
<title>${title }</title>
<link href="themes/nzblue/css/css.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/css_2.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/nzcms_top.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/users.js"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script language="javascript" type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="1004" border="0" align="center" cellpadding="0" cellspacing="10" bgcolor="#FFFFFF">
		<tr>
			<td align="center" valign="top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5" class="bg_qc">
					<tr>
						<td width="25" height="20" align="center"><img src="themes/nzblue/images/nzcms.xinxin.gif" alt="标" width="9"
							height="9" /></td>
						<td align="left" class="p12">您的位置： <a href="index.jsp">首页</a>&nbsp;&gt;&nbsp;&nbsp;个人信息
						</td>
					</tr>
				</table>
				<table height="30" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
				<form action="index/personal.action" name="myform" method="post">
					<table width="56%" border="0" cellpadding="5" cellspacing="1" bgcolor="#E0EDB7">
						<tr>
							<td height="30" colspan="2" align="center" background="themes/nzblue/images/nzcms/list_bg.gif" class="white14B">个人信息</td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">账号：</td>
							<td bgcolor="#FFFFFF">${sessionScope.users.username }<input type="hidden" name="username" id="username"
								value="${sessionScope.users.username }" /> <input type="hidden" name="password" id="password"
								value="${sessionScope.users.password }" /> <input type="hidden" name="usersid" id="usersid"
								value="${sessionScope.users.usersid }" /> <input type="hidden" name="regdate" id="regdate"
								value="${sessionScope.users.regdate }" /><input type="hidden" name="status" id="status"
								value="${sessionScope.users.status }" /><input type="hidden" name="deptid" id="deptid"
								value="${sessionScope.users.deptid }" /><input type="hidden" name="dutyid" id="dutyid"
								value="${sessionScope.users.dutyid }" /><input type="hidden" name="workdate" id="workdate"
								value="${sessionScope.users.workdate }" />
							</td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">姓名：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="realname" style="width: 260px; height: 30px" id="realname"
								value="${sessionScope.users.realname }" readonly="readonly" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">性别：</td>
							<td bgcolor="#FFFFFF"><input type="radio" name="sex" id="sex" value="男"
								${sessionScope.users.sex == "男"?"checked":""} />男 &nbsp;&nbsp; <input type="radio" name="sex" id="sex"
								value="女" ${sessionScope.users.sex == "女"?"checked":""} />女</td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">部门：</td>
							<td bgcolor="#FFFFFF">${sessionScope.users.deptname }</td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">职务：</td>
							<td bgcolor="#FFFFFF">${sessionScope.users.dutyname }</td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">身份证：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="idcard" style="width: 260px; height: 30px" id="idcard"
								value="${sessionScope.users.idcard }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">毕业院校：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="graduate" style="width: 260px; height: 30px" id="graduate"
								value="${sessionScope.users.graduate }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">学历：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="xueli" style="width: 260px; height: 30px" id="xueli"
								value="${sessionScope.users.xueli }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">出生日期：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="birthday" onclick="WdatePicker()" readonly="readonly"
								style="width: 260px; height: 30px" id="birthday" value="${sessionScope.users.birthday }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">联系方式：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="contact" style="width: 260px; height: 30px" id="contact"
								value="${sessionScope.users.contact }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">家庭住址：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="address" style="width: 260px; height: 30px" id="address"
								value="${sessionScope.users.address }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">头像：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="image" style="width: 260px; height: 30px" id="image"
								value="${sessionScope.users.image }" onclick="selimage();" readonly="readonly" /></td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF" colspan="2" align="center"><label> <input type="submit" name="Submit"
									value="提交" /> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" name="Submit2" value="重置" />
							</label></td>
						</tr>
					</table>
				</form>
				<table height="50" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
