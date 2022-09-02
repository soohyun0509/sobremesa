/**
 1. 학생들 점수 받아야함
 		-받을 데이터 객체에 담기 
 		-HTML에서 입력된 데이터 받아와야함
 		-배열에 계속 담아줘야함
 		
 2. 버튼 누르면 저장되게
	-이름 중복체크
3. 화면에 등록된 학생들 출력
 */

let studentlist=[ ]
학생출력()

function 점수등록(){
	const student={
		name: document.getElementById('name').value,
		kor: Number(document.getElementById('kor').value),
		eng: Number(document.getElementById('eng').value),
		mat: Number(document.getElementById('mat').value),
		avg: ''
	}
	
	if(이름중복체크(student.name)){
		return
		
	}
	
	//배열에 추가해줘야함
	studentlist.push(student)
	
	alert('점수 등록이 완료됐습니다.')
	console.log(studentlist)
	
	document.getElementById('name').value=''
	document.getElementById('kor').value=''
	document.getElementById('eng').value=''
	document.getElementById('mat').value=''
	
	학생출력()
}

function 이름중복체크(name){
	for(let i=0; i<studentlist.length; i++){
		if(studentlist[i].name === name){
			alert('이미 등록된 이름입니다.')
			return true
		}
		return false
	}
}

function 학생출력(){
	let html=`<tr><th>등수</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th></tr>`
	
	
	
	
	for(let i=0; i<studentlist.length; i++){
		let sum=studentlist[i].kor + studentlist[i].eng + studentlist[i].mat
		let avg= sum/3
		studentlist[i].avg=avg
		
		
		html += '<tr>'+
					'<th>등수</th>'+
					'<th>'+studentlist[i].name+'</th>'+
					'<th>'+studentlist[i].kor+'</th>'+
					'<th>'+studentlist[i].eng+'</th>'+
					'<th>'+studentlist[i].mat+'</th>'+
					'<th>'+sum+'</th>'+
					'<th>'+avg+'</th>'+
					'<th><button onclick="삭제('+i+')">삭제</button></th>'+
				'</tr>'
		
		console.log(studentlist[i].avg)		
		if(studentlist[i+1]){
			let blank=''
			if(studentlist[i+1].avg <= studentlist[i].avg){
					alert('dd')
					blank= studentlist[i]
					studentlist[i]= studentlist[i+1]
					studentlist[i+1]= blank
					

			}
				
			
		
		}	
				
		
	}
	
	document.getElementById('listtable').innerHTML= html
	
}

function 삭제(a){
	alert(studentlist[a].name+'의 점수를 삭제합니다.')
	studentlist.splice(a, 1)
	학생출력()
	
	
}


