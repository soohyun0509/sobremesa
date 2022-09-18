package 호텔;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Dao {
//데이터베이스 접근 클래스
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public Dao() {
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hotel_db",
					"root",
					"123456");
		} catch (Exception e) {System.out.println("경고 ) DB 접속 오류");}
		
		
	}
	
	
	
	// 로그인 메소드
	boolean login(Board board) {
		
		
	}
	
	// 회원가입 메소드
	
	// 객실등록 메소드
	
	// 객실삭제 메소드

	// 객실예약 메소드

	// 체크인 메소드

	// 모든 객실 조회 메소드

	
	// 예약 현황 조회 메소드

	
}// class end
