<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	
	<!-- 아이콘 폰트 -->
	<script src="https://kit.fontawesome.com/3367894b6f.js" crossorigin="anonymous"></script>
	<!-- FontAwesome에서 제공하는 글머리 기호로 많이 쓰이는 아이콘 -->
	<script src="https://kit.fontawesome.com/b8a7fea4d4.js"></script>
	<!-- css 기본 초기화 -->
	<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
	<link href="../css/signup.css" rel="stylesheet">
</head>
<body>
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
									<span class="input_field">
										<input class="signup_id" type="text">
									</span>
									4~12자로 입력
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">비밀번호</td>
								<td>
									<span class="input_field">
										<input class="signup_pw" type="password">
									</span>
									4~12자로 입력
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">비밀번호 확인</td>
								<td>
									<span>
										<input class="signup_pw" type="password">
									</span>
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">이름</td>
								<td>
									<span>
										<input class="signup_name" type="text">
									</span>
								</td>
							</tr>
							<tr class="signup_input">
								<td class="title">이메일</td>
								<td>
									<span class="email_field">
										<input class="signup_email" type="text">@
										<div class="select_box">
											<select>
												<option>이메일 선택</option>
												<option>gmail.com</option>
												<option>naver.com</option>
												<option>nate.com</option>
											</select>
										</div>
									</span>
								</td>
							<tr class="signup_input">
								<td class="title">생년월일</td>
								<td class="input_birth">
									<span class="birth_item">
										<input class="signup_year" type="text" placeholder="년(4자)">
										<span>년</span>
									</span>
									<span class="birth_item">
										<select class="signup_month">
											<option>월 ▼</option>
											<option>1</option> <option>2</option> <option>3</option> <option>4</option>
											<option>5</option> <option>6</option> <option>7</option> <option>8</option>
											<option>9</option> <option>10</option> <option>11</option> <option>12</option>
										</select>
										<span>월</span>
									</span>
									<span class="birth_item">
										<input class="signup_day" type="text" placeholder="일(2자)">
										<span>일</span>
									</span>
								</td>
							</tr>
						</table>
						
						<div class="btn_box">
							<a href="../signin/signin.html" > <button class="btn"> 회원가입 </button></a>
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
	
	
</body>
</html>