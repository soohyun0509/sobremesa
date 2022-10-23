
let customers=[]

출력()


function 데이터저장(){
	const customer={
		
		type: document.querySelector('.form_type').value,
		title: document.querySelector('.form_title').value,
		content: document.querySelector('.form_content').value,
		phone: document.querySelector('.form_phone').value,
	}
	alert('저장완료')
	
	customers.push(customer)
	console.log(customer.phone)
	
	
	document.querySelector('.form_title').value=''
	document.querySelector('.form_content').value=''
	document.querySelector('.form_email').value=''
	document.querySelector('.form_phone').value=''
	
	
	출력()
	
}


function 출력(){
	let html=`<tr><th><a href='#''>순번</a></th><th><a href='#'>문의유형</a></th><th><a href='#'>제목</th></a></tr>`
	
	for(let i=0; i<customers.length; i++){
		html+=`	<tr>
					<th><a href='#' onclick='펼치기(${i})'>${[i+1]}</a></th>
					<th><a href='#' onclick='펼치기(${i})'>${customers[i].type}</a></th>
					<th><a href='#' onclick='펼치기(${i})'>${customers[i].title}</a></th>
				</tr>`
	}
	
	document.querySelector('.result').innerHTML= html
}



function 펼치기(i){
	document.querySelector('.js_title').innerHTML= customers[i].title
	document.querySelector('.js_content').innerHTML= customers[i].content
	document.querySelector('.js_phone').innerHTML= customers[i].phone
	
	
}



