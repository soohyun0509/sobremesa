package teamProject.controller;

public class PlayerController {
	// 플레이어 등록 로직
	boolean addPlayer(String name) {
		return false;
	}
	
	// 플레이어 정보 가져오는 로직
	PlayerDTO getPlayerInfo(int player) {
		return null;
	}
	
	// 누구 턴인지 가져오는 로직
	int getWhoIsTurn() {
		return 0;
	}
	
	// 말 이동 로직
	boolean move(int player, int num) {
		return false;
	}
	
	//통행료 내기 로직
	boolean payTollFee(int player, int land_no) {
		return false;
	}
	
	//통행료 얻기 로직
	boolean takeTollFee(int player, int tollFee) {
		return false;
	}
	
	
	//월급 및 상금 지급 로직
	boolean getPaid(int player, int pay) {
		return false;
	}
	
	//전체 플레이어 삭제 로직
	boolean deleteP() {
		return false;
	}
	
	
}