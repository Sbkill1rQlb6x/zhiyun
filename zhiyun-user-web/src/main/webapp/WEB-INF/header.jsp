<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Set render engine for 360 browser -->
<meta name="renderer" content="webkit">

<!-- No Baidu Siteapp-->
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="icon" type="image/png" href="/assets/i/favicon.png">

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="/assets/i/app-icon72x72@2x.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed"
	href="/assets/i/app-icon72x72@2x.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage"
	content="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="/assets/css/amazeui.css">
<link rel="stylesheet" href="/assets/css/amazeui.min.css">

<link rel="stylesheet" href="/assets/css/amazeui.datatables.min.css">
<link rel="stylesheet" href="/assets/css/app.css">
<link rel="stylesheet" href="/assets/css/public.css">
	<link rel="stylesheet" href="/assets/css/common.css">
	<link rel="stylesheet" href="/assets/themes/default/css/umeditor.css">
	
	<script src="/plugins/angularjs/angular.min.js"></script>
    <script src="/js/base.js"></script>
    <script src="/js/service/homeService.js"></script>
    <script src="/js/controller/homeController.js"></script>
<title>知云</title>
</head>
<body ng-app="zhiyun" ng-controller="homeController" ng-init="getUserInfo()">
	<header class="am-topbar am-topbar-fixed-top wos-header">
	<div class="am-container">
		<h1 class="am-topbar-brand">
			<a href="/index.do">知云</a>
		</h1>

		<button
			class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-warning am-show-sm-only"
			data-am-collapse="{target: '#collapse-head'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>

		<div class="am-collapse am-topbar-collapse" id="collapse-head">
			<ul class="am-nav am-nav-pills am-topbar-nav">
				<li><a href="/index.do">首页</a></li>
				<li><a href="klSort.do">知识点分类</a></li>
				<li><a href="http://localhost:9104/user/kls.do">知识点管理</a></li>
			</ul>


			
			<%--导航右侧--%>
			<div class="am-topbar-right">
                      
                        <div ng-if="userInfo==null">
                       	 	<a href="/user/login.do" style="line-height: 50px;">登录</a>
							<a href="registerView.do" style="line-height: 50px;margin-left: 10px;">注册</a>
                        </div>
						

						<div class="am-dropdown" data-am-dropdown style="line-height: 50px;" ng-if="userInfo!=null">
							<img class="am-circle"
								 src="{{userInfo.userFace}}"
								 width="33" height="33" id="face_img"/>

							<a class="am-btn am-btn-link am-dropdown-toggle" data-am-dropdown-toggle>{{userInfo.nickname}} <span
									class="am-icon-caret-down"></span></a>
							<ul class="am-dropdown-content">
								<li><a href="http://localhost:9104/user/userInfo.do?phone={{userInfo.userPhone}}">个人中心</a></li>
								<li><a href="/user/addKl.do">新建知识点</a></li>
								<li><a href="myCollections.do">我的收藏</a></li>
								<li><a href="checkPass.do">修改密码</a></li>
								<li><a href="http://localhost:9104/logout/cas">退出登录</a></li>

							</ul>
						</div>
				
			</div>
		</div>
	</div>


	</header>
	<!-- 侧边栏内容 -->







	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="/assets/js/jquery-3.2.1.min.js"></script>
	<!--<![endif]-->
	<!--[if lte IE 8 ]>
<!--<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>-->
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="/assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
	<script src="/assets/js/amazeui.min.js"></script>
	<script src="/assets/js/public.js"></script>
	<script type="/assets/js/amazeui.datatables.min.js"></script>
	<script  src="/assets/js/umeditor.config.js"></script>
	<script  src="/assets/js/umeditor.min.js"></script>
	<script type="text/javascript" src="/assets/lang/zh-cn/zh-cn.js"></script>


