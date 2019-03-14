app.controller('homeController',function($scope,homeService,$location,$window){
	
	$scope.info={'klId':0,'status':0};//构建修改知识点的map
	
	//点击跳转到知识点详情
	$scope.getKlDetail = function(klId) {
		location.href="http://localhost:9105/kl/detailView.do#?klId="+klId;
	}
	
	//获取用户信息
	$scope.getUserInfo = function() {
		homeService.getUserInfo().success(function(response) {
			   $scope.userInfo = response.userInfo;
			   $scope.getUserKls($scope.userInfo.userPhone);
			   

		});
	}
	
	//发送验证码
	$scope.sendSms = function() {
		var phone = {phone:$scope.phoneNum};
		homeService.sendSms(phone);
	}
	
	//根据phone获取用户的知识点
	$scope.getUserKls = function(phone) {
		homeService.getUserKls(phone).success(function(response) {
			$scope.userKls = response.userKls;
			
			
		});
	}
	
	//修改知识点状态
	$scope.updateKlStatus = function() {
		homeService.updateKlStatus($scope.info).success(function(response) {
			var res = response.res;
			if (res) {
				alert("修改成功！");
			}else {
				alert("修改失败！");
			}
		});
	}
	
	

	
	
	//修改按钮的状态
	$scope.updateButton = function(klId,isShare) {
		$scope.info.klId = klId;
		//判断是分享还是取消分享
		if (isShare==0) {
			$scope.info.status = 1;
			$scope.updateKlStatus();
			
		}
		if (isShare==1) {
			$scope.info.status = 0;
			$scope.updateKlStatus();
		}
		
		//刷新页面
		$window.location.reload();
		
	}
	
	
	//删除知识点
	$scope.deleteKl = function(klId) {
		if (confirm("您确定要删除吗?")){
			
			homeService.deleteKl(klId).success(function(response) {
				  var res = response.res;
				  if (res) {
					alert("删除成功！");
				}else{
					alert("删除失败!");
				}
				  $window.location.reload();
			});
        }
		
	}
	
});