/**

	틱택토 만들기
	1. 게임시작버튼 필요 -> 버튼 누르면 게임판 호출 
		->버튼을 계속해서 9개까지 만들어줘야하고 각각의 숫자를 줘야하니까
			반복문 돌리기
	2. 게임판-> 버튼 9개 필요 / 각각 숫자 할당
	3. 게임판의 버튼 누르면 O,X 나오기
	  -> 사용자가 누르는거, 자동으로 컴퓨터가 누르는거
	  -> 중복 선택 금지
	  		-> 누른 값을 배열에 담아서 그 배열에 이미 그 값이 있으면 못 누르게 해야됨
	4. 3개 동일할 경우 승리 판단
		-> 숫자로 들어갈 경우 승리판단이 까다로워짐 모양으로 넣어서 모양이 같으면 승리자 나올 수 있게!
	5. 게임판 리셋

 */

let status=[ ]
let count=0

function Printboard(){
	
	//당장 빈 배열에 추가해서 indexOf해서 -1이 아닐때(aka 이미 배열에 존재할때) 그 값을 다시 push 하지않는법을
	// 못찾겠어...
	//그니까 딱 9개만 들어갈 수 있게 정해둔 배열을 만들어주는게 편할듯 
	//이걸 눌린 숫자가 그 인덱스에 딱딱 들어가게 설정해줘야해...
	status=[null,null,null,null,null,null,null,null,null]
	count=0
	let gameboard=''//전역 변수로 선언하면 버튼 누를때마다 계임판 계속 생성됨
	
	for(let i=0; i<9; i++){
		gameboard+=`<button id=${i} onclick='btnClick(${i})'>${i}</button>`
		if(i%3==2){gameboard+= `<br>`}
		
	}

	document.getElementById('게임판').innerHTML= gameboard

}
 
 
function btnClick(i){//매개변수로 받아온 값을 id에 넣어준다! 그 매개변수를 위에서 본인이 가진 i로 줬음!
	
	//사용자 차례
	if(Check(i)){
		alert("이미 선택한 숫자입니다.")
		return
	}
	
	count++
	console.log(count)
	if(count==9){
		alert("안내 ) 무승부입니다. 게임 종료")	
		return
	}
	
	document.getElementById(i).innerHTML= 'O'//스크립트 내부에서 선언한 id니까 '' 안적는건가...
	status[i]='O' //i값을 status[i]에 대입
	if(Victory()){	//위치 중요
		alert('안내 ) 이겼습니다. 게임 종료')
		return
	}
	
	
	//컴퓨터 차례
	let computer= ''//이 수를 어디에 저장해줘야함 -> 변수 선언 -> while문에서 난수 계속 발생시켜야 해서 이동...
	
	while(true){
		computer= Math.floor(Math.random()*9)
		//console.log(computer)
		if(status[computer]==null){
			break
		}
	}
	count++
	if(count==9){
		alert("안내 ) 무승부입니다. 게임 종료")	
		return
	}
	//break가 된건 빈자리에 들어갔다는거니꺼 그때 while문 종료하고 나와서 뒤에 행동 시작해야지
	//while문 안에서 해주면 안돼...if문 break되고 나면 아무것도 안하고 바로밖으로 나와...
	document.getElementById(computer).innerHTML= 'X'//왜 위에랑 다른값  넣어줘야되는건지 잘 이해가 안돼...
	//console.log(computer)	//난수가 내놓은 숫자를 id로 가지는건데...이해가 될듯 말듯...
	status[computer]='X'
	
	if(Victory()){
		alert("안내) 패배했습니다. 게임 종료")
		return
	}
	
	
}
	
function Check(a){
	if(status[a]!=null){//그 자리가 내가 미리 정해둔 null이 아니라는건 이미 뭐가 들어왔다는거!
		return true
	}
 
}
 
function Victory(){//가로 / 세로 / 대각선 / 무승부
	//1.가로	012 345 678
	for(let i=0; i<=6; i+=3){
		if(status[i]!=null && status[i]==status[i+1] && status[i+1]==status[i+2]){
			return true
		}
	}	
	//2. 세로 036 147 258
	for(let i=0; i<=2; i++){
		if(status[i]!=null && status[i]==status[i+3] && status[i+3]==status[i+6]){
			return true
		}
	}
	
	//3. 대각선 048 246
	if(status[0]!=null && status[0]==status[4] && status[4]&&status[8]){
		return true
	}
	else if(status[2]!=null && status[2]==status[4] && status[4]==status[6]){
		return true
	}
	//4. 무승부 -> 9번을 다 했고 더 이상 배열에 null 값이 없으면서 위에 값이 없었을 경우

	
	
}

 
 
 
 
 
 
 