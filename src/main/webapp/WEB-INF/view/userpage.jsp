<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
<meta
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0"
	name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=no" name="format-detection" />
<link href="${pageContext.request.contextPath}/static/bootstrap/css/style.css" rel="stylesheet"
	type="text/css" />
<!-- 引入bootstrap 样式文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<!-- 引入我们自己的首页样式文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
<!-- 先引入jquery js文件 -->
<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<section class="jq22-flexView"> <section
		class="jq22-scrollView">
	<div class="jq22-head-read">
		<div class="jq22-flex">
			<div class="jq22-read-img">
					<li><img src= "${sessionScope.loginUser.userimage }" alt=""></li>
			</div>
			<div class="jq22-flex-box">
				<h2>${sessionScope.loginUser.username}</h2>
			</div>
			<div class="jq22-arrow jq22-arrow-one">
				<span >个人中心</span>
			</div>
		</div>
	</div>
	<div class="jq22-white-box">
		<div class="jq22-palace jq22-palace-one">
			<a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text">
					<h2>
						<font color="#000000" size="4">普通用户</font>
					</h2>
				</div>
			</a> <a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text"  data-toggle="modal" data-target=".login">
					<h2>
						<font color="#000000" size="4">修改个人信息</font>
					</h2>
				</div>
			</a> <a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text">
					<h2>
						<font color="#000000" size="4">发帖详情</font>
					</h2>
				</div>
			</a>
		</div>
	</div>
	<div class="jq22-white-box jq22-white-box-clear" style="background:white" >
		<div class="jq22-flex b-line">
			<div class="jq22-flex-box"  style="padding-left:200px">
				<font color="#000000" size="4">以下是发帖记录</font>
			</div>
			<div class="jq22-arrow">
				<span>查看全部</span>
			</div>
			
		</div>
		<div class="jq22-flex b-line">
		<article class="col-md-7" style="padding-left:100px;width: 850px">
		<div class="publish" style="padding-left:100px;width: 850px">
		 </div>
		<!-- 分页条信息 -->
		<div class="col-md-6" id="page_nav_area" style="padding-left:100px"></div>
		</article>
		</div>
	</div>

	<!-- 模态框 -->
	<div class="modal fade login" tabindex="-1" role="dialog">
		 <div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">个人信息</h4>
				</div>
				<form action="updateUser" method="post" enctype="multipart/form-data" >
					<div class="modal-body">
						<label for="exampleInputEmail1">用户id</label> 
						<input type="text" class="form-control subcontent" 
						disabled="disabled"	 name="userID" value="${sessionScope.loginUser.userid}" /> 
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">用户名</label> 
						<input type="text" class="form-control subcontent"  name="userName"
						value="${sessionScope.loginUser.username}" /> 
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">密码</label> 
						<input type="password" class="form-control subcontent"  name="userPassword"
						value="${sessionScope.loginUser.userpassword}" /> 
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">头像</label> 
						<input type="file" class="form-control subcontent"  name="upFile" /> 
					</div>
					
					<div class="modal-footer">
						<input class="btn btn-default" data-dismiss="modal" type="button"
							value="关闭" /> <input type="submit" class="btn btn-primary"
							value="修改" />
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	
	<!-- /.modal --> 
	
	</section>
	<footer class="jq22-footer jq22-footer-fixed">
		<a href="userlist" class="jq22-tabBar-item ">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-loan"></i>
                </span>
			<span class="jq22-tabBar-item-text">首页</span>
		</a>
		<a href="javascript:;" class="jq22-tabBar-item jq22-tabBar-item-active">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-mine"></i>
                </span>
			<span class="jq22-tabBar-item-text">我的</span>
		</a>
		<a href="#" class="jq22-tabBar-item " id="logout">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-credit"></i>
                </span>
			<span class="jq22-tabBar-item-text" >退出</span>
		</a>
		
	</footer>
