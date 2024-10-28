$(function() {

$("#ano").blur(
		function() {
			$("#ano_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#ano").after("<span id='ano_msg' style='color: red'>求职单号不能为空</span>");
			}
	});

$("#jobsid").blur(
		function() {
			$("#jobsid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#jobsid").after("<span id='jobsid_msg' style='color: red'>招聘信息不能为空</span>");
			}
	});

$("#filurl").blur(
		function() {
			$("#filurl_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#filurl").after("<span id='filurl_msg' style='color: red'>简历文件不能为空</span>");
			}
	});







$('#sub').click(function(){
var ano = $("#ano").val();
var jobsid = $("#jobsid").val();
var filurl = $("#filurl").val();
$("#ano_msg").empty();
$("#jobsid_msg").empty();
$("#filurl_msg").empty();
if (ano == "" || ano == null) {
	$("#ano").after("<span id='ano_msg' style='color: red'>求职单号不能为空</span>");
	return false;
}
if (jobsid == "" || jobsid == null) {
	$("#jobsid").after("<span id='jobsid_msg' style='color: red'>招聘信息不能为空</span>");
	return false;
}
if (filurl == "" || filurl == null) {
	$("#filurl").after("<span id='filurl_msg' style='color: red'>简历文件不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#ano_msg").empty();
$("#jobsid_msg").empty();
$("#filurl_msg").empty();
});

});
