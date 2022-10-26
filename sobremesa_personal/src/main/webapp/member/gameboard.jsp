<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="gameboard.css">
</head>
<body>
	<div class="container">
		<div class="gameboard">	<!-- 게임판 전체 -->
			<div class="boardbox">	<!-- 게임판 박스 -->
				<div class="b_center"> <!-- 게임판 가운데 부분 -->
					<div class="center_deck1">
						<h2 class=center_t>Community Chest</h2>
						<div class="deck"></div>
					</div>
					
					<h1 class="gameTitle">마블의 민족</h1>
					<div class="center_deck2">
						<h2 class="center_t">Chance</h2>
						<div class="deck"></div>
					</div>
				</div>
		
		
				<div class="g_start"> <!-- 출발지 -->
					<div class="g_space"><!-- 게임칸 박스 -->
						<div class="instructions">설명</div>
						<div class="go-word">시작칸</div>
					</div>
				</div>
		
				<div class="row horizontal-row bottom-row"><!-- 아래 가로칸 -->
					<div class="space property">
						<div class="g_space">
							<div class="color-bar light-blue"></div>
							<div class="name">Connecticut Avenue</div>
							<div class="price">PRICE $120</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar light-blue"></div>
							<div class="name">Vermont Avenue</div>
							<div class="price">Price $100</div>
						</div>
					</div>
					<div class="space chance">
						<div class="g_space">
							<div class="name">Chance</div>
							<i class="drawing fa fa-question"></i>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar light-blue"></div>
							<div class="name">Oriental Avenue</div>
							<div class="price">Price $100</div>
						</div>
					</div>
					<div class="space railroad">
						<div class="g_space">
							<div class="name">Reading Railroad</div>
							<i class="drawing fa fa-subway"></i>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space fee income-tax">
						<div class="g_space">
							<div class="name">Income Tax</div>
							<div class="diamond"></div>
							<div class="instructions">Pay 10%<br>or<br>$200</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar dark-purple"></div>
							<div class="name">Baltic Avenue</div>
							<div class="price">Price $50</div>
						</div>
					</div>
					<div class="space community-chest">
						<div class="g_space">
							<div class="name">Community Chest</div>
							<i class="drawing fa fa-cube"></i>
							<div class="instructions">Follow instructions on top card</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar dark-purple"></div>
							<div class="name three-line-name">Mediter-<br>ranean<br>Avenue</div>
							<div class="price">Price $50</div>
						</div>
					</div>
				</div>
		
				<div class="space corner jail"><!-- 무인도칸 -->
					<div class="just">Just</div>
					<div class="drawing">
						<div class="g_space">
							<div class="name">In</div>
							<div class="window">
								<div class="bar"></div>
								<div class="bar"></div>
								<div class="bar"></div>
								<i class="person fa fa-frown-o"></i>
							</div>
							<div class="name">Jail</div>
						</div>
					</div>
					<div class="visiting">Visiting</div>
				</div>
		
				<div class="row vertical-row left-row"> <!-- 왼쪽 세로칸 -->
					<div class="space property">
						<div class="g_space">
							<div class="color-bar orange"></div>
							<div class="name">New York Avenue</div>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar orange"></div>
							<div class="name">Tennessee Avenue</div>
							<div class="price">Price $180</div>
						</div>
					</div>
					<div class="space community-chest">
						<div class="g_space">
							<div class="name">Community Chest</div>
							<i class="drawing fa fa-cube"></i>
							<div class="instructions">Follow instructions on top card</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar orange"></div>
							<div class="name">St. James Avenue</div>
							<div class="price">Price $180</div>
						</div>
					</div>
					<div class="space railroad">
						<div class="g_space">
							<div class="name long-name">Pennsylvania Railroad</div>
							<i class="drawing fa fa-subway"></i>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar purple"></div>
							<div class="name">Virginia Avenue</div>
							<div class="price">Price $160</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar purple"></div>
							<div class="name">States Avenue</div>
							<div class="price">Price $140</div>
						</div>
					</div>
					<div class="space utility electric-company">
						<div class="g_space">
							<div class="name">Electric Company</div>
							<i class="drawing fa fa-lightbulb-o"></i>
							<div class="price">Price $150</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar purple"></div>
							<div class="name">St. Charles Place</div>
							<div class="price">Price $140</div>
						</div>
					</div>
				</div>
		
				<div class="space corner free-parking"> <!-- 올림픽 -->
					<div class="g_space">
						<div class="name">Free</div>
						<i class="drawing fa fa-car"></i>
						<div class="name">Parking</div>
					</div>
				</div>
		
				<div class="row horizontal-row top-row"> <!-- 위 가로 -->
					<div class="space property">
						<div class="g_space">
							<div class="color-bar red"></div>
							<div class="name">Kentucky Avenue</div>
							<div class="price">Price $220</div>
						</div>
					</div>
					<div class="space chance">
						<div class="g_space">
							<div class="name">Chance</div>
							<i class="drawing fa fa-question blue"></i>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar red"></div>
							<div class="name">Indiana Avenue</div>
							<div class="price">Price $220</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar red"></div>
							<div class="name">Illinois Avenue</div>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space railroad">
						<div class="g_space">
							<div class="name">B & O Railroad</div>
							<i class="drawing fa fa-subway"></i>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar yellow"></div>
							<div class="name">Atlantic Avenue</div>
							<div class="price">Price $260</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar yellow"></div>
							<div class="name">Ventnor Avenue</div>
							<div class="price">Price $260</div>
						</div>
					</div>
					<div class="space utility waterworks">
						<div class="g_space">
							<div class="name">Waterworks</div>
							<i class="drawing fa fa-tint"></i>
							<div class="price">Price $120</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar yellow"></div>
							<div class="name">Marvin Gardens</div>
							<div class="price">Price $280</div>
						</div>
					</div>
				</div>
		
				<div class="space corner go-to-jail"> <!-- 세계여행 -->
					<div class="g_space">
						<div class="name">Go To</div>
						<i class="drawing fa fa-gavel"></i>
						<div class="name">Jail</div>
					</div>
				</div>
		
				<div class="row vertical-row right-row"> <!-- 오른쪽 세로 -->
					<div class="space property">
						<div class="g_space">
							<div class="color-bar green"></div>
							<div class="name">Pacific Avenue</div>
							<div class="price">Price $300</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar green"></div>
							<div class="name three-line-name">North Carolina Avenue</div>
							<div class="price">Price $300</div>
						</div>
					</div>
					<div class="space community-chest">
						<div class="g_space">
							<div class="name">Community Chest</div>
							<i class="drawing fa fa-cube"></i>
							<div class="instructions">Follow instructions on top card</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar green"></div>
							<div class="name long-name">Pennsylvania Avenue</div>
							<div class="price">Price $320</div>
						</div>
					</div>
					<div class="space railroad">
						<div class="g_space">
							<div class="name">Short Line</div>
							<i class="drawing fa fa-subway"></i>
							<div class="price">Price $200</div>
						</div>
					</div>
					<div class="space chance">
						<div class="g_space">
							<div class="name">Chance</div>
							<i class="drawing fa fa-question"></i>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar dark-blue"></div>
							<div class="name">Park Place</div>
							<div class="price">Price $350</div>
						</div>
					</div>
					<div class="space fee luxury-tax">
						<div class="g_space">
							<div class="name">Luxury Tax</div>
							<div class="drawing fa fa-diamond"></div>
							<div class="instructions">Pay $75.00</div>
						</div>
					</div>
					<div class="space property">
						<div class="g_space">
							<div class="color-bar dark-blue"></div>
							<div class="name">Boardwalk</div>
							<div class="price">Price $400</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>