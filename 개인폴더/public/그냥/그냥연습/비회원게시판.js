/**

1.html에 입력된 데이터 js에 호출
2.이 정보를 객체에 저장
3. 글등록을 누를때마다 매번 새롭게 추가로 저장되어야함(배열에 추가)
4. 저장된 객체를 글목록 페이지에 표시


 
 */

let boardlist=[ ]
글목록()


function upload(){
		
	let $bwriter= document.getElementById('bwriter').value
	let $bpassword= document.getElementById('bpassword').value
	let $btitle= document.getElementById('btitle').value
	let $bcontent= document.getElementById('bcontent').value
	
	let board={
		작성자: $bwriter,
		비밀번호: $bpassword,
		제목: $btitle,
		내용: $bcontent
	}
	
	boardlist.push(board)
	document.getElementById('bwriter').value=''
	document.getElementById('bpassword').value=''
	document.getElementById('btitle').value=''
	document.getElementById('bcontent').value=''
	
	글목록()
}

function 글목록(){
	let html=`<tr>	<th>번호</th><th>제목</th><th>작성자</th>	</tr>`
				//이럴쥬가 <= 부등호 이렇게 넣었다고 안되기있음이야...? 우으에
				//응 있음이었어...인덱스가 아니라 길이만큼이니까 이하면 안됨!
	for(let i=0; i<boardlist.length; i++){
		html+= '<tr> <th>'+ i +'</th><th><a href="#" onclick="게시물보기('+i+')">'+ boardlist[i].제목 +'</a> </th><th>'+boardlist[i].작성자 +'</th> </tr>'
	//html += `<tr><th>${i}</th><th>${boardlist[i].제목}</th><th>${boardlist[i].작성자}</th></tr>`
		
	}
	document.getElementById('boardlist').innerHTML= html
}

















