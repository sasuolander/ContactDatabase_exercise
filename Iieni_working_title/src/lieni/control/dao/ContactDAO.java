package lieni.control.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lieni.model.Contact;

public class ContactDAO extends DataAccessModel {
	
	public static void Remove (int id){
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = getConnection();
		String sql = "DELETE FROM contact WHERE id ="+id+";";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}	
	}
	
	public static void Add (Contact contact){
		Connection conn = null;
		PreparedStatement stmt = null;
		 
		String FirstName=contact.getFirstName();
		String LastName=contact.getLastName();
		String Title=contact.getTitle();
		String Organisation=contact.getOrganization(); 
		String Address=contact.getAddress();
		String ZipCode=contact.getZIPCode(); 
		String City=contact.getCity(); 
		String Country=contact.getCountry();
		System.out.println("Values of object"+FirstName);
			try {
				
				//INSERT INTO contact (FirstName, LastName, Title,Organization, Address, ZIP_code, City, Country)
				//VALUES ('jk','jk','jk','jk','jk','jk','jk','jk');
				conn = getConnection();
				String sql = "INSERT INTO contact (FirstName, LastName, Title,Organization, Address, ZIP_code, City, Country)" + " VALUES (?,?,?,?,?,?,?,?);";
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, FirstName);
				stmt.setString(2, LastName);
				stmt.setString(3, Title);
				stmt.setString(4, Organisation);
				stmt.setString(5, Address);
				stmt.setString(6, ZipCode);
				stmt.setString(7, City);
				stmt.setString(8, Country);
				stmt.executeQuery();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
	}

	public void Change(Contact contact){
		
		
		
	}
}
