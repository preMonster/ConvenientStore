function login() {
	var loginName = $("#loginName").val();
	var password = $("#password").val();
	var roleType = $("#roleType").val();
	
	var data = {
			loginName:loginName,
			password:password,
			roleType:roleType
	}

	var options = {
		url:"json/login.json",
		data:data,
		success:function(data){
			if(data==true){
				var cookies = {}
				
				cookies["loginName"+roleType] = loginName;
				cookies["password"+roleType] = password;
				
				setCookie(cookies);
				goMain(roleType);
			}else{
				alert(data);
			}
		}
	}
	
	if(loginName==""||password==""||roleType==""){
		alert("填写不完善");
	}else{
		ajax(options);
	}
	
}

function goMain(roleType){
	if(roleType==1){
		window.location.href = "index.jsp";
	}else{
		
	}
}

