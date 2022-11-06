printPicture(1)

const divs=document.querySelectorAll('.divs')
const tds=document.querySelectorAll('td')
const imgs=document.querySelectorAll('.img')

function printPicture(page){
	let randList=[]
	while(true){
		let rand=Math.floor((Math.random()*20)+1)
		if(randList.indexOf(rand)==-1){
			randList.push(rand)
		}
		if(randList.length==20){break;}
	}
	console.log(randList)
	let html=""
	for(let i=1; i<=5; i++){
		html+='<tr class="g_imgs_col'+i+'">'
		for(let j=1; j<=4; j++){
		html+='<td>'+
				'<div>'+
					'<img class="img" alt="" src="/sobremesa_personal/image/g_imgs/g_img'+randList[(i*j)-1]+'.jpg"></img>'+
					'<a href="https://www.instagram.com/" class="divs">인스타 상세페이지로<br> 이동합니다.<span class="content_icon"></span></a>'+
				'</div>'+
			'</td>'
		}
	
		html+='</tr>'
	}
	
	document.querySelector(".gallery_imgs").innerHTML=html
	for(let i=1; i<=5; i++){
		if(i==page){continue;}
		document.querySelector(".current"+i).style.fontSize="35px";
		document.querySelector(".current"+i).style.color="#8D93AB";
	}
	
	document.querySelector(".current"+page).style.fontSize="45px";
	document.querySelector(".current"+page).style.color="black";
	
	
}


tds.forEach((td, index)=>{
	tds[index].addEventListener('mouseover',()=>{
		divs.forEach((div,div_i)=>{
			imgs.forEach((img,img_i)=>{
				if(index==div_i && div_i==img_i){
					div.style.display='block'
					img.style.opacity='0.2'
					
				}
			})
		})
		
	})
	
	tds[index].addEventListener('mouseout',()=>{
		divs.forEach((div,div_i)=>{
			imgs.forEach((img,img_i)=>{
				if(index==div_i && div_i==img_i){
					div.style.display='none'
					img.style.opacity='1'
				}
			})
		})
		
	})
	
})