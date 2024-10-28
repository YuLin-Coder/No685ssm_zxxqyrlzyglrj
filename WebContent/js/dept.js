$(function() {

$("#deptname").blur(
		function() {
			$("#deptname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#deptname").after("<span id='deptname_msg' style='color: red'>部门名称不能为空</span>");
			}
	});

$("#manager").blur(
		function() {
			$("#manager_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#manager").after("<span id='manager_msg' style='color: red'>负责人不能为空</span>");
			}
	});

$("#business").blur(
		function() {
			$("#business_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#business").after("<span id='business_msg' style='color: red'>业务范围不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>地址不能为空</span>");
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

$("#addtime").blur(
		function() {
			$("#addtime_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#addtime").after("<span id='addtime_msg' style='color: red'>创建日期不能为空</span>");
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
var deptname = $("#deptname").val();
var manager = $("#manager").val();
var business = $("#business").val();
var address = $("#address").val();
var contact = $("#contact").val();
var addtime = $("#addtime").val();
var memo = $("#memo").val();
$("#deptname_msg").empty();
$("#manager_msg").empty();
$("#business_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
$("#addtime_msg").empty();
$("#memo_msg").empty();
if (deptname == "" || deptname == null) {
	$("#deptname").after("<span id='deptname_msg' style='color: red'>部门名称不能为空</span>");
	return false;
}
if (manager == "" || manager == null) {
	$("#manager").after("<span id='manager_msg' style='color: red'>负责人不能为空</span>");
	return false;
}
if (business == "" || business == null) {
	$("#business").after("<span id='business_msg' style='color: red'>业务范围不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>地址不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
if (addtime == "" || addtime == null) {
	$("#addtime").after("<span id='addtime_msg' style='color: red'>创建日期不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#deptname_msg").empty();
$("#manager_msg").empty();
$("#business_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
$("#addtime_msg").empty();
$("#memo_msg").empty();
});

});
