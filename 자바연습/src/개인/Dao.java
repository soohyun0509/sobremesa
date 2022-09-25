package 개인;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



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
					"123456");
		} catch (Exception e) {System.out.println("경고 ) DB 접속 오류" + e);}
		
		
	}
	
	// 회원가입 메소드
	boolean sign_up(CustomerDto dto) {
			String sql="insert into customer(c_no,id, password, name, phone) values(null,?,?,?,?)";
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
	CustomerDto login(String id, String password) {
		String sql="select * from customer where id= ? and password= ?";
		CustomerDto dto=null;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs=ps.executeQuery(); // 테이블에 없는 id,password를 계속 where조건에 넣어주니까
			//당연히 맞는값이 없으니까 결과가 하나도 안나오지!!
			// 그러니까 이 밑에 if문을 통과할 수 없음!!!
			if(rs.next()) {
				dto= new CustomerDto();
				dto.id= rs.getString(2);
				dto.password= rs.getString(3);
				return dto;
				//
			}
			
		} catch (Exception e) {System.out.println("경고 ) 로그인 오류 " + e);}
		return dto;// 애는 null이래 ..값이 아예 안담기나봐
	}//아 진짜 뭐가 문제야...
	// null 값을 계속 equals로 비교하고 앉았으니 계속 오류가 뜨지...
	//page에서 !=null 해줬어야했어...
	
	
	// 객실등록 메소드
	boolean room_regist(RoomDto dto) {//매개변수 따로따로 써도 되긴하는데 어차피 풀생성자로 올거니까 사용
		String sql="insert into room values(?, ?, ?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.type);
			ps.setInt(2, dto.price);
			ps.setInt(3, dto.amount);
			ps.executeUpdate();
			 
			return true;
		} catch (Exception e) {System.out.println("경고 ) 객실등록 오류 " + e);}
		return false;	
	}//객실등록 메소드 end
	
	// 객실삭제 메소드
	boolean room_delete(String type) {
		String sql="delete from room where type=? ";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, type);
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {System.out.println("경고 ) 객실삭제 오류 " + e);}
		return false;
	}//삭제 메소드 end
	
	//객실 수정 메소드
	boolean roomUpdate(RoomDto dto) {
		String sql="update room set price=? , amount=? where type=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, dto.price);
			ps.setInt(2,dto.amount );
			ps.setString(3, dto.type);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("경고 ) 객실수정오류 " + e);}
		return false;
	}
	
	
	// 객실예약 메소드
	boolean room_reserve(R_listDTO dto) {
		String sql="insert into r_list values(null,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, dto.amount);
			ps.setString(2, dto.name);
			ps.setString(3, dto.type);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {System.out.println("경고 ) 예약 오류 " + e);}
		return false;
	}// 예약 메소드 end
	
	//객실 수 차감 메소드
	boolean room_update( String type,int amount) {
		String sql="update room set amount=? where type=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, amount);
			ps.setString(2, type);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("경고 ) 객실 수 변경 오류 " + e);}
		return false;
	
	}
	
	// 체크인 메소드
	ArrayList<R_listDTO> checkInlist(String name) {
		String sql="select * from r_list where name=?";
		ArrayList<R_listDTO> list= new ArrayList<>();
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()) {
				R_listDTO dto= new R_listDTO(
						rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)
						);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("경고 ) 체크인 오류 " + e);}
		return list;
	}
	// 체크인 메소드
	boolean checkIn(int reserve_no) {
		String sql="delete from r_list where reserve_no=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, reserve_no);
			ps.executeUpdate();
			return true;
		} catch (Exception e)  {System.out.println("경고 ) 체크인 오류 " + e);}
		return false;
	}
	
	
	// 모든 객실 조회 메소드
	ArrayList<RoomDto> getRoomlist() {
		String sql="select * from room";
		ArrayList<RoomDto> list = new ArrayList<>();
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				RoomDto dto = new RoomDto(
						rs.getString(1), 
						rs.getInt(2), 
						rs.getInt(3)
					);
				list.add(dto);
				}//while end
			return list;
		} catch (Exception e) {System.out.println("경고 ) 객실조회 오류 " + e);}
		return list;
	}//객실 조회 end

	// 예약 현황 조회 메소드
	ArrayList<R_listDTO> getReservelist(){
		String sql="select * from r_list";
		ArrayList<R_listDTO> list = new ArrayList<>();
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				R_listDTO dto=new R_listDTO(
						rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)
						);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("경고 ) 예약현황 조회 오류 " + e);}
		return list;
	}
	
	
	
	
}// class end
