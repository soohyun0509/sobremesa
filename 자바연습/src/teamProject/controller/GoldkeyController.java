package teamProject.controller;

public class GoldkeyController {
	//황금 열쇠 뽑기 로직
	GoldkeyDTO getGoldKey(int player, int goldkey_no) {
		return null;
	}
	
	//황금 열쇠 사용 로직
	boolean useGoldKey(int c_no) {
		//황금 열쇠 사용여부 수정 로직
		//황금열쇠 번호 받아와서 사용
		return false;
	}
	
	//소유하고 있는 황금열쇠 목록 가져오기 로직
	GoldkeyDTO goldKeyList(int player) {
		return null;
	}
	
	//현금 지불 로직
	boolean payCash(int player, int cash) {
		return false;
	}
	
	//무인도 - 2턴 쉼 로직
	boolean moveDesertIsland(int player) {
		return false;
	}
	
	//무인도 탈출 시도 성공 로직
	boolean escapeSuccess(int player) {
		return false;
	}
	
	//무인도 탈출 시도 실패 로직
	boolean escapeFail(int player) {
		return false;
	}
}
