app.controller('searchController',function($scope,searchService,$location){
	
	//定义搜索对象结构 category点击的商品分类
	$scope.searchMap = {'keywords':'','pageNo':1,'pageSize':10,'type':0};

	
	
	//搜索
	$scope.search = function(){
		$scope.searchMap.pageNo = parseInt($scope.searchMap.pageNo);//转换成数字
		searchService.search($scope.searchMap).success(
		      function(response) {

				$scope.resultMap = response;
				console.log("totalPages:"+response.totalPages);
				console.log("resultMap.totalPages:"+$scope.resultMap.totalPages);
				
				//构建分页栏
				buildPageLabel();		
				//$scope.searchMap.pageNo=1;//将页面重置
			}		
		);
	};
	
	
	
	//构建分页栏
	buildPageLabel=function(){
		//构建分页栏
		$scope.pageLabel=[];
		var firstPage=1;//开始页码
		var lastPage=$scope.resultMap.totalPages;//截止页码
		$scope.firstDot=true;//前面有点
		$scope.lastDot=true;//后边有点
		
		if($scope.resultMap.totalPages>5){  //如果页码数量大于5
			
			if($scope.searchMap.pageNo<=3){//如果当前页码小于等于3 ，显示前5页
				lastPage=5;
				$scope.firstDot=false;//前面没点
			}else if( $scope.searchMap.pageNo>= $scope.resultMap.totalPages-2 ){//显示后5页
				firstPage=$scope.resultMap.totalPages-4;	
				$scope.lastDot=false;//后边没点
			}else{  //显示以当前页为中心的5页
				firstPage=$scope.searchMap.pageNo-2;
				lastPage=$scope.searchMap.pageNo+2;
			}			
		}else{
			$scope.firstDot=false;//前面无点
			$scope.lastDot=false;//后边无点
		}
		
		
		//构建页码
		for(var i=firstPage;i<=lastPage;i++){
			$scope.pageLabel.push(i);
		}
	}
	
	
	//分页查询
	$scope.queryByPage=function(pageNo){
		if(pageNo<1 || pageNo>$scope.resultMap.totalPages){
			return ;
		}		
		$scope.searchMap.pageNo=pageNo;
		$scope.search();//查询
	}
	
	
	//判断当前页是否为第一页  上下翻页用
	$scope.isTopPage = function() {
		if($scope.searchMap.pageNo==1)
			{
				return true;
			}else{
				return false;
			}
	}
	
	
	//判断当前页是否为最后一页  上下翻页用
	$scope.isEndPage=function(){
		if($scope.searchMap.pageNo==$scope.resultMap.totalPages){
			return true;
		}else{
			return false;
		}	
	}
	
	
	
	
	
	//加载关键字 接收关键字
	$scope.loadkeywords = function() {
		$scope.searchMap.keywords = $location.search()['keywords']
		$scope.search();//查询
	}
	
	//分类搜索
	$scope.typeSearch = function(type) {
		if (type==null||type=='') {
			$scope.searchMap.type=0;
			$scope.search();//查询
			return;
		}
		$scope.searchMap.type = type;
		$scope.search();//查询
	}
	
	//点击跳转到知识点详情
	$scope.getKlDetail = function(klId) {
		location.href="http://localhost:9105/kl/detailView.do#?klId="+klId;
	}
	
});