$(function() {

$("#title").blur(
		function() {
			$("#title_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#title").after("<span id='title_msg' style='color: red'>标题不能为空</span>");
			}
	});

$("#deptid").blur(
		function() {
			$("#deptid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#deptid").after("<span id='deptid_msg' style='color: red'>部门不能为空</span>");
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

$("#num").blur(
		function() {
			$("#num_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#num").after("<span id='num_msg' style='color: red'>招聘人数不能为空</span>");
			}
	});

$("#contents").blur(
		function() {
			$("#contents_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contents").after("<span id='contents_msg' style='color: red'>详情不能为空</span>");
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
var title = $("#title").val();
var deptid = $("#deptid").val();
var dutyid = $("#dutyid").val();
var num = $("#num").val();
var contents = $("#contents").val();
var memo = $("#memo").val();
$("#title_msg").empty();
$("#deptid_msg").empty();
$("#dutyid_msg").empty();
$("#num_msg").empty();
$("#contents_msg").empty();
$("#memo_msg").empty();
if (title == "" || title == null) {
	$("#title").after("<span id='title_msg' style='color: red'>标题不能为空</span>");
	return false;
}
if (deptid == "" || deptid == null) {
	$("#deptid").after("<span id='deptid_msg' style='color: red'>部门不能为空</span>");
	return false;
}
if (dutyid == "" || dutyid == null) {
	$("#dutyid").after("<span id='dutyid_msg' style='color: red'>职务不能为空</span>");
	return false;
}
if (num == "" || num == null) {
	$("#num").after("<span id='num_msg' style='color: red'>招聘人数不能为空</span>");
	return false;
}
if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>详情不能为空</span>");
	return false;
}
if (memo == "" || memo == null) {
	$("#memo").after("<span id='memo_msg' style='color: red'>备注不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#title_msg").empty();
$("#deptid_msg").empty();
$("#dutyid_msg").empty();
$("#num_msg").empty();
$("#contents_msg").empty();
$("#memo_msg").empty();
});

});
