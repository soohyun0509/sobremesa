// 유효성검사
//DB저장

let check=document.querySelectorAll(".check");
let n='<i class="fas fa-times"></i>';
let y='<i class="fas fa-check"></i>';

// 유효성 결과
let Cid=false;
let Cpassword=false;
let Cname=false;
let Cemail=false;

/*---------- 아이디 유효성 -------------- */
function checkId(){
	let id=document.querySelector(".signup_id").value;
	let $id=/^[a-zA-Z0-9]{4,12}$/
	if($id.test(id)){check[0].innerHTML=y; Cid=true;}
	else{check[0].innerHTML=n+" 영어,숫자로 이루어진 4~12자 이내"; Cid=false;}
	
}
/*---------- 비밀번호 유효성 -------------- */
function checkPassword(){
	let password=document.querySelector(".signup_pw").value;
	let $password=/^[a-zA-Z0-9]{8,15}$/
	if($password.test(password)){check[1].innerHTML=y; Cpassword=true; checkPassword2();}
	else{check[1].innerHTML=n+" 영어,숫자로 이뤄진 8~15자 이내"; Cpassword=false;}
}

/*---------- 비밀번호 확인 유효성 -------------- */
function checkPassword2(){
	let password=document.querySelector(".signup_pw").value;
	let password2=document.querySelector(".signup_pw_confirm").value;
	let $password=/^[a-zA-Z0-9]{8,15}$/
	
	if(!$password.test(password2)){check[2].innerHTML=n+" 영어,숫자로 이뤄진 8~15자 이내"; Cpassword=false;}
	else if(password!=password2){check[2].innerHTML=n+"비밀번호가 일치하지 않습니다."; Cpassword=false;}
	else{check[2].innerHTML=y; Cpassword=true;}
	
}

/*---------- 이름 유효성 -------------- */
function checkName(){
	let name=document.querySelector(".signup_name").value;
	let $name=/^[가-힣]{2,10}$/
	if($name.test(name)){check[3].innerHTML=y; Cname=true;}
	else{check[3].innerHTML=n+" 한글 2~10자 이내"; Cname=false;}
}
/*---------- 이메일 유효성 -------------- */
function checkEmail(){
	let email=document.querySelector(".signup_email").value;
	let $email=/^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-]+$/
	if($email.test(email)){check[4].innerHTML=y; Cemail=true;}
	else{check[4].innerHTML=n+" 이메일 형식으로 입력해주세요"; Cemail=false;}
}


/*---------------- 유효성 결과 확인하고 DB저장 --------------------- */
function signup(){
	if(!(Cname&&Cid&&Cpassword&&Cemail)){alert("모든 정보를 입력해주세요"); return;}

	let data={
		name : document.querySelector(".signup_name").value,
		id: document.querySelector(".signup_id").value,
		password: document.querySelector(".signup_pw").value,
		email: document.querySelector(".signup_email").value
	}

	$.ajax({
		url:"/sobremesa_personal/member/singup",
		data: data,
		success: function(re){
			alert(re)
		}
	})


}







