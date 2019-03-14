<%--
  Created by IntelliJ IDEA.
  User: guoshuai
  Date: 2018/7/16
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div class="am-g am-g-fixed login">
    <div class="am-u-md-8 am-u-md-offset-2">
        <form action="updateKnowledge.do"
              class="am-form" id="doc-vld-msg" method="post">
            <fieldset>
                <legend>修改知识点</legend>
                <div class="am-form-group">
                    <label class="icon-bottom">
                        <p>
                            知识点标题
                        </p>
                    </label> <input type="text"  value="${klById.kl_title}"  name="klTitle" />
                    <input type="text" value="${klById.kl_id}" name="klId" style="display: none;"/>

                </div>

                <div class="am-form-group">
                    <label class="icon-bottom">
                        <p>
                        知识点内容
                    </p>
                    </label>
                    <script id="editor" type="text/plain" ></script>
                    <script>
                        var um = UM.getEditor("editor",{
                            initialFrameWidth : '100%',//宽度
                            initialFrameHeight: 400//高度
                        });

                        um.ready(function () {
                            um.setContent('${klById.kl_content}');
                        })
                    </script>
                </div>

                <div class="am-form-group">
                    <label class="icon-bottom">
                        <p>
                            所处分类
                        </p>
                    </label>
                    <select id="doc-select-1" required name="klType">
                        <option>-=请选择一项=-</option>
                        <c:forEach items="${allTypes}" var="t">
                            <option value="${t.kl_code}">${t.kl_name}</option>
                        </c:forEach>
                    </select>
                    <span class="am-form-caret"></span>

                </div>

                <div class="am-g am-g-fixed login-center">
                    <button class="am-btn am-btn-secondary am-round" type="submit"
                            data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 225}">提交</button>
                </div>
            </fieldset>
        </form>

    </div>
</div>

<script>
    if (${addRes}){
        alert("添加成功！")
    }
</script>

<%@include file="footer.jsp"%>