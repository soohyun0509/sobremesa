package 호텔;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		if(btn==1) {page.p_signup();}//if end
		else if(btn==2) {page.p_login();}// else if end
		else if(btn==3) {page.p_managerpage();}//else if end
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
		
		CustomerDto result= controller.login(id, password);
		if(result!=null && result.id.equals(id) && result.password.equals(password)) {
			System.out.println("로그인 성공");
			while(true) {
				System.out.println(" >>> 회원 페이지 <<< ");
				System.out.print("1. 예약하기 2. 웹 체크인 3.메인화면 돌아가기 선택 : "); int btn=scanner.nextInt();
				
				if(btn==1) {
					//10. 모든 객실 리스트 화면 출력
					page.p_getRoomlist();
				}//예약하기 종료
				else if(btn==2) {
					System.out.print("예약자명 입력 : "); String name=scanner.next();
					System.out.print("휴대폰번호 입력 : "); String phone=scanner.next();
				}//웹체크인 종료
				else if(btn==3) {break;}
			}//로그인 화면 while end
		
		
		}// 로그인 성공 end
		else {System.out.println("로그인 실패");}
		
		
	}
	//4. 객실예약 화면 출력
	void p_room_reserve() {
		
	}
	//5. 체크인 화면 출력
	void p_checkin() {
		
	}
	//6. 관리자 화면 출력
	void p_managerpage() {
		System.out.print("관리자 아이디 입력 : "); String id=scanner.next();
		if(id.equals("admin")) {
			while(true) {
				System.out.print("1. 룸 등록 / 2, 룸 삭제 3. 예약 상황 4. 룸 현황  5.메인화면 돌아가기 선택  : "); int btn=scanner.nextInt();
				if(btn==1) {page.p_room_regist();}//객실등록 종료
				else if(btn==2) {page.p_room_delete();}//객실삭제 종료
				else if(btn==3) {page.p_getReservelist();}//예약현황 종료
				else if(btn==4) {page.p_getRoomlist();}//룸 현황 종료
				else if(btn==5) {break;}
			}//while end
		}//if end
		else {System.out.println("로그인 실패");}
		
	}// 관리자화면 메소드 end
	//7. 객실등록 화면 출력
	void p_room_regist() {
		System.out.print("객실 타입 : "); String type=scanner.next();
		System.out.print("객실 가격 : "); String price=scanner.next();
		System.out.print("객실 개수 : "); int num=scanner.nextInt();
		
		boolean result = controller.room_regist(type, price, num);
		if(result) {System.out.println("객실 등록 완료했습니다.");}
		else {System.out.println("객실 등록 실패했습니다. 다시 시도해주세요");}
		
	}//객실 등록 화면 end
	
	//8. 객실삭제 화면 출력
	void p_room_delete() {
		
		
	}
	//9. 예약현황 화면 출력
	void p_getReservelist() {
		
	}
	
	//10. 모든 객실 리스트 화면 출력
	void p_getRoomlist() {
		ArrayList<RoomDto> result= controller.getRoomlist();
		for(RoomDto dto : result) {
			System.out.print("객실타입: " + dto.type +"\t가격 : " +dto.price+ "\t잔여 : " +dto.num+"\n");
		}
		
		
	}
	
	
	
}
