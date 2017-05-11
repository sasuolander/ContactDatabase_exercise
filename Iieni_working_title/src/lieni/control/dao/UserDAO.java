package lieni.control.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lieni.model.User;

public class UserDAO extends DataAccessModel{
	public static void Add(User user){
		Connection conn = null;
		PreparedStatement stmt = null;
		String name= user.getName();
		String password = user.getPassword();
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO user(name, password)"+"VALUES(?,?);";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2, password);
			stmt.executeQuery();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}	
	public static void Remove(int id){
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = getConnection();
		String sql = "DELETE FROM userprofiles WHERE id ="+id+";";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
