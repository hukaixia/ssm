<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
 <!-- 引入bootstrap 样式文件 -->
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <!-- 引入我们自己的首页样式文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <!-- 先引入jquery js文件 -->
</head>
<body>
<input type="hidden" value="${search }" id="hsearch" />
  <div class="container">
        <div class="row">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                              <span class="sr-only"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                            </button>
                         <a class="navbar-brand" href="userlist">SSM 商品城</a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li ><a href="#">数码 <span class="sr-only">(current)</span></a></li>
                            <li ><a href="#">美妆</a></li>
                            <li ><a href="#">食品</a></li>
                            <li ><a href="#">服饰</a></li>
                            <li ><a href="#">书籍</a></li>
                        </ul>
                        <form class="navbar-form navbar-left" >
                            <div class="form-group">
                                <input type="text" style="width:350px" name="searchProduct" id="hideSearch" class="form-control" placeholder="搜索"/>
                            </div>
                            <button style="width:60px" type="button" class="btn btn-default btn-search">搜索</button>
                        </form>
                        <ul style="background-color:#f5f5f5" class="nav navbar-nav navbar-right" >
							<c:if test="${sessionScope.loginUser.userimage == null}">
                            <li ><img class="img-circle" src="/ssm/static/image/logo.png" style="width:60px;height:60px"></li>
                            </c:if>
							<c:if test="${sessionScope.loginUser.userimage != null }">
                            <li ><img class="img-circle" src="${sessionScope.loginUser.userimage }" style="width:60px;height:60px"></li>
                            </c:if>
							 
							 <li ><a href="userpage"  data-target=".login">${sessionScope.loginUser.username}</a></li>					
						</ul>
                        <!-- 模态框 -->
                       、
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>
        <div class="row">
            <header class="col-md-2">
                <div class="logo">
                    <a href="userlist">
                        <img src="static/image/logo.png" alt="" class="hidden-xs">
                        <span class="visible-xs">SSM商品城</span>
                    </a>
                </div>
                 <div class="nav">
                     <ul>
                            <li id="shuma"><a href="#" class="glyphicon glyphicon-camera">数码 <span class="sr-only">(current)</span></a></li>
                            <li id="meizhuang"><a href="#" class="glyphicon glyphicon-heart-empty">美妆</a></li>
                            <li id="shipin"><a href="#" class="glyphicon glyphicon-cutlery">食品</a></li>
                            <li id="fushi"><a href="#"  class="glyphicon glyphicon-gift">服饰</a></li>
                            <li id="shuji"><a href="#" class="glyphicon glyphicon-blackboard">书籍</a></li>
                    </ul>
                </div>
            </header>
            
            <article class="col-md-7">
                <!-- 商品 -->
                <div class="news clearfix" style="width:850px">
                    <ul>
                        <li>
                            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox">
                                    <div class="item active">
                                        <img src="/ssm/static/image/adidas运动夹克外套.JPG" alt="...">
                                        <div class="carousel-caption">
                                                                                            刘亦菲代言 夹克外套
                                        </div>
                                    </div>
                                    <div class="item">
                                        <img src="/ssm/static/image/nike 运动内衣.JPG" alt="...">
                                        <div class="carousel-caption">
                                           nike 运动内衣
                                        </div>
                                    </div>
                                    <div class="item">
                                        <img src="/ssm/static/image/nike Jordan 马卡龙.JPG" alt="...">
                                        <div class="carousel-caption">
                                         nike 马卡龙 Jordan
                                        </div>
                                    </div>
                                </div>

                                <!-- Controls -->
                                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                            <script>
                                $('.carousel').carousel({
                                    interval: 2000
                                })
                            </script>
                        </li>
                        <li>
                            <a href="#">
                                <img src="/ssm/static/image/兰蔻小黑瓶.png" alt=" ">
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <img src="/ssm/static/image/雅诗兰黛口红.JPG" alt="">
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <img src="/ssm/static/image/雅诗兰黛DW粉底液.JPG" alt="" >
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <img src="/ssm/static/image/兰蔻粉水.png" alt="">
                            </a>
                        </li>

                    </ul>
                </div>
                <!-- 商品信息-->
                <div class="publish" style="width:850px">

                </div>
            <!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area" style="width:850px">
				
			</div>
            </article>
        </div>
    </div>
    
<script>
//页面加载时发送ajax请求获取商品数据
$(function(){
	if($("#hsearch").val()!="" && $("#hsearch").val()!=null)
		$("#hideSearch").val($("#hsearch").val());
		to_page(1);
});

//点击搜索按钮
$(".btn-search").click(function(){
	to_page(1);
});

//左侧导航条
$("#shuma").click(function(){
	$("#hideSearch").val("数码");
	to_page(1);
});

$("#meizhuang").click(function(){
	$("#hideSearch").val("美妆");
	to_page(1);
});
$("#shipin").click(function(){
	$("#hideSearch").val("食品");
	to_page(1);
});
$("#shuji").click(function(){
	$("#hideSearch").val("书籍");
	to_page(1);
});
$("#fushi").click(function(){
	$("#hideSearch").val("服饰");
	to_page(1);
});
//获取第几页得商品信息
  function to_page(pn) {
	var searchContent = $("#hideSearch").val();
        $.ajax({
            url:"/ssm/prolist",
            data:{"pn":pn,"searchContent":searchContent},
            type:"GET",
            success:function (result) {
            	console.log(result);
               if(result.objectMap.uproduct.list.length>0){
                   build_pros_table(result);
                   build_page_nav(result);
               }
            }
        });
    };
    //构建商品信息
   function build_pros_table(result) {
        //清空table表
        $(".publish").empty();
        var prods =  result.objectMap.uproduct.list;
        $.each(prods,function (index, pros) {
            var div1 = $("<div></div>").addClass("row");
            var div2 = $("<div></div>").addClass("col-sm-9");
            var ha = $("<h3></h3").append($("<a style='color:blue'></a>").append(pros.productname).attr("href","product?productid="+pros.productid));
            var p1 = $("<p></p>").addClass("text-muted hidden-xs").append("品牌："+pros.productbrand);
            var p2 = $("<p></p>").addClass("hidden-xs").append(pros.productdes);
            var sp = $("<span></span").addClass("hidden-xs").append("标签："+pros.productmodel+" ");
            var p3 = $("<p></p>").addClass("text-muted").append("价格："+pros.productprice+"元 ");
            p3.append(sp);
            var div21 =$("<div></div").addClass("col-sm-3 pic hidden-xs");
            var im =$("<img src='"+pros.productimage+"'"+"style='height:170px;width:180px' >");
            div21.append(im);
            div2.append(ha).append(p1).append(p2).append(p3);
            div1.append(div2).append(div21).appendTo(".publish");
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
        if (result.objectMap.uproduct.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else {
            //为元素添加翻页事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.objectMap.uproduct.pageNum -1);
            });
        }

        var nextPageLi = $("<li></li>").append($("<a style=></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a ></a>").append("末页").attr("href","#"));
        if (result.objectMap.uproduct.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else {
            nextPageLi.click(function () {
                to_page(result.objectMap.uproduct.pageNum +1);
            });
            lastPageLi.click(function () {
                to_page(result.objectMap.uproduct.pages);
            });
        }

        ul.append(firstPageLi).append(prePageLi);
        $.each(result.objectMap.uproduct.navigatepageNums,function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.objectMap.uproduct.pageNum == item) {
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
</script>
</body>
</html>