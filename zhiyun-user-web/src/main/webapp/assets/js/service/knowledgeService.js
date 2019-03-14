//服务层
app.service('knowledgeService',function($http){
	
	//获取首页热点知识点
	this.findHotKl = function(){
		return $http.get('../kl/findHotKl.do');
	};
	
	//获取首页轮播图
	this.findSlide=function(){
		return $http.get('../kl/homeSlide.do');
	};
	
	//根据id获取知识点
	this.findKlById = function(klId){
		return $http.get('../kl/findKlById.do?klId='+klId);
	};
});