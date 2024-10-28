$(function() {

$("#username").blur(
		function() {
			$("#username_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#username").after("<span id='username_msg' style='color: red'>用户名不能为空</span>");
			}
	});

$("#password").blur(
		function() {
			$("#password_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
			}
	});

$("#realname").blur(
		function() {
			$("#realname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#realname").after("<span id='realname_msg' style='color: red'>姓名不能为空</span>");
			}
	});

$("#birthday").blur(
		function() {
			$("#birthday_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#birthday").after("<span id='birthday_msg' style='color: red'>出生日期不能为空</span>");
			}
	});

$("#deptid").blur(
		function() {
			$("#deptid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#deptid").after("<span id='deptid_msg' style='color: red'>所在部门不能为空</span>");
			}
	});

$("#dutyid").blur(
		function() {
			$("#dutyid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#dutyid").after("<span id='dutyid_msg' style='color: red'>职务不能为空</span>");
			}
	});

$("#graduate").blur(
		function() {
			$("#graduate_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#graduate").after("<span id='graduate_msg' style='color: red'>毕业院校不能为空</span>");
			}
	});

$("#xueli").blur(
		function() {
			$("#xueli_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#xueli").after("<span id='xueli_msg' style='color: red'>学历不能为空</span>");
			}
	});

$("#idcard").blur(
		function() {
			$("#idcard_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#idcard").after("<span id='idcard_msg' style='color: red'>身份证不能为空</span>");
			}
	});

$("#contact").blur(
		function() {
			$("#contact_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>家庭住址不能为空</span>");
			}
	});

$("#image").blur(
		function() {
			$("#image_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#image").after("<span id='image_msg' style='color: red'>头像不能为空</span>");
			}
	});







$('#sub').click(function(){
var username = $("#username").val();
var password = $("#password").val();
var realname = $("#realname").val();
var birthday = $("#birthday").val();
var deptid = $("#deptid").val();
var dutyid = $("#dutyid").val();
var graduate = $("#graduate").val();
var xueli = $("#xueli").val();
var idcard = $("#idcard").val();
var contact = $("#contact").val();
var address = $("#address").val();
var image = $("#image").val();
$("#username_msg").empty();
$("#password_msg").empty();
$("#realname_msg").empty();
$("#birthday_msg").empty();
$("#deptid_msg").empty();
$("#dutyid_msg").empty();
$("#graduate_msg").empty();
$("#xueli_msg").empty();
$("#idcard_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#image_msg").empty();
if (username == "" || username == null) {
	$("#username").after("<span id='username_msg' style='color: red'>用户名不能为空</span>");
	return false;
}
if (password == "" || password == null) {
	$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
	return false;
}
if (realname == "" || realname == null) {
	$("#realname").after("<span id='realname_msg' style='color: red'>姓名不能为空</span>");
	return false;
}
if (birthday == "" || birthday == null) {
	$("#birthday").after("<span id='birthday_msg' style='color: red'>出生日期不能为空</span>");
	return false;
}
if (deptid == "" || deptid == null) {
	$("#deptid").after("<span id='deptid_msg' style='color: red'>所在部门不能为空</span>");
	return false;
}
if (dutyid == "" || dutyid == null) {
	$("#dutyid").after("<span id='dutyid_msg' style='color: red'>职务不能为空</span>");
	return false;
}
if (graduate == "" || graduate == null) {
	$("#graduate").after("<span id='graduate_msg' style='color: red'>毕业院校不能为空</span>");
	return false;
}
if (xueli == "" || xueli == null) {
	$("#xueli").after("<span id='xueli_msg' style='color: red'>学历不能为空</span>");
	return false;
}
if (idcard == "" || idcard == null) {
	$("#idcard").after("<span id='idcard_msg' style='color: red'>身份证不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>家庭住址不能为空</span>");
	return false;
}
if (image == "" || image == null) {
	$("#image").after("<span id='image_msg' style='color: red'>头像不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#username_msg").empty();
$("#password_msg").empty();
$("#realname_msg").empty();
$("#birthday_msg").empty();
$("#deptid_msg").empty();
$("#dutyid_msg").empty();
$("#graduate_msg").empty();
$("#xueli_msg").empty();
$("#idcard_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#image_msg").empty();
});

});
