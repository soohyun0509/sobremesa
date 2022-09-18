package 호텔;

import java.util.Scanner;

public class Page {
//화면출력
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Page page =new Page();
		page.mainpage();
	}
	
	//1. 메인화면 출력
	void mainpage() {
		System.out.println(" >>> 호텔 페이지 <<<  ");
		System.out.print("1. 회원가입 2. 로그인 3. 관리자  선택 : "); 
	}
	//2. 회원가입 화면 출력
	void p_signup() {
		
	}
	//3. 로그인 화면 출력
	void p_login() {
		
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