</section>
  <script>
  $(function(){
  	to_page(1);
  });
  function to_page(pn) {
      $.ajax({
          url:"/ssm/myMessage",
          data:{"pn":pn},
          type:"GET",
          success:function (result) {
              console.log(result);
            if(result.objectMap.mylist.list.length>0){
         	 //1、解析并显示商品信息
         	   build_messlist_table(result);
                //2、解析显示分页条
                build_page_nav(result);
            }
            else{
         	   
         	   alert("暂无发帖记录!");
            }
             
          }
      });
};
//构建message信息
function build_messlist_table(result) {
 //清空table表
 $(".messrow").remove();
 var prods =  result.objectMap.mylist.list;
 $.each(prods,function (index, message) {
     var div1 = $("<div></div>").addClass("row messrow");
     var div2 = $("<div ></div>").addClass("col-sm-9");
     var ha =$("<font size='4'></font>");
     var delBtn = $( "<button type='button' class='btn btn-danger btn-xs'></button>");
     delBtn.append("删除");
     delBtn.attr("data-id",message.messageid);
     var aa = $("<a></a>").append("  "+message.messagecontent+"   ").attr("href","revert?messageid="+message.messageid);
     ha.append(aa);
     var p1=$("<span></span>").append(ha);
     var p2 = $("<p></p>").addClass("hidden-xs").append("回复数:"+message.count+"  ");
     var p3 = $("<p></p>").append(p1).append(delBtn);
     var sp = $("<span></span>").addClass("hidden-xs").append("  时间:"+message.writedate+" ");
     p2.append(sp);
     div2.append(p3).append(p2);
     div1.append(div2).appendTo(".publish");
     
     delBtn.click(function(){
     	deleteMessage(message.messageid);
     })
 });
};
//解析构建分页条信息，点击进行跳转下一页
function build_page_nav(result) {
 //page_nav_area
 $("#page_nav_area").empty();
 var ul = $("<ul></ul>").addClass("pagination");

 //构建元素
 var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
 var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
 if (result.objectMap.mylist.hasPreviousPage == false) {
     firstPageLi.addClass("disabled");
     prePageLi.addClass("disabled");
 }else {
     //为元素添加翻页事件
     firstPageLi.click(function () {
         to_page(1);
     });
     prePageLi.click(function () {
         to_page(result.objectMap.mylist.pageNum -1);
     });
 }

 var nextPageLi = $("<li></li>").append($("<a style=></a>").append("&raquo;"));
 var lastPageLi = $("<li></li>").append($("<a ></a>").append("末页").attr("href","#"));
 if (result.objectMap.mylist.hasNextPage == false) {
     nextPageLi.addClass("disabled");
     lastPageLi.addClass("disabled");
 }else {
     nextPageLi.click(function () {
         to_page(result.objectMap.mylist.pageNum +1);
     });
     lastPageLi.click(function () {
         to_page(result.objectMap.mylist.pages);
     });
 }

 //页码1，2，3，4
 ul.append(firstPageLi).append(prePageLi);
 $.each(result.objectMap.mylist.navigatepageNums,function (index, item) {
     var numLi = $("<li></li>").append($("<a></a>").append(item));
     if (result.objectMap.mylist.pageNum == item) {
         numLi.addClass("active");
     }
     numLi.click(function () {
         to_page(item);
     });
     ul.append(numLi);
 });

 ul.append(nextPageLi).append(lastPageLi);

 //把ul加入到nav
 var navEle = $("<nav></nav>").append(ul);
 navEle.appendTo("#page_nav_area");
};
  
  $("#logout").click(function(){
	  if(confirm("确认退出吗？")){
   	   $.ajax({
			  url: "/ssm/logout",
              method: "post",
			 success:function(response){
				 if(response.errorCode=="100"){
					 window.location="/ssm/user/loginPage";
				 }else{
				    window.location="/ssm/user/loginPage";
				 }
					 	 
			 },
			 error:function(){
				 console.log("请求发送失败...");
			 }
		 });
	  }
  });
  function deleteMessage(id){
	  if(confirm("确认删除吗？")){
	   	   $.ajax({
				  url: "/ssm/deleteMessage",
	              method: "post",
	              data:{
	    				 "messageid":id
	    			  },
				  success:function(response){
					 if(response.errorCode=="100"){
						 window.location="/ssm/userpage";
					 }else{
					    window.location="/ssm/userpage";
					 }
						 	 
				 },
				 error:function(){
					 console.log("请求发送失败...");
				 }
			 });
		  }
	  
  };

  
  </script>
</body>

</html>