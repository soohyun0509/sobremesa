const date = new Date()
//Mon Aug 01 2022 00:00:00 GMT+0900 (한국 표준시)
const currentYear = date.getFullYear()
const currentMonth = date.getMonth()+1
const currentDate = date.getDate()
let startDay = new Date( currentYear , currentMonth-1 , 1 ) // 그 달의 01 일

const monthDays = document.querySelector('.days')

monthmove() // 함수 최초 실행

function monthmove(){
	let lastDay = new Date( startDay.getFullYear() , startDay.getMonth()+1 , 0 ).getDate()  //그 달의 마지막날
	let day = startDay.getDay()	// 1일의 요일
		
	let days =""
	// 매달 1일의 요일 전까지 공백찍기 
	for(let i = 1 ; i <= day ; i++){
	      days += `<div></div>`
	      monthDays.innerHTML = days
	}
	
	// 1 ~ 마지막날까지 일 출력 
	for(let i = 1 ; i <= lastDay ; i++){
		let reserveDay= startDay.getFullYear()+'-'+startDay.getMonth()+'-'+i
	  	days += `<div>${i}일
				     <ul>
				        <li><button id="${reserveDay}" class="dinner" onClick="printReserve(this.id)">Dinner</button></li>
				     </ul>
			   </div>`
	    monthDays.innerHTML = days
	}

	
	const months = [
		"1월 January","2월 February", "3월 March", "4월 April", "5월 May",	"6월 June",
		"7월 July","8월 August","9월 September","10월 October","11월 November","12월 December"
	]
		
	document.querySelector('.monthTitle').innerHTML = months[ startDay.getMonth() ]
	document.querySelector('.yearTitle').innerHTML = startDay.getFullYear()  
}

// 지난달 , 다음달 달력 출력
document.querySelector('.left_btn').addEventListener('click' , () => {
	let beforeMonth = startDay.getMonth()-1
	let beforeYear = startDay.getFullYear()
	if( beforeMonth == 0 ){ // 계속 누르다가 0 되면 작년으로 넘어가기
		beforeMonth= 12
		beforeYear--
		startDay.setYear(beforeYear)
	}
	startDay.setMonth( beforeMonth  )
	monthmove()
})

document.querySelector('.right_btn').addEventListener('click' , () => {
	let nextMonth = startDay.getMonth()+1
	let nextYear = startDay.getFullYear()
	if( nextMonth == 13 ){ // 계속 누르다가 13되면 내년으로 넘어가기
		nextMonth= 1
		nextYear++
		startDay.setYear(nextYear)
	}
	startDay.setMonth(nextMonth)
	monthmove()
})


// 예약화면 출력 함수
function printReserve(cal_day){
	
	let html='<h3 class="reserve_title">< SOBREMESA Reservation ></h3>'+
			'<div class="reserveBox">'+
				'예약자명<input type="text" class="r_name"><br>'+
				'핸드폰번호<input type="text" class="r_phone"><br>'+
				'예약날짜<input readonly="readonly" type="text" class="r_date"><br>'+
				'인원수<input type="text" class="r_size"><br>'+
			 '</div>'+
			 '<button class="reserve_btn" onclick="reserve()">예약하기</button>'	
			 
	document.querySelector(".cal").innerHTML=html;
	document.querySelector(".r_date").value=cal_day;
}


// 해당 날짜 누르면 새로 jsp 열어서 가던가 해야할듯
// cal
function reserve(){
	
	let data={
		name: document.querySelector(".r_name").value,
		phone: document.querySelector(".r_phone").value,
		r_date: document.querySelector(".r_date").value,
		r_size: document.querySelector(".r_size").value,
	}
	
	$.ajax({
		url:"/sobremesa_personal/page/reserve",
		data: data,
		type:"post",
		success : re=>{
			if(re=='true'){
				document.querySelector(".cal").innerHTML
					+='<div>예약이 완료됐습니다.<br> 취소문의는 예약 2일전까지 전화로 부탁드립니다.</div>'
				setTimeout(()=>{location.reload()},2000)
			
			}
		}
		
	})
}


