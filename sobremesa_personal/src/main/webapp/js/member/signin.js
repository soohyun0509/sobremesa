
// 로그인 확인...
function login(){
	let id=document.querySelector("#signin_id").value;
	let password=document.querySelector("#signin_pw").value;
	
	console.log(id);
	console.log(password);
	$.ajax({
		url:"/sobremesa_personal/member/signin",
		data:{"id" : id , "password" : password},
		success: function(re){
			alert(re)
		}
	})
	
	
}






/*---------- 입력창 효과 -------------- */
let signin_input1 = document.getElementById("signin_input1")
let signin_input2 = document.getElementById("signin_input2")
let signin_id = document.getElementById("signin_id")
let signin_pw = document.getElementById("signin_pw")

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