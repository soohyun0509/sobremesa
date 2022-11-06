<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/sobremesa_personal/css/gallery.css" rel="stylesheet">
</head>
<body>
	<%@include file="../header.jsp" %>
	

<div class="wrap">
			<div class="gallery_box">
				<div class="gallery_main_title">
					<h3>SOBREMESA PHOTO</h3>
				</div>
				
				<div class="gallery_content">
					<div class="gallery_sub_title">
						<p>실제 방문자들의 솔직한 후기들을 만나보세요</p>
					</div>
					<table class="gallery_imgs">
						
					</table>
					
					<ul class="pagination">
						<li onclick="printPicture(1)" class="current1 page">1</li>
						<li onclick="printPicture(2)" class="current2 page">2</li>
						<li onclick="printPicture(3)" class="current3 page">3</li>
						<li onclick="printPicture(4)" class="current4 page">4</li>
						<li onclick="printPicture(5)" class="current5 page">5</li>
						<li><a href="#" class="pagination_icon"> </a></li>
					</ul>
				</div>
				
			
			</div>
			</div>

	<%@include file="../footer.jsp" %>

	<script type="text/javascript" src="/sobremesa_personal/js/page/gallery.js"></script>
</body>
</html>