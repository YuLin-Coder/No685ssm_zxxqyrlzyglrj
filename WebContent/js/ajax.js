$(function () {
    $('#deptid').change(
        function () {
            var deptid = $("#deptid").val();
            var loc = $("#basepath").val();
            var url = loc + "ajax/getUser.action?id=" + deptid;
            $.ajax({
                type: "get",
                url: url,
                dataType: "json",
                success: function (json) {
                    var usersid = json.usersid.replace("[", "").replace("]", "").split(",");
                    var usersname = json.usersname.replace("[", "").replace("]", "").split(",");
                    var myOptions = '<option value="">---请选择员工---</option>';
                    for (var i = 0; i < usersid.length; i++) {
                        myOptions += '<option value="' + usersid[i] + '">' + usersname[i] + '</option>';
                    }
                    $("#usersid").empty();
                    $("#usersid").html(myOptions);
                },
                error: function () {
                    alert("ajax请求发生错误3");
                }
            });
        });
});

