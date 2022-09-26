package teamProject.model.DAO;

import java.sql.*;

public class NationDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private static NationDAO dao = new NationDAO();
	private NationDAO() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team","root","1234");
		} catch (SQLException e) { e.printStackTrace(); }
	}
	public static NationDAO getInstance() { return dao; }
	
}