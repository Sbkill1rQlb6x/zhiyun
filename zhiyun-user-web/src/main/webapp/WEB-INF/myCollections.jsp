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
                <li><a href="myCollections.do">我的收藏</a></li>
            </ul>
            <div class="am-tabs-bd">
                <div class="am-g">
                    <ul class="am-list am-list-striped" style="margin-left: 30px;">
                        <c:forEach  items="${collections.list}" var="c">
                            <li>
                                <img class="am-radius" style="margin: 10px;margin-top: 15px;" alt="140*140"
                                     src="${c.knowledge.user_face}"
                                     width="40" height="40"/>
                                <div style="display: inline-table;width: 562px;">
                                    <a href="kl.do?kl_id=${c.knowledge.kl_id}" class="klList_a">${c.knowledge.kl_title}</a>
                                    <p style="font-size: 9pt;margin: 8px;">作者：${c.knowledge.kl_author}&nbsp;&nbsp;|&nbsp;&nbsp;时间：<fmt:formatDate value='${c.knowledge.kl_date}' pattern='yyyy-MM-dd HH:ss:mm'/></p>
                                </div>
                                <div class="am-btn-group right" style="margin-left: 261px;">
                                    <button class="am-btn am-btn-primary am-round" onclick="deleteColl('deleteCollection.do?kl_id=${c.knowledge.kl_id}')">删除</button>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <div class="am-g am-g-fixed">
                <ul class="am-pagination am-pagination-right">

                    <li>
                        <c:if test="${collections.hasPreviousPage}">
                            <a href="myCollections.do?pn=${collections.pageNum-1}">&laquo;</a>
                        </c:if>
                    </li>

                    <c:forEach items="${collections.navigatepageNums}" var="page_num">
                        <c:if test="${page_num == collections.pageNum}">
                            <li class="am-active"><a href="#">${page_num}</a></li>
                        </c:if>
                        <c:if test="${page_num != collections.pageNum}">
                            <li><a href="myCollections.do?pn=${page_num}">${page_num}</a></li>
                        </c:if>

                    </c:forEach>

                    <li>
                        <c:if test="${collections.hasNextPage}">
                            <a href="myCollections.do?pn=${collections.pageNum+1}">&raquo;</a>
                        </c:if>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<script>
    <%--确定之后改变url--%>
    function deleteColl(s) {
        if (confirm("您确定要删除吗？")) {
            location.href = s;
        }
    }
</script>


<%@include file="footer.jsp" %>

