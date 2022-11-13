<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="/sobremesa_personal/css/main.css">
</head>
<body>

	<%@include file="../header.jsp" %>
	
	
	<!-- 본문 -->
	<div id="main_img"> <!-- 메인이미지 -->
		<div class="main_text">
			<h3> SOBREMESA 레스토랑 소개 </h3> <!-- 메인이미지 소개글 -->
			<p> 저희 레스토랑을 소개합니다. </p>
		</div>
	</div>
	<!-- 플로팅 박스 -->
	<section id="floatingbox">
		<div class="floatContainer">
			<div class="floatTop">
				<span class="topTitle"> 예약상담 고객센터 </span>
				<span class="colse">X</span>
			</div>
			<div class="floatBottom">
				<div class="floatTitle"> 예약상담 </div>
				<div> 1600-3344 </div>
			</div>
			<div class="floatBottom">
				<div class="floatTitle"> 교육상담 </div>
				<div> 031-123-1234 </div>
			</div>
		</div>
	</section>
	
	<div class="info_restaurant">
		<img src="../image/주방1.jpg">
		<div>
			<p>
				SOBREMESA 레스토랑은 스페인어로 식사 후 가족들이나 지인들과 어울리고
				서로 이야기를 나누며 즐거운 시간을 보내는 뜻을 의미합니다.
				고객의 니즈에 맞게 더움 푹격있고 알찬 추억을 제공해드리고자 노력하겠습니다.
			</p>
		</div>
	</div>
	<div id="sub_items"> <!-- 서브페이지 소개 -->
		<div class="box">
			<div class="item">
				<ul>
					<li> <img alt="" src="../image/주방.jpg"></li>
					<li> <h3>메뉴페이지</h3></li>
					<li> 매주 변경되는 새로운 메뉴를 만나보세요</li>
				</ul>
			</div>
			<div class="item">
				<ul>
					<li> <img alt="" src="../image/cal.jpg"></li>
					<li> <h3>예약페이지</h3></li>
					<li> 저녁식사를 미리 예약하시면 더욱 편하게 식사를 즐길 수 있습니다. </li>
				</ul>
			</div>
			<div class="item">
				<ul>
					<li> <img alt="" src="../image/review.jpg"></li>
					<li> <h3>리뷰페이지</h3></li>
					<li> 실제 방문객들의 솔직한 후기를 만나보세요 </li>
				</ul>
			</div>
			<div class="item">
				<ul>
					<li> <img alt="" src="../image/customer.jpg"></li>
					<li> <h3>문의사항</h3></li>
					<li> 식당이용시 문의사항이 있다면 남겨주세요.</li>
				</ul>
			</div>
		</div>
	</div>
	
	<div id="map"> <!-- 구글 지도  -> 공유 -> 지도 퍼가기 -->
	 <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1334.2469146482294!2d126.85290952363569!3d37.30954482122825!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357b6f26eca4e801%3A0xcc760a7a473e93bf!2z7ZWc64yA7JWe7Jet!5e0!3m2!1sko!2skr!4v1659506398283!5m2!1sko!2skr"
		 width="450" height="300" style="border:0;"
		 allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
	</div>



	<%@include file="../footer.jsp" %>


</body>

</html>