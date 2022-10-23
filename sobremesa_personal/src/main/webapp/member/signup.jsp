<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	
	
	<link href="../css/signup.css" rel="stylesheet">
</head>
<body>

	<%@include file="../header.jsp" %>

	<!-- 본문 -->
	<section>
		<div class="wrap">
			<div class="signup_wrap">
				<div class="signup_box">
					<!-- 이미지 -->
					<span class="signup_img"></span>
					<img class="logo_img" src="../image/logo.jpg">
					
					<!-- 입력란 -->
					<span class="signup_input_box">
						<div class="input_box_title">
							<h2 class="heading">Welcome to <strong>SOBREMESA</strong></h2>
						</div>
						<table>
							<tr class="signup_input">
								<td class="title">아이디</td>
								<td class="input_box">
									<input class="signup_id" type="text" onkeyup="checkId()">
									<span class="check"></span>
								</td>
								
							</tr>
							<tr class="signup_input">
								<td class="title">비밀번호</td>
								<td>
									<input class="signup_pw" type="password" onkeyup="checkPassword()">
									<span class="check"></span>
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">비밀번호 확인</td>
								<td>
									<input class="signup_pw_confirm" type="password" onkeyup="checkPassword2()">
									<span class="check"></span>
									
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">이름</td>
								<td>
									<input class="signup_name" type="text" onkeyup="checkName()">
									<span class="check"></span>
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">이메일</td>
								<td>
									<input class="signup_email" type="text" onkeyup="checkEmail()">
									<span class="check"></span>
								</td>
						</table>
						
						<div class="btn_box">
							<button onclick="signup()" class="signBtn"> 회원가입 </button>
						</div>
						
						<span class="signup_sns">
							<h3>Create account with</h3>
							<ul class="sns_items">
								<!-- 아이콘 폰트 사용 -->
								<li><a href="https://ko-kr.facebook.com/"> <i class="fa-brands fa-facebook"></i> </a></li>
								<li><a href="https://accounts.google.com/v3/signin/identifier?dsh=S-334557100%3A1661756047153583&continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dgo-to-account-button&service=accountsettings&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmXcHL3EUloQIsE0nPE3iYIenXqi63CB6qh2UD1I6QUSnLeZfkYtHXM52W7W5egsT1cL9sVH"> <i class="fa-brands fa-google-plus"></i> </a></li>
								<li><a href="https://www.elllo.org/"> <i class="fa-brands fa-ello"></i></i> </a></li>
							</ul>
						</<span>
					</span>
					
				</div>
			</div>
		</div>
	</section>
	
	<%@include file="../footer.jsp" %>
	
	<script type="text/javascript" src="/sobremesa_personal/js/member/signup.js"></script>
</body>
</html>