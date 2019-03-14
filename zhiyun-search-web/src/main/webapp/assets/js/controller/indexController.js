//控制层
app.controller('indexController',function($scope,knowledgeService,$log,$state,indexSlider){
	$scope.slideList=indexSlider.sPath;
	$log.log("res="+$scope.slideList);
//	knowledgeService.findSlide().success(function(response){
//		$scope.slideList = response;
//	});
//	knowledgeService.findHotKl().success(function(response){
//		$scope.hotKlList = response;
//	});
	
	
//	//获取首页热点知识点
	//$scope.findHotKl = function(){
//		knowledgeService.findHotKl().success(function(response){
//			$scope.hotKlList = response;
//		});
		//首页轮播图
//		knowledgeService.findSlide().success(function(response){
//			$scope.slideList = response;
//		});
//	};
//	
//	//根据id查询知识点
//	$scope.findKlById = function(klId){
//		knowledgeService.findKlById(klId).success(function(response){
//			$scope.kl = response;
//			$log.log('value='+$scope.kl);
//		});
//	};
	$scope.toDetail = function() {
	$state.go('detail');
	}
});