var time = 7;

function setCookie(data){
	for(var key in data){
		$.cookie(key, data[key], { expires: time });
	}
}

function getCookie(roleType){//1代表商店平台，2代表后台系统
	var user = {};
	if(document.cookie.length > 0){
		
		user['loginName'] = $.cookie('loginName'+roleType);
		user['password'] = $.cookie('password'+roleType);
	}
	return user;
}

function clearCookie(roleType){//1代表商店平台，2代表后台系统
	
	if(document.cookie.length > 0){
		
		$.cookie('loginName'+roleType, null);
		$.cookie('password'+roleType, null);
	}
}