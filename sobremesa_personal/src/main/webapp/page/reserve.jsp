<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="/sobremesa_personal/css/reserve.css">
</head>
<body>
	<%@include file="../header.jsp" %>
	
	<div class=mainbox>
   <div class="reservation">
      <h3> RESERVATION</h3>
      <div class="reservation_box">
         <div>
            <ul class="re_inform">
               <li class="li1">더욱 정성스러운 음식으로 준비하겠습니다.<br>미리 예약해주시면</li>
               <li class="li2">예 약 안 내</li>
            </ul>
         </div>
         <div class="re_inform2">
            <ul>
               <li class="li3"> 주소 : 경기도 안산시 한대앞역 09-663</li>
               <li class="li4"> 영업시간 : 화요일~일요일 오후 06:30 ~ 오후 11:30 </li>
               <li class="li5"> 예약 및 대관 안내<br>
                  T.  02 - 545 - 9845 <br>
                  M. 010 - 5744 - 1588<br>
                  E. abcd@naver.com<br><br>
                  ※ 예약 및 대관안내는 전화로만 가능합니다.<br>
                  ※ 개인이나 기업, 단체 등에서 각종 행사를 위한 만찬 장소가 필요하신 경우<br>
                     대관을 통해 전용으로 가온을 즐기실 수 있습니다.
               </li>
            </ul>
         </div>
      </div>
   </div>
   
   <div class="cal">
      <div class="head">
         <div class="left_btn"> < </div>
            
            <h3 class="monthTitle"></h3>
            <h2 class="yearTitle"></h2>
        
         <div class="right_btn"> > </div>
      </div>
      <div class="week">
         <div class="sunday">Sunday</div>
         <div>Monday</div>
         <div>Tuesday</div>
         <div>Wednesday</div>
         <div>Thursday</div>
         <div>Friday</div>
         <div>Saturday</div>
      </div>
      <div class="days">
      </div>
      <br>
      <br>
   </div>
</div>   


	<div class="reser_section">
		<div class="reserbox">
			<h3> 예 약 등 록 [ <span id="when"></span> ]</h3>
				<form class="reser_form">
					<div class="inputbox">성 함 : <input type="text" id="name"> </div><br>
					<div class="inputbox">휴대폰뒷자리 : <input type="number" id="phone"></div> <br>
					<div class="inputbox">인원수 : <input type="number" id="people"></div> <br>
					<button type="button" onclick="예약등록()"> 예약등록 </button>
				</form>
			</div>
		</div>
	
		<div>
			<table id="list">
			</table>
		</div>


	<%@include file="../footer.jsp" %>
	
	<script type="text/javascript" src="/sobremesa_personal/js/page/reserve.js"></script>
</body>
</html>