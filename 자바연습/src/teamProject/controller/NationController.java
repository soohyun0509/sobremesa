package teamProject.controller;

import teamProject.model.DAO.NationDAO;

public class NationController {
	
	//전체 나라 가져오는 로직
	public ArrayList<NationDTO> getNations(){
		return null;
	}
	
	//수현 - 이동한 땅의 주인 존재 여부 확인 로직(1: 플레이어1 땅 / 2: 플레이어2 땅 / null: 땅 주인 없음)
	public int isExistLandlord(int n_no) {
		return NationDAO.getInstance().isExistLandlord(n_no);
		//반환 p_no
		// DAO 메소드에 public 안적으면 왜 오류...?
	}
	
	//수현 - 땅 구매 로직
	public boolean buyLand(int player, int n_no) {
		
		int n_price=NationDAO.getInstance().getLandPrice(n_no);
		int p_money=NationDAO.getInstance().getPlayerMoney(player);
		if(n_price!=0 && n_price <=p_money) {
			// n_price가 0이면 db가져오는거 실패! 내 자산이 더 많으면 아래 메소드 실행
			return NationDAO.getInstance().buyLand(player,n_no);
		}
		return false;
		//근데 자산은 잘못가져와도 0이고 진짜 자산이 0일때도 0이라 어떻게 구분해야할지...
		
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
