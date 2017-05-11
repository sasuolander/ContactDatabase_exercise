package lieni.control.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lieni.model.User;

public class SignInDAO extends DataAccessModel{
	public static  void ValidateUser() {
		 
	}
	
	public ArrayList<User> FindAll(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		User user = null;
		ArrayList<User>Users= new ArrayList<User>();
		
		conn = getConnection();
		String sql="SELECT ID,name,password FROM userprofiles;";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				user = readUser(rs);
				Users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return Users;
	}
	private User readUser (ResultSet rs){
		try {
			int id = rs.getInt(1);
			String name= rs.getString("name");
			String password = rs.getString("password");
			return new User(id, name, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
	}
}
