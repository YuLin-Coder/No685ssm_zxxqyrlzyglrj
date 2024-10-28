$(function() {

$("#deptid").blur(
		function() {
			$("#deptid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#deptid").after("<span id='deptid_msg' style='color: red'>部门不能为空</span>");
			}
	});

$("#usersid").blur(
		function() {
			$("#usersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#usersid").after("<span id='usersid_msg' style='color: red'>员工不能为空</span>");
			}
	});

$("#basic").blur(
		function() {
			$("#basic_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#basic").after("<span id='basic_msg' style='color: red'>基本工资不能为空</span>");
			}
	});

$("#attend").blur(
		function() {
			$("#attend_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#attend").after("<span id='attend_msg' style='color: red'>考勤工资不能为空</span>");
			}
	});

$("#reward").blur(
		function() {
			$("#reward_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#reward").after("<span id='reward_msg' style='color: red'>奖惩工资不能为空</span>");
			}
	});

$("#others").blur(
		function() {
			$("#others_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#others").after("<span id='others_msg' style='color: red'>其他工资不能为空</span>");
			}
	});

$("#yearx").blur(
		function() {
			$("#yearx_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#yearx").after("<span id='yearx_msg' style='color: red'>年月不能为空</span>");
			}
	});

$("#memo").blur(
		function() {
			$("#memo_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
			}
	});







$('#sub').click(function(){
var deptid = $("#deptid").val();
var usersid = $("#usersid").val();
var basic = $("#basic").val();
var attend = $("#attend").val();
var reward = $("#reward").val();
var others = $("#others").val();
var yearx = $("#yearx").val();
var memo = $("#memo").val();
$("#deptid_msg").empty();
$("#usersid_msg").empty();
$("#basic_msg").empty();
$("#attend_msg").empty();
$("#reward_msg").empty();
$("#others_msg").empty();
$("#yearx_msg").empty();
$("#memo_msg").empty();
if (deptid == "" || deptid == null) {
	$("#deptid").after("<span id='deptid_msg' style='color: red'>部门不能为空</span>");
	return false;
}
if (usersid == "" || usersid == null) {
	$("#usersid").after("<span id='usersid_msg' style='color: red'>员工不能为空</span>");
	return false;
}
if (basic == "" || basic == null) {
	$("#basic").after("<span id='basic_msg' style='color: red'>基本工资不能为空</span>");
	return false;
}
if (attend == "" || attend == null) {
	$("#attend").after("<span id='attend_msg' style='color: red'>考勤工资不能为空</span>");
	return false;
}
if (reward == "" || reward == null) {
	$("#reward").after("<span id='reward_msg' style='color: red'>奖惩工资不能为空</span>");
	return false;
}
if (others == "" || others == null) {
	$("#others").after("<span id='others_msg' style='color: red'>其他工资不能为空</span>");
	return false;
}
if (yearx == "" || yearx == null) {
	$("#yearx").after("<span id='yearx_msg' style='color: red'>年月不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#deptid_msg").empty();
$("#usersid_msg").empty();
$("#basic_msg").empty();
$("#attend_msg").empty();
$("#reward_msg").empty();
$("#others_msg").empty();
$("#yearx_msg").empty();
$("#memo_msg").empty();
});

});
