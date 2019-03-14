var app = angular.module("zhiyun",[]);

//定义过滤器
app.filter('trustHtml',['$sce',function($sce){
	return function(data){
		//data 被过滤的内容
		
		return $sce.trustAsHtml(data);//返回的是过滤后的内容，进行信任的html的转换
	}
}]);