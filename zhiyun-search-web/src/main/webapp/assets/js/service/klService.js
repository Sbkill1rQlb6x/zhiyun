//知识点服务层
app.service('klService',function($http){
	this.findKlById = function(klId){
		return $http.get('../kl/findKlById.do?klId='+klId);
	}
});
