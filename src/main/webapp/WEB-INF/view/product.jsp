<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
        <div class="row">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                              <span class="sr-only">Toggle navigation</span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                            </button>
                         <a class="navbar-brand" href="userlist">SSM 商品城</a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="">数码 <span class="sr-only">(current)</span></a></li>
                            <li><a href="">美妆</a></li>
                            <li><a href="">食品</a></li>
                            <li><a href="">服饰</a></li>
                            <li><a href="">书籍</a></li>
                        </ul>
                        <form class="navbar-form navbar-left" action="searchProduct" >
                            <div class="form-group">
                                <input type="text" style="width:350px" name="searchContent" class="form-control" placeholder="搜索"/>
                            </div>
                            <button style="width:60px" type="submit" class="btn btn-default btn-search">搜索</button>
                        </form>
                        <ul style="background-color:#F8F8F8" class="nav navbar-nav navbar-right">
							<c:if test="${sessionScope.loginUser.userimage == null}">
                            <li ><img class="img-circle" src="${pageContext.request.contextPath}/static/image/logo.png" style="width:60px;height:60px"></li>
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
                        <img src="${pageContext.request.contextPath}/static/image/logo.png" alt="" class="hidden-xs">
                        <span class="visible-xs">SSM商品城</span>
                    </a>
                </div>
                 <div class="nav">
                    <ul>
                      <li><a href="" class="glyphicon glyphicon-camera">数码</a></li>
                        <li><a href="" class="glyphicon glyphicon-heart-empty">美妆</a></li>
                        <li><a href="" class="glyphicon glyphicon-cutlery">食品</a></li>
                        <li><a href="" class="glyphicon glyphicon-gift">服饰</a></li>
                        <li><a href="" class="glyphicon glyphicon-blackboard">书籍</a></li>
                    </ul>
                </div>
            </header>
            <article class="col-md-7">
            <!-- 模态框 -->
            <div class="modal fade login" tabindex="-1" role="dialog">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title">写评论</h4>
				      </div>
                       <form action="addMessage" method="post">
	                       <div class="modal-body">
									<label for="exampleInputEmail1">评论内容</label> 
									<input type="textarea" class="form-control subcontent" rows="5" cols="20"
												name="messageContent" />
									<input type="hidden" name="proID" class="proID" value="${product.productid }"/>
					       </div>
					      <div class="modal-footer">
								<input class="btn btn-default" data-dismiss="modal" type="button" value="关闭"/>
	                            
	                            <input type="submit" class="btn btn-primary" value="提交"/>
							</div>
                       </form>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
                <!-- 商品 -->
                <!-- 发表 -->
                
                <div class="publish" style="width:850px">
                       <div class="row" style="width:850px">
                         <div class="col-sm-9">
                            <h3 ><a href="product?productid=${product.productid }" style="color:blue">${product.productname }</a></h3>
                            <p class="text-muted hidden-xs">品牌：${product.productbrand } </p>
                            <p class="hidden-xs">${product.productdes }</p>
                            <p class="text-muted">价格：${product.productprice }元 <span class="hidden-xs">标签：${product.productmodel } </span>
                            </p>
                         </div>
                         <div class="col-sm-3 pic hidden-xs">
                            <img src="${product.productimage }" style="height:170px;width:180px" alt="">
                         </div>
                     </div>
                      <div class="row" style="width:850px">
                                                      评论数(${mcount })&nbsp;&nbsp;&nbsp;&nbsp;
                      <button type="button" class="btn btn-primary searchAll">查看评论</button>
                      <button data-toggle="modal" data-target=".login" class ="btn btn-info glyphicon glyphicon-pencil">问大家</button>  
                     </div> 
                </div>     
                <div class="col-md-6" id="page_nav_area" style="padding-left:40px">
					
				</div>             
            </article>
        </div>
    </div>
</body>
<script>
//点击查看全部按钮时，发送ajax请求获取数据。
 $(".searchAll").click(function(){
    	to_page(1);
 });
 function to_page(pn) {
         $.ajax({
             url:"/ssm/messagelist",
             data:{"pn":pn,"proID":$(".proID").val()},
             type:"GET",
             success:function (result) {
                 console.log(result);
               if(result.objectMap.mlist.list.length>0){
            	 //1、解析并显示商品信息
            	   build_messlist_table(result);
                   //2、解析显示分页条
                   build_page_nav(result);
               }
               else{
            	   
            	   alert("暂无评论!");
               }
                
             }
         });
};
function build_messlist_table(result) {
    $(".messrow").remove();
    var prods =  result.objectMap.mlist.list;
    $.each(prods,function (index, message) {
        var div1 = $("<div></div>").addClass("row messrow");
        var div2 = $("<div style='padding-left:50px'></div>").addClass("col-sm-9");
        var im =$("<img src='"+message.user.userimage+"'"+"style='height:40px;width:40px' class='img-circle' >");
        var ha =$("<font size='4'></font>");
        var aa = $("<a></a>").append("  "+message.messagecontent).attr("href","revert?messageid="+message.messageid);
        ha.append(aa);
        var p1=$("<span></span>").append(message.user.username+" ").append(ha);
        var p2 = $("<p></p>").addClass("hidden-xs").append("回复数:"+message.count+"  ");
        var p3 = $("<p></p>").append(im).append(p1);
        var sp = $("<span></span>").addClass("hidden-xs").append("  时间:"+message.writedate+" ");
        p2.append(sp);
        div2.append(p3).append(p2);
        div1.append(div2).appendTo(".publish");
    });
};
function build_page_nav(result) {
    //page_nav_area
    $("#page_nav_area").empty();
    var ul = $("<ul></ul>").addClass("pagination");

    var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
    if (result.objectMap.mlist.hasPreviousPage == false) {
        firstPageLi.addClass("disabled");
        prePageLi.addClass("disabled");
    }else {
        firstPageLi.click(function () {
            to_page(1);
        });
        prePageLi.click(function () {
            to_page(result.objectMap.mlist.pageNum -1);
        });
    }

    var nextPageLi = $("<li></li>").append($("<a style=></a>").append("&raquo;"));
    var lastPageLi = $("<li></li>").append($("<a ></a>").append("末页").attr("href","#"));
    if (result.objectMap.mlist.hasNextPage == false) {
        nextPageLi.addClass("disabled");
        lastPageLi.addClass("disabled");
    }else {
        nextPageLi.click(function () {
            to_page(result.objectMap.mlist.pageNum +1);
        });
        lastPageLi.click(function () {
            to_page(result.objectMap.mlist.pages);
        });
    }

    ul.append(firstPageLi).append(prePageLi);
    $.each(result.objectMap.mlist.navigatepageNums,function (index, item) {
        var numLi = $("<li></li>").append($("<a></a>").append(item));
        if (result.objectMap.mlist.pageNum == item) {
            numLi.addClass("active");
        }
        numLi.click(function () {
            to_page(item);
        });
        ul.append(numLi);
    });

    ul.append(nextPageLi).append(lastPageLi);

    var navEle = $("<nav></nav>").append(ul);
    navEle.appendTo("#page_nav_area");
};

</script>
</html>