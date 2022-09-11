/*
	네비게이션 바
	- 그니까 버튼 누르면 아래로 좌라락 펼쳐지게 하라는건가...
	- 그런 어려운...
	- 일단 걍 다 가져오자...
	- 애초에 css에서 미디어쿼리일때 메뉴를 block으로만 해두고 display none으로 해놔야겠다.

*/

let bar= document.querySelector('.menu')
let onbtn= document.querySelector('.onbtn')
let offbtn= document.querySelector('.offbtn')
let btn=document.querySelector('.btn')
let on=true; // 스위치변수

btn.addEventListener('click', ()=>{
	if(on){
		bar.style.display='block'
		onbtn.style.display='inline-block'
		onbtn.style.paddingTop='20px'
		offbtn.style.display='none'
		on=false
	}
	else if(on==false){
		bar.style.display='none'
		offbtn.style.display='inline-block'
		offbtn.style.paddingTop='20px'
		offbtn.style.paddingRight='30px'
		onbtn.style.display='none'
		on=true
	}//누를때마다 작동 다르게 되게 설정
	
})



