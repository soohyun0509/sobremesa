<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="/sobremesa_personal/css/signin.css">
</head>
<body>
	<%@include file="../header.jsp" %>

	<!-- 본문 -->
	<section>
		<div class="wrap">
			<div class="container">
				<div class="content_box">
					<!-- id,pw -->
					<div class="input_box">
						<!-- id -->
						<div id="signin_input1">
							<span class="input_icon_id"></span>
							<span class="input_field">
								<input id="signin_id" type="text" placeholder="ID">
							</span>
						</div>
						<!-- pw -->
						<div id="signin_input2">
							<span  class="input_icon_pw"></span>
							<span class="input_field">
								<input id="signin_pw" type="password" placeholder="Password">
							</span>
						</div>
					</div>
					<div class="login_result">
					</div>
					<!-- remember me, forger pw -->
					<div class="option_box">
	
						<!-- forger pw -->
						<span>
							<h3> <a href="#">Forget Password?</a> </h3>
						</span>
					</div>
					
					<!-- login btn -->
					<div class="btn_box">
						<button onclick="login()" class="loginbtn">LOGIN</button>
					</div>
				</div>
			</div>
		</div>
	</section>

	<%@include file="../footer.jsp" %>
	
	<script type="text/javascript" src="/sobremesa_personal/js/member/signin.js"></script>
</body>
</html>