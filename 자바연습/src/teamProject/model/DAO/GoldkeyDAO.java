package teamProject.model.DAO;


import java.sql.*;

public class GoldkeyDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private static GoldkeyDAO dao = new GoldkeyDAO();
	private GoldkeyDAO() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team","root","1234");
		} catch (SQLException e) { e.printStackTrace(); }
	}
	public static GoldkeyDAO getInstance() { return dao; }
}