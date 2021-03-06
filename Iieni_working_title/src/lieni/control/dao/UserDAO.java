package lieni.control.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lieni.model.User;

public class UserDAO extends DataAccessModel {
	public static void Add(User user) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String name = user.getName();
		String password = user.getPassword();

		try {
			conn = getConnection();
			String sql = "INSERT INTO user(name, password)" + "VALUES(?,?);";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.executeQuery();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void Remove(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;

		conn = getConnection();
		String sql = "DELETE FROM userprofiles WHERE ID =" + id + ";";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static User readUser(ResultSet rs) {
		try {
			int id = rs.getInt(1);
			String username = rs.getString("name");
			String password = rs.getString("password");
			return new User(id, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User FindUser(String name) {

		Connection conn = null;
		PreparedStatement stmt = null;
		
		User user = null;
		try {
			conn = getConnection();
			//String sql = "SELECT ID, name, password  FROM userprofiles WHERE name =?;";
			stmt = conn.prepareStatement("SELECT ID, name, password  FROM userprofiles WHERE name = ?");
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()){
				user = new User(rs.getInt("ID"),
						rs.getString("name"), 
						rs.getString("password"));
				
			}else {
				user = new User(-1, "-", "-");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}