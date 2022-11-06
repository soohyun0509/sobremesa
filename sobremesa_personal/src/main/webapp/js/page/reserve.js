const date = new Date()
//Mon Aug 01 2022 00:00:00 GMT+0900 (한국 표준시)
const currentYear = date.getFullYear()
const currentMonth = date.getMonth()+1
const currentDate = date.getDate()
let startDay = new Date( currentYear , currentMonth-1 , 1 ) // 그 달의 01 일

const monthDays = document.querySelector('.days')


const monthmove = () => {
	console.log( startDay )
	let lastDay = new Date( startDay.getFullYear() , startDay.getMonth()+1 , 0 ).getDate()  //그 달의 마지막날
	let day = startDay.getDay()	// 1일의 요일
	console.log(lastDay)
	console.log(day)
		
	let days =""
	// 매달 1일의 요일 전까지 공백찍기 
	for(let i = 1 ; i <= day ; i++){
	      days += `<div> </div>`
	      monthDays.innerHTML = days
	}
	
	// 1 ~ 마지막날까지 일 출력 
	for(let i = 1 ; i <= lastDay ; i++){
		let reserveDay= startDay.getFullYear()+'-'+startDay.getMonth()+'-'+i
	  	days += `<div>${i}일
				     <ul>
				        <li><button id="${reserveDay}" class="dinner" onClick="reply_click(this.id)">Dinner</button></li>
				     </ul>
			   </div>`
	    monthDays.innerHTML = days
	}

	
	const months = [
	   "1_ January",
	   "2_ February",
	   "3_ March",
	   "4_ April",
	   "5_ May",
	   "6_ June",
	   "7_ July",
	   "8_ August",
	   "9_ September",
	   "10_ October",
	   "11_ November",
	   "12_ December",
	]
		
	document.querySelector('.monthTitle').innerHTML = months[ startDay.getMonth() ]
	document.querySelector('.yearTitle').innerHTML = startDay.getFullYear()  
}



/////////////////////////////요기서부터 다시해야함



document.querySelector('.left_btn').addEventListener('click' , () => {
	let nextMonth = toDay.getMonth()-1
	let nextYear = toDay.getFullYear()
	if( nextMonth == 0 ){
		nextMonth = 12
		nextYear--
		toDay.setYear( nextYear  )
	}
	toDay.setMonth( nextMonth  )
	
	monthmove(  )
})

document.querySelector('.right_btn').addEventListener('click' , () => {
	let nextMonth = toDay.getMonth()+1
	let nextYear = toDay.getFullYear()
	if( nextMonth == 13 ){
		nextMonth = 1
		nextYear++
		toDay.setYear( nextYear  )
	}
	toDay.setMonth( nextMonth  )
	
	monthmove( )
})

monthmove()

/////////////////////////////////////////////////////////////////////

let reservation = []
예약출력()

function reply_click(clicked_id)
  {
      	document.getElementById('when').innerHTML = clicked_id
      	console.log(clicked_id)
  }


function 예약등록() {

	const board = {
		name 	: 	document.getElementById('name').value ,
		phone	: 	document.getElementById('phone').value  ,
		people	:	document.getElementById('people').value ,
		when	:	document.getElementById('when').innerHTML 
	}
	
	if( document.getElementById('name').value ==""){
		alert('성함을 입력해주세요')
		document.getElementById('name').value = '' 
		document.getElementById('phone').value = ''
		document.getElementById('people').value = ''
		document.getElementById('when').value = ''
		return // 함수 종료
	}else if(document.getElementById('phone').value ==""){
		alert('휴대폰 뒷자리를 입력해주세요')
		document.getElementById('name').value = '' 
		document.getElementById('phone').value = ''
		document.getElementById('people').value = ''
		document.getElementById('when').value = ''
		return
	}else if(document.getElementById('people').value ==""){
		alert('인원수를 입력해주세요')
		document.getElementById('name').value = '' 
		document.getElementById('phone').value = ''
		document.getElementById('people').value = ''
		document.getElementById('when').value = ''
		return
	}
	
	
	
	reservation.push(board)
	alert('예약 되었습니다.')
	console.log(reservation)

	document.getElementById('name').value = ''    // 점수 입력 후 등록한 뒤에, 다시 입력할 수 있게끔 공백처리
	document.getElementById('phone').value = ''
	document.getElementById('people').value = ''
	document.getElementById('when').value = ''

	예약출력()
}



function 예약출력(){
   //1. 변수에 html태그[문자열]를 저장하기
   let html=   '<tr>'+ //여기는 + 전부 빼고 문자열 하나로 이어줘도됨
               '<th>성함</th>'+
               '<th>휴대폰 뒷자리</th>'+
               '<th>인원수</th>'+
               '<th>비고</th>'+
          	   '</tr>'
   //배열내 데이터를 하나씩 꺼내기 -> 객체 정보를 html 화         

     
for( let i = 0 ; i<reservation.length ; i++){
      html += '<tr>'+ 
               '<th>'+reservation[i].name+'</th>'+
               '<th>'+reservation[i].phone+'</th>'+
               '<th>'+reservation[i].people+'</th>'+
               '<th><button onclick="예약삭제('+i+')">삭제</button></th>'+
            '</tr>'
		}
   document.getElementById('list').innerHTML = html   
} 



function 예약삭제(i){
	alert( reservation[i].name + '의 예약 취소합니다..')
	reservation.splice( i , 1 )	// 화면에 표시되는 것은 HTML이므로 데이터상 삭제가 되었지만. 학생출력 함수를 다시 호출 ()업데이트)
	예약출력()
}
