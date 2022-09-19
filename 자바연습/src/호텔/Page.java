package 호텔;

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
		
		boolean result= controller.login(id, password);
		if(result) {System.out.println("로그인 성공");}
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
		
	}
	//7. 객실등록 화면 출력
	void p_room_regist() {
		
	}
	//8. 객실삭제 화면 출력
	void p_room_delete() {
		
	}
	//9. 예약현황 화면 출력
	void p_getReservelist() {
		
	}
	
	//10. 모든 객실 리스트 화면 출력
	void p_getRoomlist() {
		
	}
	
	
	
}
