<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SOBREMESA</title>

	<!-- SweetAlert2 테마 -->
	<link rel="stylesheet" href="sweetalert2.min.css">
	<!-- 아이콘 폰트 -->
	<script src="https://kit.fontawesome.com/3367894b6f.js" crossorigin="anonymous"></script>
	<!-- FontAwesome에서 제공하는 글머리 기호로 많이 쓰이는 아이콘 -->
	<script src="https://kit.fontawesome.com/b8a7fea4d4.js"></script>
	<!-- 구글폰트 -->
	<link href="https://fonts.googleapis.com/css2?family=Noto+Serif+HK&display=swap" rel="stylesheet">
	
	<!-- css 기본 초기화 -->
	<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
	<link href="/sobremesa_personal/css/header.css" rel="stylesheet">

</head>
<body>
   <div class="box">
   
   <% String loginId=(String)request.getSession().getAttribute("id"); %>
   
   
   	<div class="header">
         <div class="logo">
            <a href="/sobremesa_personal/page/main.jsp"><img class="hd_img" alt="" src="/sobremesa_personal/image/logo.jpg"></a>
         </div>
         <div class="menus">
         	<%if(loginId==null){ %>
	            <ul class="top_menu">
	               <li><a href="/sobremesa_personal/member/signin.jsp">로그인</a> / </li>
	               <li><a href="/sobremesa_personal/member/signup.jsp">회원가입</a> </li>
	            </ul>
	            <ul class="main_menu">
	               <li><a href="/sobremesa_personal/page/main.jsp">메인 </a> </li>
	               <li><a href="/sobremesa_personal/page/menu.jsp">메뉴</a></li>
	               <li><a href="/sobremesa_personal/page/gallery.jsp">갤러리</a></li>
	            </ul>
	        <%} %>
	        <%if(loginId!=null){ %>
	            <ul class="top_menu">
	               <li><%=loginId %>님 안녕하세요	/</li>
	               <li><a href="/sobremesa_personal/member/logout.jsp">로그아웃</a></li>
	            </ul>
	            <ul class="main_menu">
	               <li><a href="/sobremesa_personal/page/main.jsp">메인 </a> </li>
	               <li><a href="/sobremesa_personal/page/reserve.jsp">예약</a></li>
	               <li><a href="/sobremesa_personal/page/menu.jsp">메뉴</a></li>
	               <li><a href="/sobremesa_personal/page/gallery.jsp">갤러리</a></li>
	               <li><a href="/sobremesa_personal/page/review.jsp">문의사항</a></li>
	            </ul>
	        <%} %>
            
         </div>
      </div>
    </div>
    
    	<!-- JQUERY 자바를 편하게 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script> 
		<!-- SweetAlert2 테마 -->
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
</body>
</html>