package 개인;

import java.util.ArrayList;
import java.util.Scanner;

//문제
//아이디 확인없이 예약자명만 입력하면 체크인 가능..
//아예 그냥 로그인 한 아이디로 예약한 애들이 다 뜨게 하는게 나을것같은데..어떻게...?
//객실수정시 다른거넣어도 수정완료표시됨

public class Page {
//화면출력
	
	Scanner scanner = new Scanner(System.in);
	static Page page =new Page();
	static Controller controller= new Controller();
	
	public static void main(String[] args) {
		Page page =new Page();
		page.mainpage();
	}
	
	//1. 메인화면 출력
	void mainpage() {
		while(true) {
		System.out.println(" >>> 호텔 페이지 <<<  ");
		System.out.print("1. 회원가입 2. 로그인 3. 관리자  선택 : "); int btn=scanner.nextInt();
		
		if(btn==1) {p_signup();}
		else if(btn==2) {p_login();}
		else if(btn==3) {p_managerpage();}
		else {System.out.println("잘못된 번호입니다.");}
		
		}// while end
	}//mainpage end
	//2. 회원가입 화면 출력
	void p_signup() {
		System.out.println(" >>> 회원가입 페이지 <<< ");
		System.out.print("사용할 아이디 입력 : "); String id=scanner.next();
		System.out.print("사용할 비밀번호 입력 : "); String password=scanner.next();
		System.out.print("성명 입력 : "); String name=scanner.next();
		System.out.print("휴대폰번호 입력(-제외) : "); String phone=scanner.next();
		
		boolean result= controller.signup(id, password, name, phone);
		if(result) {System.out.println("회원가입이 완료됐습니다.");}
		else {System.out.println("회원가입 실패");}
	}
	//3. 로그인 화면 출력
	void p_login() {
		System.out.println(" >>> 로그인 페이지 <<< ");
		System.out.print("아이디 입력 : "); String id=scanner.next();
		System.out.print("비밀번호 입력 : "); String password=scanner.next();
		
		boolean result= controller.login(id, password);
		if(result) {
			System.out.println("로그인 성공");
			while(true) {
				System.out.println(" >>> 회원 페이지 <<< ");
				System.out.print("1. 예약하기 2. 웹 체크인 3.메인화면 돌아가기 선택 : "); int btn=scanner.nextInt();
				if(btn==1) {p_room_reserve();}
				else if(btn==2) {p_checkin();}
				else if(btn==3) {break;}
			}//로그인 화면 while end
		}// 로그인 성공 end
		else {System.out.println("로그인 실패");}
	}
	
	//6. 관리자 화면 출력
	void p_managerpage() {
		System.out.print("관리자 아이디 입력 : "); String id=scanner.next();
		if(id.equals("admin")) {
			while(true) {
				System.out.println(" >>> 관리자 페이지 <<< ");
				System.out.print("1. 객실등록  2. 객실삭제 3.객실수정 4.예약현황 5.메인화면 돌아가기 선택  : "); int btn=scanner.nextInt();
				if(btn==1) {p_room_regist();}
				else if(btn==2) {p_room_delete();}
				else if(btn==3) {p_roomUpdate();}
				else if(btn==4) {p_getReservelist();}
				else if(btn==5) {break;}
			}//while end
		}//if end
		else {System.out.println("로그인 실패");}
		
	}// 관리자화면 메소드 end
	
	//4. 객실예약 화면 출력
	void p_room_reserve() {//날짜 설정도 추가해줄까...무리무리 나중에 추가하자 객실등록때도 날짜줘야돼서 일이 커진다...
		p_getRoomlist();
		System.out.println("예약자(실투숙자) 성명 : "); String name=scanner.next();
		System.out.print("예약할 객실 타입 : "); String type=scanner.next();
		System.out.print("객실 수 : ");		int amount=scanner.nextInt();
		
		boolean result= controller.room_reserve(0,amount,name,type);
		if(result) {System.out.println("예약 성공 했습니다.");}
		else {System.out.println("예약이 완료되지 못했습니다.");}
	 
		
	}
	//5. 체크인 화면 출력
	void p_checkin() {
		System.out.print("예약자명 입력 : "); String name=scanner.next();
		
		ArrayList<R_listDTO> result = controller.checkInlist(name);
		if(result.size()<=0) {System.out.println("해당 이름으로 예약된 건이 없습니다."); return;}
		System.out.println("예약번호\t예약자명\t객실타입\t객실수");
		for(R_listDTO list : result) {
			System.out.println(list.reserve_no+"\t"+list.name +"\t"+ list.type +"\t"+ list.amount);
		}	
		System.out.println("체크인할 예약번호를 입력해주세요"); int ch=scanner.nextInt();
		boolean result2=controller.checkIn(ch);
		if(result2) {System.out.println("체크인 완료했습니다.(객실호수) 프론트에 방문해 키를 받아주세요");}
		else {System.out.println("체크인에 실패했습니다.");}
	}
		
	//7. 객실등록 화면 출력
	void p_room_regist() {
		System.out.print("객실 타입 : "); String type=scanner.next();
		System.out.print("객실 가격 : "); int price=scanner.nextInt();
		System.out.print("객실 개수 : "); int amount=scanner.nextInt();
		
		boolean result = controller.room_regist(type, price, amount);
		if(result) {System.out.println("객실 등록 완료했습니다.");}
		else {System.out.println("객실 등록 실패했습니다. 다시 시도해주세요");}
		
	}//객실 등록 화면 end
	
	//8. 객실삭제 화면 출력
	void p_room_delete() {
		p_getRoomlist();
		System.out.print("삭제할 객실 타입 : ");	String type=scanner.next();
		
		boolean result=controller.room_delete(type);
		if(result) {System.out.println("선택한 객실이 삭제됐습니다.");}
		else {System.out.println("객실 삭제 실패!");}
		
	}//객실 삭제 끝
	
	
	//9. 예약현황 화면 출력
	void p_getReservelist() {
		ArrayList<R_listDTO> result = controller.getReservelist();
		System.out.println(" >>> 예약 현황 <<< ");
		for(R_listDTO dto : result) {
			System.out.println("예약번호\t예약자명\t객실타입\t객실수");
			System.out.println(dto.reserve_no+"\t"+dto.name +"\t"+ dto.type +"\t"+ dto.amount);
		}
	}
	
	//10. 모든 객실 리스트 화면 출력
	void p_getRoomlist() {
		ArrayList<RoomDto> result= controller.getRoomlist();
		System.out.println(" >>> 등록된 객실 <<< ");
		for(RoomDto dto : result) {
			System.out.print("객실타입: " + dto.type +"\t가격 : " +dto.price+ "\t잔여 : " +dto.amount+"\n");
		}
	}// 객실 리스트 end
	
	//객실 수정 화면
	void p_roomUpdate() {
		p_getRoomlist();
		System.out.println("수정할 객실타입을 입력해주세요"); String type=scanner.next();
		System.out.println("가격 : "); int price=scanner.nextInt();
		System.out.println("개수 : "); int amount=scanner.nextInt();
		
		boolean result = controller.roomUpdate(type,price,amount);
		System.out.println(result);
		if(result) {System.out.println("객실 수정 완료했습니다.");}
		else {System.out.println("객실 수정에 실패했습니다.");}
	}
	
}//class end
