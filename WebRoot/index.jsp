<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
	
<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>便利连锁店</title>
<!-- basic styles -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="assets/css/font-awesome-4.7.min.css" />
<link rel="stylesheet" href="assets/css/font-OpenSans.css" />
<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" type="text/css" href="module/css/fontello.css" />
<link rel="stylesheet" type="text/css" href="module/css/fontello-7275ca86/css/fontello.css" />
<link rel="stylesheet" type="text/css" href="module/css/index/index.css" />

<link href="module/css/bootstrap-treeview.css" rel="stylesheet">
<script src="assets/js/ace-extra.min.js"></script>
<body>
	<div class="contairw">
	
		<div class="main">
			<div class="mainHeader container-fluid row">
				<img class="imgHeader" src="module/img/main/welecomeTitle.png">
				<div class="textCenter titleMain col-md-4">
					<span class="titleMainSpan block"><span id="shopName"></span><span onclick="showShopsChoose()" class="caret"></span></span>
					<ul id="shops" class="dropdown-menu" aria-labelledby="dropdownMenu4">
					</ul>
					<span class="grayFontWlecom titleMainSpan block">welecome to the convenience store</span>
				</div>
				<div class="textCenter col-md-4 titleLogin">
					<div id="noLogin" onclick="backLogin()">
						<span class="glyphicon glyphicon-user"></span>登录
					</div>
					<div id="logined">
						欢迎光临<span id="userName">admin</span>， <span onclick="backLogin()" class="glyphicon glyphicon-share">退出</span>
					</div>
				</div>
			</div>
			
			<div class="navs  container-fluid row">
				<div class="nav col-md-1 textCenter">首页</div>
				<div class="nav col-md-1 textCenter" onclick="showAllTypeChoose()">全部分类
					<span class="caret allTypes"></span>
					<ul id="shopTypes" class="dropdown-menu" aria-labelledby="dropdownMenu4">
					</ul>
				</div>
				<div class="nav col-md-1 textCenter">我的购物车</div>
				<div class="nav col-md-1 textCenter">我的订单</div>
			</div>
			
			<div class="container">
				<div id="slideshow" class="slideshow">
				</div>
				
				<div id="mainData" class="mainData">
					<div class="mainCard">
						<div id="turn1" class="mainCardTitle">
							<img class="mainCardTitleImg" alt="" src="module/img/main/lu.png">
							<div class="mainCardTitleDiv">服饰</div>
						</div>
						<div class="mainCardContent">
							<div class="row">
							  <div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							      <img src="module/img/main/clothes1.jpg" alt="...">
							      <div class="caption">
							        <h3>Thumbnail label</h3>
							        <p>￥100</p>
							      </div>
							    </div>
							  </div>
							  <div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							      <img src="module/img/main/clothes2.jpg" alt="...">
							      <div class="caption">
							        <h3>Thumbnail label</h3>
							        <p>￥100</p>
							      </div>
							    </div>
							  </div>
							  <div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							      <img src="module/img/main/clothes3.jpg" alt="...">
							      <div class="caption">
							        <h3>Thumbnail label</h3>
							        <p>￥100</p>
							      </div>
							    </div>
							  </div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		
		
		<!-- /.main-container -->
		<!-- basic scripts -->
		<!--[if !IE]> -->
		<!-- <script
			src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script> -->
		<!-- 隐藏掉 -->
		<!-- <![endif]-->
		<!--[if IE]>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
		<![endif]-->
		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery
					|| document
							.write("<script src='assets/js/jquery-2.0.3.min.js'>"
									+ "<"+"script>");
		</script>
		<!-- <![endif]-->
		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
		</script>
		<![endif]-->
		<script type="text/javascript">
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="assets/js/jquery.slimscroll.min.js"></script>
		<script src="assets/js/jquery.easy-pie-chart.min.js"></script>
		<script src="assets/js/jquery.sparkline.min.js"></script>
     	<script src="module/js/jquery.cookie.js"></script>
		<script src="assets/js/flot/jquery.flot.min.js"></script><!--  -->
		<script src="assets/js/flot/jquery.flot.pie.min.js"></script>
		<script src="assets/js/flot/jquery.flot.resize.min.js"></script>
		<!-- ace scripts -->
		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>
		<script src="module/js/ajax.js"></script>
     	<script src="module/js/cookie.js"></script>      
		<script src="module/js/index/index.js"></script>
		
	</div>
	
	<script src="module/js/index/index.js"></script>
	<script src="module/js/bootstrap-treeview.js"></script>
	<!-- 	<script src="module/js/bootstrap-treeview.min.js"></script> -->
</body>
</html>
