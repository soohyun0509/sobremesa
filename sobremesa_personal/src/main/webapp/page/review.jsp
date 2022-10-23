<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/sobremesa_personal/css/review.css" rel="stylesheet">
</head>
<body>
	<%@include file="../header.jsp" %>


	<div class="customerbox">
		<div class="cutomer_title">
			<h3>문의사항</h3>
			<p>문의하신 내용을 신속하게 답변해 드립니다.</p>
		</div>
		<div class="cutomer_content">
			<div class="rowbox">
				<div class="col1">문의유형</div>
				<div class="col2">
					<div class="select_box">
						<select class="form_type">
							<option>예약관련</option><option>레스토랑 이용관련</option>
							<option>이용불편사항</option><option>기타</option>
						</select>
					</div>
				</div>
			</div>
			<div class="rowbox">
				<div class="col1">제목</div>
				<div class="col2"><input class="form_title" type="text"> </div>
			</div>
			<div class="rowbox">
				<div class="col1">내용</div>
				<div class="col2"><textarea class="form_content" rows="10" cols="50"></textarea> </div>
			</div>
			<div class="rowbox">
				<div class="col1">이메일</div>
				<div class="col2 email">
					<input class="form_email" type="text"> @ 
										<select>
											<option>직접입력</option><option>naver.com</option><option>nate.com</option>
										</select> 
				</div>
			</div>
			<div class="rowbox">
				<div class="col1">연락처</div>
				<div class="col2"><input class="form_phone" type="text" placeholder="010-123-2134"> </div>
			</div>
			<div class="btn">
				<button onclick="데이터저장()">문의하기</button>
			</div>
			
		</div>
		
	</div>
	
	<div class="customerbox result_content">
			<h3>문의 목록</h3>
	
			<table class="result">
				
			</table>
			
			<table class="result2">
				<tr>
					<th>제목</th><th class="js_title">
				</tr>
				<tr>
					<th>내용</th><th class="js_content"></th>
				</tr>
				<tr>
					<th>연락처</th><th class="js_phone"></th>
				</tr>
			
			</table>
	</div>

	<%@include file="../footer.jsp" %>
	
	<script type="text/javascript" src="/sobremesa_personal/js/page/review.js"></script>
</body>
</html>