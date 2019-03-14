<%@include file="/WEB-INF/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="am-g am-g-fixed login">
    <div class="am-u-md-8 am-u-md-offset-2">
        <%--<form action="${pageContext.request.contextPath}/loginRequest.do"--%>
              <%--class="am-form" id="doc-vld-msg">--%>

                <legend>个人资料</legend>
                <p><img class="am-circle am-center" src="${user.userFace}" width="130" height="130" id="cropedBigImg"/>
                </p>

                <form action="userUploadedFace.do" method="post" enctype="multipart/form-data"  class="am-form">
                <div class="am-form-group am-form-file">
                    <button type="button" class="am-btn am-btn-default am-btn-sm am-center">
                        <i class="am-icon-cloud-upload"></i> 选择头像</button>
                    <input type="file" multiple name="userFace" id="chooseImage">
                </div>
                    <!-- <div class="am-g am-g-fixed login-center" style="margin-top: 17px;">
                        <button class="am-btn am-btn-secondary am-round" type="submit"
                                data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 225}">上传头像
                        </button>
                    </div> -->
                    <%-- <c:if test="${not empty faceErr}">
                        <div class="am-alert am-alert-danger" data-am-alert>
                            <button type="button" class="am-close">&times;</button>
                                ${faceErr}
                        </div>
                    </c:if> --%>

             <fieldset>
                <div class="am-form-group">

                    <label class="icon-bottom">
                        <p>
                            昵称
                        </p>
                    </label> <input type="text" value="${user.nickname}" name="nickName"/>

                </div>
    <div class="am-g am-g-fixed login-center">
        <button class="am-btn am-btn-secondary am-round" type="submit"
                data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 225}">保存
        </button>
    </div>

    </fieldset>
    </form>

        <script>

            //本地回显
            $('#chooseImage').on('change',function(){
                var filePath = $(this).val(),         //获取到input的value，里面是文件的路径
                    fileFormat = filePath.substring(filePath.lastIndexOf(".")).toLowerCase(),
                    src = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式

                // 检查是否是图片
                if( !fileFormat.match(/.png|.jpg|.jpeg/) ) {
                    error_prompt_alert('上传错误,文件格式必须为：png/jpg/jpeg');
                    return;
                }

                $('#cropedBigImg').attr('src',src);
            });
        </script>
</div>
</div>
<%--<div class="am-g am-g-fixed login">--%>
<%--<div class="am-u-md-8 am-u-md-offset-2">--%>
<%--<form class="am-form" id="doc-vld-msg">--%>
<%--<fieldset>--%>
<%--<legend>个人资料</legend>--%>
<%--<p><img class="am-circle" alt="140*140"--%>
<%--src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80"--%>
<%--width="120" height="120"/>--%>
<%--</p>--%>


<%--<div class="am-form-group am-form-file">--%>
<%--<button type="button" class="am-btn am-btn-default am-btn-sm" style="margin: 0 auto;">--%>
<%--<i class="am-icon-cloud-upload"></i> 选择要上传的文件--%>
<%--</button>--%>
<%--<input type="file" multiple>--%>
<%--</div>--%>

<%--<div class="am-input-group">--%>

<%--<label for="doc-ipt-email-1"><p>昵称</p></label>--%>
<%--<input type="text" class="am-form-field am-radius" placeholder="张三">--%>
<%--</div>--%>
<%--<p>邮箱</p>--%>
<%--<div class="am-input-group">--%>
<%--<input type="text" class="am-form-field" placeholder="Email">--%>
<%--</div>--%>

<%--<p>手机号</p>--%>
<%--<div class="am-input-group">--%>
<%--<input type="text" class="am-form-field" placeholder="Telephone">--%>
<%--</div>--%>
<%--<div class="am-form-group">--%>
<%--<label for="doc-ipt-email-1">邮件</label>--%>
<%--<input type="email" class="" id="doc-ipt-email-1" placeholder="输入电子邮件">--%>
<%--</div>--%>

<%--<button type="submit" class="am-btn am-btn-secondary am-radius">保存</button>--%>
<%--</fieldset>--%>
<%--</form>--%>

<%--</div>--%>
<%--</div>--%>
<%@include file="/WEB-INF/footer.jsp" %>