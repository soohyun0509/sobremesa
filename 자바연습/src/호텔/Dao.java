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
					"jdbc:mysql://localhost:3306/hotel",
					"root",
					"1234");
		} catch (Exception e) {System.out.println("경고 ) DB 접속 오류" + e);}
		
		
	}
	
	// 회원가입 메소드
	boolean sign_up(CustomerDto dto) {
			String sql="insert into customer(id, password, name, phone) values(?,?,?,?)";
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1, dto.id);
				ps.setString(2, dto.password);
				ps.setString(3, dto.name);
				ps.setString(4, dto.phone);
				
				ps.executeUpdate();
				return true;
			} catch (Exception e) {System.out.println("경고 ) 회원가입 오류 " + e);}
			return false;
		}//회원가입 메소드 end
	// 로그인 메소드
	boolean login(CustomerDto dto) {
		String sql="select * from customer where id= ? and password= ?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.id);
			ps.setString(2, dto.password);
			rs=ps.executeQuery();
			if(rs.next()) {
				CustomerDto dto2= new CustomerDto();
				dto2.id= rs.getString(1);
				dto2.password= rs.getString(2);
				
				if(dto.id == dto2.id) {
					return true;
				}
				
			}
		} catch (Exception e) {System.out.println("경고 ) 로그인 오류 " + e);}
		return false;
	}
	
	
	
	// 객실등록 메소드
	
	// 객실삭제 메소드

	// 객실예약 메소드

	// 체크인 메소드

	// 모든 객실 조회 메소드

	
	// 예약 현황 조회 메소드

	
}// class end
