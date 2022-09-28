package teamProject.model.DAO;

import java.sql.*;
import java.util.ArrayList;

import model.DTO.NationDTO;
import teamProject.model.DTO.PlayerDTO;

public class PlayerDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private static PlayerDAO dao = new PlayerDAO();
	private PlayerDAO() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team","root","1234");
		} catch (SQLException e) { e.printStackTrace(); }
	}
	public static PlayerDAO getInstance() { return dao; }
	

	//누구 턴인지 가져오는 로직
	public int getWhoIsTurn() {
		String sql="select p_turn from player";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				PlayerDTO dto= new PlayerDTO();
				dto.setP_turn(rs.getInt(1));
			}
		} catch (Exception e) {System.out.println("턴 출력 오류" +e);}
		
			return 0;
		}
	
	
	
	
	//통행료 얻기 메소드
	boolean takeTollFee(int player, int tollFee) {
		return false;
	}
}
