var isLogin = false;//登录状态
var shopsType = false;//商店选择状态
var allType = false;//商品类型选择状态
var allData = [];//展示的所有商品数据


$(function() {
	var user = getLoginUser();
	
	if(user.loginName&&user.loginName!="null"){
		isLogin = true;
		$("#userName").text(user.loginName);
	}
	
	if(isLogin){
		$("#noLogin").hide();
		$("#logined").show();
	}else{
		$("#noLogin").show();
		$("#logined").hide();
	}
	
	getAllShops();
});

//获取所有店铺名，id,并组装店铺选择框
function getAllShops(){
	
	var options = {
			url : "json/shopNames.json",
			data : {},
			success : function(data){
				if(data){
					var html = "";
					for(var i in data){
						var liData = data[i];
						html += "<li onclick=\"getShop("+liData.id+",'"+liData.name+"')\">"+liData.name+"</li>";
					}
					$("#shops").html(html);
					getShop(data[0].id,data[0].name);
				}
			}
	};
	
	ajax(options);
}

//获取商铺店名,并查询该店所有展示数据
function getShop(id,name) {
	getAllData(id);
	$("#shopName").text(name);
	showShopsChoose();
}



//根据店铺id获取商店所有货物，货物类型
function getAllData(id){
	var data = {
			id:id
	}
	
	var options = {
			url:"json/allData.json",
			data:data,
			success:function(data){
				if(data){
					allData =  data.mainData;
					var welecomeImgs = data.welecomeImgs;
					var html = "";
					for(var i in allData){
						html+="<li><a href=\"#turn"+allData[i].id+"\">"+allData[i].name+"</a></li>"
					}
					$("#shopTypes").html(html);
					showWelecomImgs(welecomeImgs);
					showAllData();
				}
			}
	}
	
	ajax(options);
}

//轮播图
function showWelecomImgs(imgs){//imgs固定长度为3

	var html = "";
	for(var i=1;i<=imgs.length;i++){
		html+="<div id=\"slide"+i+"\" class=\"slide slide"+i+"\">"+
				"<img id=\"slideImg"+i+"\" class=\"slideImg slideImg"+i+"\" src=\""+imgs[i-1]+"\">"+
			  "</div>"
	}
	$("#slideshow").html(html);

	setTimeout("slide(1)", 4000);
}

//组装商品详细页面展示
function showAllData(){
	var html = "";
	for(var i in allData){
		var data = allData[i];
		html+="<div class=\"mainCard\">"+
			  "<div id=\"turn"+data.id+"\" class=\"mainCardTitle\">"+
			  "<img class=\"mainCardTitleImg\" alt=\"\" src=\"module/img/main/lu.png\">"+
			  "<div class=\"mainCardTitleDiv\">"+data.name+"</div>"+
			  "</div>"+
			  "<div class=\"mainCardContent\">" +
			  "<div class=\"row\">";
		for(var i in data.children){
			var child = data.children[i];
			html+="<div class=\"col-sm-6 col-md-4\">"+
				  "<div class=\"thumbnail\">"+
				  "<img src=\""+child.img+"\" alt=\"...\">"+
				  "<div class=\"caption\">"+
				  "<h3>"+child.describe+"</h3>"+
				  "<p>"+child.amount+"</p>"+
				  "</div></div></div>";
			
		}

		html+="</div></div></div>";
	}
	$("#mainData").html(html);
}

//展示所有类型选择框
function showAllTypeChoose(){
	if(allType){
		$("#shopTypes").hide();
	}else{
		$("#shopTypes").show();
	}
	allType=!allType;
}

//展示店铺选择框
function showShopsChoose(){
	if(shopsType){
		$("#shops").hide();
	}else{
		$("#shops").show();
	}
	shopsType=!shopsType;
}

//获得登录人员信息
function getLoginUser(){
	
	var user = getCookie(1);
	
	return user;
}

//返回登录页面
function backLogin(){
	clearCookie(1);
	window.location.href = "login.jsp";
}

function slide(i){
	if(i==1){
		$("#slide1").addClass("slide2");
		$("#slide1").removeClass("slide1");
		$("#slideImg1").addClass("slideImg2");
		$("#slideImg1").removeClass("slideImg1");
		$("#slideImg2").addClass("slideImg3");
		$("#slideImg2").removeClass("slideImg2");
		$("#slide2").addClass("slide1");
		$("#slide2").removeClass("slide2");
		$("#slideImg3").addClass("slideImg1");
		$("#slideImg3").removeClass("slideImg3");
	}

	if(i==3){
		$("#slide3").addClass("slide2");
		$("#slide3").removeClass("slide1");
		$("#slideImg3").addClass("slideImg2");
		$("#slideImg3").removeClass("slideImg1");
		$("#slideImg1").addClass("slideImg3");
		$("#slideImg1").removeClass("slideImg2");
		$("#slide1").addClass("slide1");
		$("#slide1").removeClass("slide2");
		$("#slideImg2").addClass("slideImg1");
		$("#slideImg2").removeClass("slideImg3");
	}


	if(i==2){
		$("#slide2").addClass("slide2");
		$("#slide2").removeClass("slide1");
		$("#slideImg2").addClass("slideImg2");
		$("#slideImg2").removeClass("slideImg1");
		$("#slideImg3").addClass("slideImg3");
		$("#slideImg3").removeClass("slideImg2");
		$("#slide3").addClass("slide1");
		$("#slide3").removeClass("slide2");
		$("#slideImg1").addClass("slideImg1");
		$("#slideImg1").removeClass("slideImg3");
	}
	
	i--;
	if(i<1){
		i=3;
	}
	
	setTimeout("slide("+i+")", 4000);
}