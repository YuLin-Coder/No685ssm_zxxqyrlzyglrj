

$(function () {
    $('#usersid').change(
        function () {
        	var usersid = $("#usersid").val();
        	var yearx = $("#yearx").val();
            var loc = $("#basepath").val();
            var url = loc + "ajax/getSalary.action?usersid=" + usersid+"&yearx="+yearx;
            $.ajax({
                type: "post",
                url: url,
                dataType: "json",
                success: function (json) {
                    var message = json.message;
                    if("错误"==message){
                    	alert("当月工资已结算");
                    }else{
                    	var rewardSalary = json.rewardSalary;
                        var attendSalary = json.attendSalary;
                        var duty = json.duty;
                        $("#basic").val(duty);
                        $("#attend").val(attendSalary);
                        $("#reward").val(rewardSalary);
                    }
                    
                },
                error: function () {
                    alert("ajax请求发生错误3");
                }
            });
        });
});