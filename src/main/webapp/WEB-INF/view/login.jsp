<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录注册页面</title>
<!-- 引入jquery -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/index.js"></script>
<!-- 引入样式 -->
<link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">

</head>

<body>
<div class="materialContainer">
        <div class="box">
		<div class="title">登录</div>
		<div class="input">
		<label for="name">用户ID</label>
		<input type="text" name="name" id="name">
		<span class="spin"></span>
		</div>
		<div class="input">
		<label for="pass">密码</label>
		<input type="password" name="pass" id="pass">
		<br>
		<span class="userlogin"></span>
		</div>
		<div class="button">
		<button id="btnlogin">
		<span >登录</span>
		<i class="fa fa-check"></i>
		</button>
		</div>		
		<a href="javascript:" class="pass-forgot"></a>
		</div>
		
		<div class="overbox">
		<div class="material-button alt-2">
		<span class="shape"></span>
		</div>
		<div class="title">注册</div>
		<div class="input" style="heigth:50px">
		<label for="regname">用户ID</label>
		<input type="text" name="regname" id="regname">
	    <span class="spin reid" >  </span>
	    <br/>
		</div>
		<div class="input">
		<span class="regid" ></span>
		<label for="regpass">用户名</label>
		<input type="text" name="regpass" id="regpass">
		<span class="spin rename"  ></span>
		</div>
		<div class="input">
		<label for="reregpass">密码</label>
		<input type="password" name="reregpass" id="reregpass">
		<span class="spin repas" ></span>
		</div>
		<div class="button">
		<button id="btnregister">
		<span>注册</span>
		</button>
		</div>
	</div>
</div>
<script>
setInterval(function() {
    var now = (new Date()).toLocaleString();
    $(".pass-forgot").text(now);
}, 1000);
	 //点击登录按钮时，发送ajax请求
	 $("#btnlogin").click(function(){

		 $.ajax({
			  url: "/ssm/user/login",
              method: "post",
			 data:{
				 "userid":$("#name").val(),
				 "userpassword": $("#pass").val()
			 },
			 success:function(response){
				 console.log(response);
				 if(response.errorCode=="100"){
					  alert("登录成功！");
					  //判断用户角色
					 if(response.objectMap.user.userrole =="0")
					    window.location="/ssm/userlist";
					 else
						 window.location="/ssm/admin"; 
				 }else{
					 $(".userlogin").text("账号或者密码有误,请重新登录！").css({"color": "red"});
				 }
					 	 
			 },
			 error:function(){
				 console.log("请求发送失败...");
			 }
		 });
	 });
	 //检测用户ID是否可用
	 $("#regname").blur(function(){
	     $.ajax({
	    	 url:"/ssm/user/checkuserID",
	    	 method: "post",
	    	 data:{"userid": $("#regname").val()},
	    	 success:function(response){
	    		 if(response.errorCode=="100")
	    		 ;
	    		 else
	    		 alert("该ID已存在，请重新输入！");
	    	 }
	     })
	 });
	 $("#regpass").blur(function(){
		 if($("#regname").val()=="")
			 alert("用户名不能为空！")
	 })
	 $("#reregpass").blur(function(){
		 if($("#reregpass").val()=="")
			 alert("密码不能为空");
	 })
	 //点击注册按钮时，发送ajax请求
	 $("#btnregister").click(function(){
		 $.ajax({
			 url: "/ssm/user/register",
             method: "post",
			 data:{
				 "userid": $("#regname").val(),
				 "userpassword": $("#reregpass").val(),
				 "username": $("#regpass").val()
			 },
			 success:function(response){
				 if(response.errorCode=="100"){
					 alert("注册成功！");
					 window.location="/ssm/user/loginPage";
				 }else{
					 alert("注册失败！");
				 }
					 
				 
			 },
			 error:function(){
				 console.log("请求发送失败...");
			 }
		 });
	 })
</script>
</html>