
<%@include file="/WEB-INF/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="am-g am-g-fixed login">
	<div class="am-u-md-8 am-u-md-offset-2">
		<form action="/user/registerReq.do" class="am-form" id="doc-vld-msg" method="post">
			<fieldset>
				<legend>注册</legend>

				<div class="am-form-group">
					<label for="doc-vld-email">邮箱：</label> <input type="email"
						id="doc-vld-email" data-validation-message="请输入正确的邮箱"
						placeholder="请输入邮箱" required  name="email"/>
				</div>



				<div class="am-form-group">
					<label for="doc-vld-email">手机号：</label>
                    <input type="text" class="js-pattern-mobile" name="userPhone" required data-validation-message="请输入正确的手机号" placeholder="请输入手机号" id="phone" ng-model="phoneNum">
                    <script>
                        if ($.AMUI && $.AMUI.validator) {
                            $.AMUI.validator.patterns.mobile = /^\s*1\d{10}\s*$/;
                        }
                    </script>
				</div>

				<div class="am-from-group">
					<label for="doc-vld-pw" class="icon-bottom">
						<p style="margin-right: 488px;">
							验证码：
						</p>
					</label>
					<input type="text"  placeholder="验证码" style="width: 16%; display: inline;margin-right: 10px;" name="sms"/>
					<input type="button"  value="获取验证码" class="am-btn am-btn-primary" id="verify_refresh" onclick="getMsgNum(this)"  ng-click="sendSms()" /><!-- onclick="getMsgNum(this)" -->
                    <c:if test="${not empty smsErr}">
                        <div class="am-alert am-alert-danger">
                            ${smsErr}
                        </div>
                    </c:if>
				</div>

				<div class="am-form-group">
					<label for="doc-vld-pw">请输入密码：</label> <input type="password"
						id="doc-vld-pw" placeholder="请输入密码" required
						data-validation-message="请输入密码！" name="userPass" />
				</div>

				<div class="am-form-group">
					<label for="doc-vld-pw-2">确认密码：</label> <input type="password"
						id="doc-vld-pw-2" placeholder="请与上面输入的值一致"
						data-equal-to="#doc-vld-pw" required
						data-validation-message="与上面的密码不一致！" />
				</div>

				<div class="am-g am-g-fixed login-center">
					<button class="am-btn am-btn-secondary am-round" type="submit">注册</button>
				</div>
			</fieldset>
		</form>
	</div>
</div>


<script type="text/javascript">
  	$(function() {
  	  $('#doc-vld-msg').validator({
  	    onValid: function(validity) {
  	      $(validity.field).closest('.am-form-group').find('.am-alert').hide();
  	    },

  	    onInValid: function(validity) {
  	      var $field = $(validity.field);
  	      var $group = $field.closest('.am-form-group');
  	      var $alert = $group.find('.am-alert');
  	      // 使用自定义的提示信息 或 插件内置的提示信息
  	      var msg = $field.data('validationMessage') || this.getValidationMessage(validity);

  	      if (!$alert.length) {
  	        $alert = $('<div class="am-alert am-alert-danger"></div>').hide().
  	          appendTo($group);
  	      }

  	      $alert.html(msg).show();
  	    }
  	  });
  	});
</script>

<%--短信验证码--%>
<script>
    var messageData;
    var wait = 120; // 短信验证码120秒后才可获取下一个

    /**
     * 获取验证码
     * @param that
     */

    function getMsgNum(that) {
        var phoneNumber = $('#phone').val();
        setButtonStatus(that); // 设置按钮倒计时

        var phone = JSON.stringify({phoneNumber:phoneNumber});//必须利用JSON.stringify转化为json（将对象提取成json对象）

        //发送短信接口
        $.ajax({
            url:'sendMsg.do', // 后台短信发送接口
            type: 'POST',
            dataType: 'json',
            contentType: "application/json",
            //async: false, //false 同步
            data:phone,
            success: function (result) {
                console.log(result);
                if (result.code=='400') {
                    alert("请填写手机号!");
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);
            }
        });

    }


    /**
     * 设置按钮状态
     */
    function setButtonStatus(that) {
        if (wait == 0) {
            that.removeAttribute("disabled");
            that.value="免费获取验证码";
            wait = 60;
        } else {
            that.setAttribute("disabled", true);
            that.value=wait+"秒后可以重新发送";
            wait--;
            setTimeout(function() {
                setButtonStatus(that)
            }, 1000)
        }
    }

</script>






<%@include file="/WEB-INF/footer.jsp"%>