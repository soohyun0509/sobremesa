package teamProject.controller;

public class NationController {
	
	//전체 나라 가져오는 로직
	public ArrayList<NationDTO> getNations(){
		return null;
	}
	
	//이동한 땅의 주인 존재 여부 확인 로직(1: 플레이어1 땅 / 2: 플레이어2 땅 / null: 땅 주인 없음)
	int isExistLandlord(int land_no) {
		return 0;
	}
	
	//땅 구매 로직
	boolean buyLand(int player, int land_no) {
		return false;
	}
	
	//특정 땅의 세금비용을 가져오는 로직
	int getTax(int land_no) {
		return 0;
	}
	
	//올림픽 개최 로직
	boolean hostingOlympics(int land_no) {
		return false;
	}
	
	//올림픽 폐막 로직
	boolean closingOlympics(int land_no) {
		return false;
	}
	
	boolean isMyland(int player, int land_no) {
		return false;
	}
	
	//땅 매각 로직
	boolean saleLand(int player, int land_no) {
		return false;
	}
}
