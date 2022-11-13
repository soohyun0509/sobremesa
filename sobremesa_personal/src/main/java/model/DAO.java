package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sobremesa",
					"root",
					"123456");
		} catch (Exception e) {System.out.println("DB연결 오류" +e);}
		
	}
	private static DAO dao = new DAO();
	public static DAO getInstance() {return dao;} 
	
	// 1. 회원가입
	public boolean signup(DTO dto) {
		String sql="insert into member values(0,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getEmail());
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println("회원가입 DB 오류" +e);} return false;
	}
	
	// id중복체크
	public boolean idcheck(String id) {
		String sql="select * from member where mid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {return true;}
		} catch (Exception e) {System.out.println("id 중복체크 오류" +e);}return false; 
	}
	
	// email 중복 체크
	public boolean emailcheck(String email) {
		String sql="select * from member where memail=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, email);
			rs=ps.executeQuery();
			if(rs.next()) {return true;} 
			
		} catch (Exception e) {System.out.println("이메일 중복체크 오류" +e);}return false; 
	}
	
	// 로그인
	public boolean login(String id, String password) {
		String sql="select * from member where mid=? and mpassword=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {return true;}
		} catch (Exception e)  {System.out.println("로그인 오류" +e);}return false; 
	}
	
	// id로 회원번호 가져오기
	public int getMno(String id) {
		String sql="select mno from member where mid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e){System.out.println("mno 가져오기 오류" +e);} return 0;
	}
	
	// 예약
	public boolean reserve(int mno,String name, String phone, String r_date, int r_size) {
		String sql ="insert into reservation values(0,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, r_date);
			ps.setInt(4, r_size);
			ps.setInt(5, mno);
			ps.executeUpdate();
			return true;
		} catch (Exception e){System.out.println("예약하기 오류" +e);} return false;
	}
	
	
	
}
