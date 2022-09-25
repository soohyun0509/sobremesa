package 개인;

import java.util.ArrayList;

public class Controller {
//로직 처리
	
	static Dao dao= new Dao();
	// 회원가입 메소드
	boolean signup(String id, String password, String name, String phone) {
		CustomerDto dto = new CustomerDto(0,id, password, name, phone);
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
	boolean room_regist(String type, int price, int amount) {
		RoomDto dto= new RoomDto(type, price, amount);
		boolean result=dao.room_regist(dto);
		return result;
	}
	
	// 객실삭제 메소드
	boolean room_delete(String type) {
		boolean result= dao.room_delete(type);
		return result;
	}
	
	//객실수정 메소드
	boolean roomUpdate(String type, int price, int amount) {
		RoomDto dto =new RoomDto(type,price,amount);
		return dao.roomUpdate(dto);
	}
	
	
	// 객실예약 메소드
	boolean room_reserve(int r_num,int amount,String name, String type ) {
		
		ArrayList<RoomDto> resultlist= dao.getRoomlist();
		R_listDTO dto= new R_listDTO(0,amount,name,type);
		boolean result=false;
		for(RoomDto list : resultlist) {
			if(list.type.equals(dto.type) && list.amount >=dto.amount ) {
				result= dao.room_reserve(dto); 
				if(result) {
					result= dao.room_update( type,(list.amount-dto.amount));
				
					return result;
					
				}
			}
		}
		return false;
		
	}
	
	
	
	// 체크인 메소드
	ArrayList<R_listDTO> checkInlist(String name) {
		return dao.checkInlist(name);
	}
	boolean checkIn(int reserve_no) {
		return dao.checkIn(reserve_no);
	}
	
	

	// 모든 객실 조회 메소드
	ArrayList<RoomDto> getRoomlist() {
		ArrayList<RoomDto> resultlist= dao.getRoomlist();
		return resultlist;
	}
	
	
	// 예약 현황 조회 메소드
	ArrayList<R_listDTO> getReservelist() {
		return dao.getReservelist();
	}
	
}
