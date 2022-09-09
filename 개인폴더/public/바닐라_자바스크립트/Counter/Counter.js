/**

	counter
	- 기존 화면 출력 0
	- 증가버튼 누르면 한칸씩 수 증가
	- 감소버튼 누르면 한칸씩 수 감소 + 음수되면 색상 변경
	- 리셋버튼 누르면 초기화

 */
 
let number=document.getElementById('number') 
let decbtn=document.getElementById('dec')
let resetbtn=document.getElementById('reset')
let incbtn=document.getElementById('inc')
let count=0;

incbtn.addEventListener('click' ,()=>{
	count++;
	number.innerHTML=count;
	number.style.color='#008B8B'
})

decbtn.addEventListener('click', ()=>{
	count--;
	number.innerHTML=count;
	number.style.color='#008B8B'
	if(count<=-1){
		number.style.color='#800000'
	}
})
resetbtn.addEventListener('click', ()=>{
	count=0;
	number.innerHTML=count;
	number.style.color='black'
})
