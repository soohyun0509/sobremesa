package teamProject.model.DAO;

import java.sql.*;
import java.util.ArrayList;

import teamProject.model.DTO.NationDTO;

public class NationDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private static NationDAO dao = new NationDAO();
	private NationDAO() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team","root","1234");
		} catch (Exception e) { System.out.println("DB연결오류 " +e); }
	}
	public static NationDAO getInstance() { return dao; }

	//전체 나라 가져오는 로직
	public ArrayList<NationDTO> getNations(){
		String sql="select * from nation";
		NationDTO dto=null;
		ArrayList<NationDTO> list = new ArrayList<>();
		
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				dto=new NationDTO(
						rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getInt(5));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println("나라 정보 출력 오류 " +e);}
		return list;
	}
	
	
	//수현 - 이동한 땅의 주인 존재 여부 확인 로직
	public int isExistLandlord(int n_no) {
		String sql="select p_no from nation where n_no=?";
		int p_no=0;
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, n_no);
			rs=ps.executeQuery();
			if(rs.next()) {
				p_no=rs.getInt(1);
			}
			return p_no;
		} catch (Exception e) {System.out.println("땅 주인 확인 오류 " +e);}
		return p_no;
	}
	
	//수현 - 땅 가격 가져오기
	public int getLandPrice(int n_no) {
		String sql="select n_price from nation where n_no=?";
		int n_price=0;
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, n_no);
			rs=ps.executeQuery();
			if(rs.next()) {
				n_price=rs.getInt(1);
			}
			return n_price;
		} catch (Exception e) {System.out.println("땅 가격 확인 오류 " +e);}
		return 0;
	}
	//수현 - 플레이어 자산 가져오기
	public int getPlayerMoney(int player) {
		String sql="select p_money from player where p_no=?";
		int p_money=0;
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, player);
			rs=ps.executeQuery();
			if(rs.next()) {
				p_money=rs.getInt(1);
			}
			return p_money;
		} catch (Exception e) {System.out.println("플레이어 자산 확인 오류 " +e);}
		return 0;
	}
	
	
	//수현 - 땅 구매 로직
	public boolean buyLand(int player, int n_no) {
		String sql="update nation set p_no=? where n_no=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, player);
			ps.setInt(2, n_no);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("땅 구매 오류 " +e);}
		return false;
	}
	
	
	
	
	
	
	
	
}