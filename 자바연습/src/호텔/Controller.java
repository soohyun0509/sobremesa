package 호텔;



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
		CustomerDto dto= new CustomerDto();
		dto.id= id; dto.password=password;
		boolean result= dao.login(dto);
		return result;
	}
	
	// 객실등록 메소드

	
	// 객실삭제 메소드

	
	// 객실예약 메소드

	// 체크인 메소드


	// 모든 객실 조회 메소드

	
	
	// 예약 현황 조회 메소드

	
}
