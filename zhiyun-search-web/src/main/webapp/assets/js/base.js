var app = angular.module("zhiyun",['ui.router']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider,knowledgeService){
	$urlRouterProvider.otherwise('/');
	$stateProvider
	.state('index', {
        url: '/',
        templateUrl: '/home.html' ,
        controller: 'indexController',
        resolve:{
        	indexSlider : function(knowledgeService){
//        		var data = null;
//        		knowledgeService.findSlide();
//        		if(data!=null)
//        			{
//        			console.log("buweikong");
//        			}
//        		return data;
        		
        		var promise = knowledgeService.findSlide();
                promise.then(function(success) {
                    return success.data;
                });
                return promise;
        	
        	}
        }
   })
   .state('detail', {
       url: '/detail',
       cache:false,
       templateUrl: 'klDetail.html' ,
       controller: 'klController',
       params:{"messageId":null}
  })
	
}]);
