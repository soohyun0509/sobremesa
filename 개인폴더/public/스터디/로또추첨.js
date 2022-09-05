/**

	로또 추첨 프로그램
		1. 버튼 누르면 로또 번호판 출력->45개
		2. 로또 번호 6개 고르기
			- 각 버튼 누르면 버튼의 아이디값(숫자)가 위에 출력되게
			- 중복선택 불가->한번 더 누르면 취소되게끔
			- 취소가능하게
			- 6개까지만 선택할 수 있게
			
		3. 버튼 누르면 추첨 시작 
			- 중복이 나오네...
			- 사용자가 선택한 번호와 대조
			- 추첨 결과 출력

 */
let numbers=[]
let rand=[]

function numPrint(){
	let $board=''
	numbers=[]
	
	for(let i=1; i<=45; i++){
		$board += `<button id=${i} onclick=btnClick(${i}) style="padding: 10px;">${i}</button>`
		if(i%5==0){
			$board+=`<br>`
		}
	}
	
	document.getElementById('board').innerHTML= $board
	document.getElementById('start').innerHTML=`<button onclick=lotto()>추첨 시작하기</button>`
}
 
function btnClick(i){
	
	if(numbers.indexOf(i)!=-1){
		alert('안내 ) 이미 선택된 번호입니다. 번호를 삭제합니다.')
		numbers.splice(numbers.indexOf(i),1)
		document.getElementById('selected').innerHTML= numbers
		return
	}
	if(numbers.length==6){
		alert('안내 ) 6개 전부 선택하셨습니다. 추첨해주세요')
		document.getElementById('selected').innerHTML= numbers
		return
	}
		
		
	
	numbers.push(i)
	console.log(numbers)
	
	document.getElementById('selected').innerHTML= `선택한 번호 : ${numbers}`
	//+=를 넣으면 추가되는 거 하나만 나와야되는데 배열 전체가 계속 다시 나옴
	//그렇다고 =만 넣으면 앞에 쓴 문구가 사라짐...
} 
 
function lotto(){
	let result=[]
	
	if(numbers.length<6){
		alert('안내 ) 번호 6개를 먼저 선택해주세요')
		return
	}
	
	for(let i=1; i<=6; i++){
		//rand+= Math.floor((Math.random()*45)+1)//이렇게 하니까 중간에 ,이 안찍힘
		
		rand.push(Math.floor((Math.random()*45)+1))
		
		
		
		
	}
	
	
	
	
	console.log(rand)
	document.getElementById('lottonum').innerHTML= `당첨 번호 : ${rand}`
	

	
	for(let a of numbers){
		if(rand.indexOf(a)!=-1){
			result+=a
			document.getElementById('result').innerHTML+=`맞은 번호 : ${result}`
		}
		console.log(result)
	}
	
}
 
 
 
 
 
 
 
 
 
 
 
 