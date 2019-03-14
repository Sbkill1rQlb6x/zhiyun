<%@include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div class="am-g">

    <div class="am-g">
        <div class="am-u-md-6 am-u-md-offset-3">
            <div class="am-input-group am-input-group-primary" style="margin-top: 20px;margin-bottom: 15px;">
      <span class="am-input-group-btn">
        <a class="am-btn am-btn-primary" ><span class="am-icon-search"></span></a>
      </span>
                <input type="text" class="am-form-field">
            </div>
        </div>
    </div>


    <div class="am-u-md-8 am-u-md-offset-2" style="margin-top:37px;">
        <div class="am-tabs" data-am-tabs>
            <ul class="am-tabs-nav am-nav am-nav-tabs">
                <li><a href="klManagement.do">我的知识点</a></li>
            </ul>
            <div class="am-tabs-bd">
                <div class="am-g">
                    <ul class="am-list am-list-striped" style="margin-left: 30px;">
                            <li ng-repeat="kl in userKls">
                                <img class="am-radius" style="margin: 10px;margin-top: 15px;" alt="140*140"
                                     src="{{kl.userFace}}"
                                     width="40" height="40"/>
                                <div style="display: inline-table;width: 46%;">
                                    <a href="#" class="klList_a" ng-click="getKlDetail(kl.id)">{{kl.klTitle}}</a>
                                    <p style="font-size: 9pt;margin: 8px;">作者：{{kl.klAuthor}}&nbsp;&nbsp;|&nbsp;&nbsp;时间：{{kl.klDate}}</p>
                                </div>
                                <div class="am-btn-group right" style="margin-left: 261px;">
                                    <a href="#" class="am-btn am-btn-primary am-round" id="share" ng-click="updateButton(kl.id,kl.isshared)">{{kl.isshared==0?'分享':'取消分享'}}</a>
                                    <a  href="#" class="am-btn am-btn-primary am-round">修改</a>
                                    <button class="am-btn am-btn-primary am-round" ng-click="deleteKl(kl.id)">删除</button>
                                </div>
                            </li>
                    </ul>
                </div>
            </div>

            <%--<div class="am-g am-g-fixed">--%>
                <%--<ul class="am-pagination am-pagination-right">--%>
                    <%--<li>--%>
                        <%--<c:if test="${myKls.hasPreviousPage}">--%>
                            <%--<a href="klManagement.do?pn=${myKls.pageNum-1}">&laquo;</a>--%>
                        <%--</c:if>--%>
                    <%--</li>--%>

                    <%--<c:forEach items="${myKls.navigatepageNums}" var="page_num">--%>
                        <%--<c:if test="${page_num == myKls.pageNum}">--%>
                            <%--<li class="am-active"><a href="#">${page_num}</a></li>--%>
                        <%--</c:if>--%>
                        <%--<c:if test="${page_num != myKls.pageNum}">--%>
                            <%--<li><a href="klManagement.do?pn=${page_num}">${page_num}</a></li>--%>
                        <%--</c:if>--%>

                    <%--</c:forEach>--%>

                    <%--<li>--%>
                        <%--<c:if test="${myKls.hasNextPage}">--%>
                            <%--<a href="klManagement.do?pn=${myKls.pageNum+1}">&raquo;</a>--%>
                        <%--</c:if>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</div>--%>
        </div>
    </div>
</div>

<%@include file="footer.jsp" %>

