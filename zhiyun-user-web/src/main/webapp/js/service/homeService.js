app.service('homeService',function($http){
	
	//获取用户信息
	this.getUserInfo = function() {
		
		return $http.get("../user/getUserInfo.do");
	}
	
	//发送验证码
	this.sendSms = function(phoneNum) {
		
		return $http.post("../user/sendSms.do",phoneNum);
	}
	
	//根据phone获取用户的知识点
	this.getUserKls = function(phone) {
		return $http.get("../user/getUserKls.do?phone="+phone);
	}
	
	//修改知识点的状态
	this.updateKlStatus = function(info) {
		return $http.post("../user/updateKlStatus.do",info);
	}
	
	
	//删除知识点
	this.deleteKl = function(klId) {
		return $http.get("../user/deleteKl.do?klId="+klId);
	}
	
});