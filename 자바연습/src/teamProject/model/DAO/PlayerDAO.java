package teamProject.model.DAO;

import java.sql.*;
import java.util.ArrayList;

import model.DTO.NationDTO;

public class PlayerDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private static PlayerDAO dao = new PlayerDAO();
	private PlayerDAO() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team","root","123456");
		} catch (SQLException e) { e.printStackTrace(); }
	}
	public static PlayerDAO getInstance() { return dao; }
	
	
	//전체 나라 가져오는 메소드
	public ArrayList</*NationDTO*/> getNations(){
		return null;
	}
	//통행료 얻기 메소드
	boolean takeTollFee(int player, int tollFee) {
		return false;
	}
}
