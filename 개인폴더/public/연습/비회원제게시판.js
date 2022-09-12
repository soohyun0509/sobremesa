/*

	비회원제게시판
		1. 글쓰기 페이지에 작성
		2. 글 등록 버튼 누르기 -> 작성내용이 배열or객체에 저장 -> 글목록에 표시
		3. 글 목록에 제목누르면 선택한 게시물 볼 수 있게(중복없는 어떤것을 찾아야됨!!)
*/
let boardlist=[]
listup()

function clickbtn(){
	let board={
		writer: document.querySelector('.writer').value,// 이게 밖에(전역변수로) 선언하면 안되던데 왜그런걸까...
		password: document.querySelector('.password').value,
		content: document.querySelector('.content').value,
		title: document.querySelector('.title').value
	
	}
	
	boardlist.push(board)
	alert('게시글 등록됐습니다.')
	
	document.querySelector('.writer').value=''
	document.querySelector('.password').value=''
	document.querySelector('.content').value=''
	document.querySelector('.title').value=''//공란 만들어주기
	
	listup()
}

function listup(){
	//번호, 제목, 작성자
	let table=`<tr><th>번호</th><th>제목</th><th>작성자</th></tr>`
	
	for(let i=0; i<boardlist.length; i++){
		
		table+=`<tr><th>${i+1}</th><th><a href="#" onclick=openboard(${i})>${boardlist[i].title}</a></th><th>${boardlist[i].writer}</th></tr>`
	}
	document.querySelector('.list').innerHTML=table

}

function openboard(a){
	document.querySelector('.ptitle').innerHTML= boardlist[a].title
	document.querySelector('.pwriter').innerHTML= boardlist[a].writer
	document.querySelector('.pcontent').innerHTML= boardlist[a].content
	
	let delbtn=`<button onclick=cancel(${a})>삭제하기</button>`
	document.querySelector('.btn').innerHTML= delbtn
}

function cancel(a){
	boardlist.splice(a, 1)
	alert('삭제되었습니다.')
	console.log(boardlist)
	
	//게시글보기 공란만들어주고 목록도 새로고침
	document.querySelector('.ptitle').innerHTML=''
	document.querySelector('.pwriter').innerHTML=''
	document.querySelector('.pcontent').innerHTML=''
	
	listup()
}



