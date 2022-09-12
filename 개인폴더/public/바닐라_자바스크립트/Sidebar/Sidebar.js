/**


	내가 지금 js를 하는건지 css를 하는건지...귀찮아지고있어...
	- 버튼 누르면 사이바 뜨고 없어지고 하게만
	- 아 버튼 위치가 이벤트실행되면 달라져..빡치네
 */
 
 
let btn=document.querySelector('.fa-bars')
let header=document.querySelector('.header')
let on=false;


btn.addEventListener('click', ()=>{
	if(on==false){
		header.style.display='none'
		on=true
	}
	else if(on==true){
		header.style.display='flex'
		on=false
	}
	
	
})
 