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
					"1234");
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
		String sql="select * from member where id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {return true;}
		} catch (Exception e) {System.out.println("id 중복체크 오류" +e);}return false; 
	}
	
	// email 중복 체크
	public boolean emailcheck(String email) {
		String sql="select * from member where
	}
	
	
	
}
