<%@include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<div class="am-g">
    
        <div class="am-u-md-6 am-u-md-offset-3">
            <div class="am-input-group am-input-group-primary" style="margin-top: 20px;margin-bottom: 15px;">
      <span class="am-input-group-btn">
        <button  class="am-btn am-btn-primary" ng-click="searchMap.pageNo=1;search()" ><span class="am-icon-search"></span></button>
      </span>
                <input type="text" class="am-form-field" ng-model="searchMap.keywords">
            </div>
        </div>
    
</div>

<div class="am-g">
    <div class="am-u-md-12">
        <div class="filter">
            <div class="container">
                <div class="box">
                    <div class="title-h"><strong style="font-size: 15pt;">知识点分类</strong></div>
                    <dl>
                        <dt>知识点分类：</dt>
                        <dd>
                            <a ng-click="typeSearch()" rel="" name="mode" class="all on">全部</a>
                             <c:forEach items="${klTypes}" var="kp">
                                <a href="#" class="sx_child" ng-click="typeSearch(${kp.klCode})">${kp.klName}</a>
                            </c:forEach>
                        </dd>
                    </dl>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="am-g" style="width: 1200px;">
    <ul class="am-list am-list-striped">
       
            <li ng-repeat="item in resultMap.kws">
                <img class="am-radius" style="margin: 10px;margin-top: 15px;" alt="140*140"
                     src="{{item.userFace}}"
                     width="40" height="40"/>
                <div style="display: inline-table;">
                    <a href="#" class="klList_a" ng-click="getKlDetail(item.id)"  ng-bind-html="item.klTitle | trustHtml"></a>
                    <p style="font-size: 9pt;margin: 8px;">作者：{{item.klAuthor}}&nbsp;&nbsp;|&nbsp;&nbsp;时间：{{item.klDate}}</p>
                </div>
            </li>
    </ul>
</div>


<div class="am-g am-g-fixed" ng-if="resultMap!=null">
    <ul class="am-pagination am-pagination-right">
    
        <li class="{{isTopPage()?'am-disabled':''}}">
                <a href="#"  ng-click="queryByPage(searchMap.pageNo-1)">&laquo;</a>
        </li>
               <li  ng-if="firstDot==true"><span>...</span></li><!-- 开始三个点 -->
                <li ng-repeat="page in pageLabel">
                	<a href="#" ng-click="queryByPage(page)">{{page}}</a>
                </li>
               <li  ng-if="lastDot==true"><span>...</span></li><!-- 结尾的三个点 -->

        <li class="{{isEndPage()?'am-disabled':''}}"> 
                <a href="#" ng-click="queryByPage(searchMap.pageNo+1)">&raquo;</a>
        </li>
    </ul>
</div>

<%@include file="footer.jsp" %>