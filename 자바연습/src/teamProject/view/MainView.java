package teamProject.view;

import java.util.ArrayList;
import java.util.Scanner;

import teamProject.controller.NationController;

import teamProject.controller.PlayerController;
import teamProject.model.DTO.NationDTO;

//메인 뷰 클래스
public class MainView {
	Scanner sc = new Scanner(System.in);		//입력 객체
	int whoIsTurn = 0;							//p_turn이 0인 p_no을 저장하는 변수
	int count = 0;								//전체 턴 수(30 초과시 게임 종료)
	int player1Pause = 0;						//플레이어1의 무인도에 갖힌 턴
	int player2Pause = 0;						//플레이어2의 무인도에 갖힌 턴
	
	NationController nCon = new NationController();
	PlayerController pCon = new PlayerController();
	public static void main(String[] args) {
		new MainView().play();
		
	}
	
	//1. 게임 실행 메소드
	void play() {
		addPlayer();
		while(true) {	//count에 따라서 무한반복 종료
			showBoard();
			isExistLandlord(1,1);
			break;
		}
	}
	
	//2. 플레이어 등록 메소드 - 플레이어 이름 입력받아서 DB에 저장 [C]
	void addPlayer() {
		//처음 시작할 때 60만원 지급
		
	}
	
	//3. 부루마블 판 출력 메소드
	void showBoard() {
		// DB에서 nation 가져와서 각 판에 출력 [R]
		// start 지점의 인덱스는 1, 총 20칸
		
		// 플레이어 게임 현황(자산, 땅 목록) 출력 [R]
		
		// 플레이어 말(흑말,백말) 표시
		int[] arrays = new int[20];
		int location = 2;
		//if (ArrayList<NationDTO> == b_no){ syso("●"); }
		System.out.println("╭─────────╮");
		System.out.println("           ");
		System.out.println(" nation[n] ");
		System.out.println(" arrays[n] ");
		System.out.println("     ●     ");
		System.out.println("           ");
		System.out.println("╰─────────╯");
		//for 세로줄 4개
		
		ArrayList<NationDTO> list=nCon.getNations();
		for(NationDTO dto : list) {
			
			System.out.print("╭─────────╮"+"\n");
			System.out.print("           "+"\n");
			System.out.print("   "+dto.getN_name()+"\n");
			System.out.print("            "+"\n"); 
			System.out.print("   "+dto.getP_no()+"\n");
			System.out.print("           "+"\n");
			System.out.print("╰─────────╯"+"\n");
		}	
	}

	//4. 주사위(1~6) 메소드
	int rollDice() {
		// 1~6의 숫자 중 랜덤한 정수 반환
		// 숫자만 보여주기
		
		return 0;
	}
	
	//5. 말 이동 메소드 [무조건 플레이어1부터 시작] [U]
	void move(int player, int num) {
		//num만큼 말 이동(+ or -)
		//단, 이동한 목적지가 출발 지점을 지났으면 그에 맞는 행동 필요
	}
	
	//수현 - 6. 이동한 땅의 주인 존재 여부 확인 메소드 [R] 
	void isExistLandlord(int player, int n_no) {
	//요기 int로 돼있었는데 반환값을 쓸곳을 못찾아서 일단 void로 바꿔놨어요!
		
		int p_turn=pCon.getWhoIsTurn();
		//플레이어번호를 어떻게 넘겨줘야하는걸까...

		//1: 플레이어1 땅 / 2: 플레이어2 땅 / null: 땅 주인 없음
		int p_no=nCon.isExistLandlord(n_no);
		
		if(p_no==0) {buyLand(player,n_no);}//땅 주인 없음
		else if(player==p_no) {return;}// 내 땅-> 차례종료 //차례종료되는데에 count++ 해줘야하나
		else {payTollFee(player,n_no);}//상대방 땅 통행료 지불
	}
	
