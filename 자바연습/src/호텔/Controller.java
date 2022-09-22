package 호텔;

import java.util.ArrayList;

public class Controller {
//로직 처리
	
	static Dao dao= new Dao();
	// 회원가입 메소드
	boolean signup(String id, String password, String name, String phone) {
		CustomerDto dto = new CustomerDto(id, password, name, phone);
		boolean result= dao.sign_up(dto);
		return result;
	}
	
	// 로그인 메소드
	boolean login(String id, String password) {
		
		CustomerDto result= dao.login(id, password);
		if(result!=null && result.id.equals(id) && result.password.equals(password)) {
			return true;
		}
		return false;
	}
	
	// 객실등록 메소드
	boolean room_regist(String type, String price, int num) {
		RoomDto dto= new RoomDto(type, price, num);
		boolean result=dao.room_regist(dto);
		return result;
	}
	
	// 객실삭제 메소드
	boolean room_delete(String type) {
		boolean result= dao.room_delete(type);
		return result;
	}
	
	// 객실예약 메소드
	boolean room_reserve(String name,  int num,String type) {
		ArrayList<RoomDto> resultlist= dao.getRoomlist();
		R_listDTO dto= new R_listDTO();
		boolean result=false;
		for(RoomDto list : resultlist) {
			if(list.type.equals(dto.type) && list.num >=dto.num ) {
				result= dao.room_reserve(dto);
			}
		}
		return result;
			//숫자 줄어든 거 db에 어떻게 업데이트시키냐...
	}
	

	
	
	
	// 체크인 메소드


	// 모든 객실 조회 메소드
	ArrayList<RoomDto> getRoomlist() {
		ArrayList<RoomDto> resultlist= dao.getRoomlist();
		return resultlist;
	}
	
	
	// 예약 현황 조회 메소드

	
}
