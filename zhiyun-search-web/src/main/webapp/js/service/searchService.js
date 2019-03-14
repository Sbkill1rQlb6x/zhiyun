app.service('searchService',function($http){
	
	this.search = function(searchMap){
		return $http.post('../kwSearch/search.do',searchMap);
	}
});