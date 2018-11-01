<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="/bootstrap/js/bootstrap.min.js"></script>

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <base href="<%=basePath%>">

    <title>登录</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
<link rel="stylesheet" type="text/css" href="styles.css">
-->

</head>
<script type="text/javascript">
    function check_login() {
        var username = document.getElementById("username");
        var password = document.getElementById("password");
        var type = document.getElementById("type");
        if (username.value == "" || password.value == "" || type.value == "") {
            window.alert("登录ID、登录密码和登录身份都不能为空！");
            return false;
        }
        return true;
    }
    function onbulrname(){//blur表示失去焦点时触发
        //取用户名
        var uid = document.getElementById("username").value;

        //调ajax
        $.ajax({

            url:"selectusername.html",
            data:{"u":uid},
            type:"POST",
            dataType:"JSON",
            success: function(data){
                if(data)
                {
                    $("#ts").html("欢迎您"+uid+",请输入密码！");
                    $("#ts").css("color","green");
                }
                else
                {
                    $("#ts").html("该应户名不存在");
                    $("#ts").css("color","red");
                }
            }

        });

    }



</script>

<style type="text/css">
    body
    {
        background: url("/images/02.jpg");
        background-size:cover;
    }
    .mycenter{
        margin-top: 100px;
        margin-left: auto;
        margin-right: auto;
        height: 350px;
        width:500px;
        padding: 5%;
        padding-left: 5%;
        padding-right: 5%;
    }
    .mycenter mysign{
        width: 440px;
    }
    .mycenter input,checkbox,button {
        margin-top: 2%;
        margin-left: 10%;
        margin-right: 10%;
    }
    .huan{
        width: 278px;
        margin-top:2%;
        margin-left: 14%;
        margin-right: 13%;
        -webkit-box-flex: 0;
        -ms-flex: 0 0 100%;
        flex: 0 0 100%;
        max-width: 100%;
    }
</style>
<body >

<form class="form-horizontal" role="form" action="login/check.html" method="post" >
    <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info" >
            <h2 style=" color: white">客户管理系统</h2>
            </div>
        <div class="col-sm-12 ">
            <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名" onblur="onbulrname()" ><em id="ts"></em>
        </div>
    </div>
        <div class="col-sm-12">
            <input type="password"  class="form-control" name="userpw" id="password" placeholder="请输入密码">
        </div>
        <div class="huan" >
            <td >
                <select  id="type" name="usertype" class="form-control" >
                    <option value="3">
                        --请选择--
                    </option>
                    <option value="0">
                        管理员
                    </option>
                    <option value="1">
                        客户
                    </option>
                </select>
            </td>
        </div>
            <div class="col-sm-12">
                <input class="btn btn-success col-lg-12" type="submit" id="submit" name="submit" value="登录"
                       onclick="return check_login();" />
            </div>
            <div class="col-sm-12">
            <input class="btn btn-success col-lg-12" type="submit" id="submit2" name="submit" value="注册"
                   href="register.html" />
            </div>

    </div>
</form>
<c:if test="${iserror!=null}">

       <script>
           alert("登录失败");
       </script>

</c:if>


</body>
</html>