	//수현 - 7. 땅 구매 메소드 [U] (누구 턴인지, 구매할 땅 번호) [U]
	void buyLand(int player, int n_no) {
		//플레이어 정보 가져오는 로직 실행해서 잔고 되는지 확인!
		
		boolean result= nCon.buyLand(player,n_no);
		if(result) {System.out.println("구매 완료 됐습니다.");}
		else {System.out.println("구매 실패 했습니다.");}
		
	}
	
	//8. 통행료내기 메소드 [U] (누구 턴인지, 통행료 내야하는 땅 번호) [U]
	void payTollFee(int player, int land_no) {
		//플레이어가 보유하고 있는 돈이 세금보다 적으면 매각
		
	}
	
	
	//9. 월급 및 상금 지급 메소드 [U] 10만원+
	void getPaid(int player, int pay) {
		//출발 지점으로 돌아왔는지 확인 메소드
	}
	
	//10. 현금 지불 메소드 [U]
	void payCash(int player, int cash) {
		
	}
	
	//11. 플레이어가 소유하고 있는 황금열쇠 목록 가져오기 메소드
	void goldKeyList(int player) {
		
	}
	
	//12. 플레이어가 소유하고 있는 황금열쇠 사용 메소드
	void useGoldKey(int c_no) {
		//황금열쇠 번호 받아와서 사용
		
	}
	
	//13. 황금 열쇠 뽑기 메소드 [R,U]
	void getGoldKey(int player) {
		//황금 열쇠는 랜덤 - 범위는 황금 열쇠 개수
		
	}
	
	//14. 무인도 메소드 - 2턴 쉼 [U]
	void moveDesertIsland(int player) {
		
	}
	
	//15. 무인도 탈출 시도 메소드 - 주사위가 6이 나오면 탈출, 아니면 쉬는 턴 -1 [U]
	void escapeDesertIsland(int player) {
		
	}
	
	//16. 올림픽 개최 메소드 [U]
	void hostingOlympics(int player, int land_no) {
		//이미 개최 중인 올림픽 개최지가 있으면 폐막하고
		//새로 개최할 나라(land_no)를 올림픽 개최 중으로 수정
		//만약에 플레이어가 소유하지 않은 땅에 개최하지 못하도록 조건
		
	}
	
	//17. 땅 매각 메소드 [U]
	void saleLand(int player, int land_no) {
		//황금열쇠때문에 금액을 지급해야할 때, 통행료 지불해야할 때 현재 보유 자산에서 지불금액을 차감했을 때 그 금액이 0미만이면
		//매각할 땅이 없으면 파산 = 게임종료
		//땅 매각금액 = 땅가격
		
	}
	
	//18. 전체 플레이어 삭제 메소드 [D]
	void deleteP() {
		//게임 종료 후 '게임이 종료되었습니다. 승자는 ~님입니다.' 플레이어 삭제
		
	}
	
	
	
}
//** DB **
	//player(player_no[PK],name,money,location,turn) (2명 or +bank)
	//nation(nation_no[PK],name,price,tax,olympic,player_no[FK]) -> 14개
	//goldkey(goldkey_no[PK],name,comment,player_no[FK]) 
	//[규칙] 황금키 뽑은 후 바로 사용하는게 아니라 보유 가능함!
	//[정리] 한 플레이어가 여러개의 황금키를 가지고 있을 수 있고 각 카드는 1장씩만 존재
	//[정리] 각 모서리 : 출발지점/ 황금키/ 올림픽(개최비:무료/ 통행료2배)/ 무인도
	//[논의 필요] 넣을 나라 정하기 
	//[논의 필요] 자산이 0이하일때만 매각가능 / 이때 땅없으면 파산
	//턴 횟수 제한 추가 : 모든 플레이어 한번씩 하는 것 기준 1턴 - 30턴 제한. 30턴 초과 시 자산이 많은 사람이 승자
	//땅 매각 시 가격은 땅가격과 동일

