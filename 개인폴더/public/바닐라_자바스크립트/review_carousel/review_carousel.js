/**

		review carousel
		캐러셀이라는걸 처음 들어봤어
		화면 페이지 전환 시키는건가봐
		일단 css작성이 꽤 걸렸는데 그게 문제가 아니라 어떻게 해야될지 감도 안잡힘...
		처음해보는거니까 다른 사람들 코드를 좀 참고해야겠다
		
		1. 일단 바뀌게 할 항목을 배열에 담든 객체에 담든 해야할듯
		2. 변화 줄 부분 문서객체로 가져와야돼
		3. 버튼 누르면 변화되게 이벤트함수생성

 */
 //이 배열 선언하는거 부터가 난항이다...
let content=[
	{
		name : "Sara Jones",
		job: "UX DESIGNER",
		img: "img/person1.jpg",
		coment: `Aenean iaculis dapibus sodales. Nulla id malesuada risus, id aliquet orci.
				 Integer porttitor elit diam, ut auctor ipsum suscipit nec. 
				 Etiam in nisl sit amet orci sagittis dictum vel sit amet purus. 
				 In nec lectus non metus hendrerit mattis eu sit amet sapien. Morbi at velit dui. 
				 Donec et dictum dolor. Duis ultrices nisl quis sapien pellentesque suscipit. 
				 Vestibulum mauris ipsum, imperdiet ut commodo nec, convallis ac metus.`,
	},
	{
		name : "Susna Smith",
		job: "Manneger",
		img: "img/person2.jpg",
		coment: `At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis
				praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias
				excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui
				officia deserunt mollitia animi, id est laborum et dolorum fuga. 
				omnis dolor repellendus.Itaque earum rerum
				hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias
				consequatur aut perferendis doloribus asperiores repellat.`,
	},
	{
		name : "Anna Johnson",
		job: "WEB DESIGNER",
		img: "img/person3.jpg",
		coment: `On the other hand, we denounce with righteous indignation and 
				dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, 
				so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; 
				and equal blame belongs to those who fail in their duty through weakness of will, 
				when our power of choice is untrammelled and when nothing prevents our being able to do what we like best,`,
	},
	{
		name : "Peter John",
		job: "WEB DEVELOPER",
		img: "img/person4.jpg",
		coment: `Suspendisse finibus feugiat aliquam. Phasellus dignissim, lectus at gravida sodales, 
				nisl purus sagittis leo, sed sagittis tortor lacus at diam. Praesent eros massa, 
				pulvinar vel mauris in, rhoncus pretium nisl. Donec tincidunt id risus a aliquet. 
				Etiam faucibus libero nec purus aliquam, nec finibus ex maximus. Cras at mattis sapien.
		 		`,
	},
	{
		name : "Harry poter",
		job: "WIZARD",
		img: "img/person5.jpg",
		coment: `Suspendisse fringilla nulla dolor, ac pretium ligula pharetra sit amet. Donec purus nisi, 
		 		commodo nec vehicula eu, sollicitudin sit amet velit. Ut nulla eros, semper eu libero vel,
		  		elementum egestas ipsum. Aenean tincidunt tortor dui, dictum viverra eros laoreet vitae. In magna ipsum, 
				feugiat eu lorem a, venenatis dapibus erat. Pellentesque id sollicitudin ante.`,
	}
]

let img= document.querySelector('.img')
let name= document.querySelector('.name')
let job= document.querySelector('.job')
let coment= document.querySelector('.coment')

let leftbtn= document.querySelector('.icon_left')
let rightbtn= document.querySelector('.icon_right')

let currentpage=0; // 현재 페이지 표시 인덱스(왔다갔다 거릴때 기준페이지 줘야지)
let count=0;

//배열안에 객체 넣고 객체 속성불러올때!
//name.innerHTML=** content[0].name **

leftbtn.addEventListener('click',()=>{
	if(count>currentpage && count<content.length){
		count--
		name.textContent=content[currentpage+count].name
		img.src=content[currentpage+count].img
		job.textContent=content[currentpage+count].job
		coment.textContent=content[currentpage+count].coment
		
	}
	//name.textContent=content[currentpage+count].name 이게 계속 오류 뜨네...
	//카운트 content.length 넘어가면 이거 오류 되는데 뭐가 문제니 대체 if문도 해줬자나...
	//됐다...숫자계산을 잘못했었나봐 count<content.length-1
	
})

rightbtn.addEventListener('click',()=>{
		if(count<content.length-1){
			count++
			name.textContent=content[currentpage+count].name
			img.src=content[currentpage+count].img
			job.textContent=content[currentpage+count].job
			coment.textContent=content[currentpage+count].coment
			
		}
})






