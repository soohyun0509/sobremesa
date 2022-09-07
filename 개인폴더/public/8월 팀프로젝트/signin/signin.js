/*
	아이디: admin
	비밀번호: 1234
	가 아닌 아이디와 비밀번호로 로그인 시도하면 잘못되었다고 알림 뜨기
	맞으면 메인 페이지로 이동
	
	id나 pw 입력창이 focus되면 각 입력창 전체 테두리에 box-shadow 입히기
	
	[주요 기능]
	document.getElementById : 입력된 아이디와 비밀번호를 체크
	addEventListener : focus 또는 focusout되면 특정 이벤트 발생되도록 지정
 */

let signin_input1 = document.getElementById("signin_input1")
let signin_input2 = document.getElementById("signin_input2")
let signin_id = document.getElementById("signin_id")
let signin_pw = document.getElementById("signin_pw")

 function checkUser(){
	if(signin_id.value=='admin' && signin_pw.value=='1234'){
		alert("정상적으로 로그인되었습니다.")
		window.location.href="../main/레스토랑소개.html"		//메인페이지로 이동
	}else{
		alert("아이디 또는 비밀번호가 잘못되었습니다.")
		signin_id.value=''
		signin_pw.value=''
	}
}

//id나 pw 입력창이 focus되면 각 입력창 전체 테두리에 box-shadow 입히기
signin_id.addEventListener('focus', (event) => {
	signin_input1.style = "box-shadow : 0 0 6px #ccc";
});
signin_pw.addEventListener('focus', (event) => {
	signin_input2.style = "box-shadow : 0 0 6px #ccc";
});

//id나 pw 입력창이 focusout되면 각 입력창 전체 테두리에 box-shadow 삭제
signin_id.addEventListener('focusout', (event) => {
	signin_input1.style = "box-shadow : none";
});
signin_pw.addEventListener('focusout', (event) => {
	signin_input2.style = "box-shadow : none";
});