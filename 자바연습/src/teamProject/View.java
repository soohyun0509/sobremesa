package teamProject;

import java.util.Scanner;

public class View {
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		View view = new View();
		view.v_mainGame();
		
	}// main end
	
	//게임 출력시킬 메소드
	void v_mainGame() {
		while(true) {
			aturn();
			bturn();
		}//while end
	}//v_mainGame end
	
	
	//게임보드판 출력 메소드
	void v_gameBoard() {
		v_location(); // 게임말 위치 출력
	}//v_gameBoard end
	
	//플레이어들 위치 보드판에 출력
	void v_location() {
		
	}
	
	//플레이어A 차례->조건 만족하면 나와서 bturn으로 넘어가게..!
	void aturn() {
		while(true) {
			System.out.println("A턴");
			v_gameBoard();// 게임판 출력
			v_dice();// 주사위 굴리기
			v_buy(); // 땅 구매여부 화면
			break;
		}
	}
	
	//플레이어B 차례
	void  bturn() {
		while(true) {
			System.out.println("B턴");
			v_gameBoard();// 게임판 출력
			v_dice();// 주사위 굴리기
			v_buy(); // 땅 구매여부 화면
			break;
		}
		
	}
	
	// 주사위 화면 출력
	void v_dice() {
		
	}//v_dice end
	
	//땅 구매여부 화면 출력
	void v_buy() {
		
	}//v_buy end
	
	//플레이어 이동한 위치에 따른 이벤트출력
	void event() {
		//여기서 if문으로 무인도,황금열쇠,올림픽,출발칸 각각 확인하고
		// 아니면 그냥 땅 구매쪽으로 넘어가게?
	}
	
	
}//class end
