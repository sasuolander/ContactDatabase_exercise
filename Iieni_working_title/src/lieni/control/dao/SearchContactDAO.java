package lieni.control.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import lieni.model.Contact;

public class SearchContactDAO  extends DataAccessModel{
	
	public ArrayList<Contact> SearchAllArray(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Contact contact = null;
		ArrayList<Contact>contats= new ArrayList<Contact>();
		
			
			try {
				conn = getConnection();
				String slqselect = "SELECT ID, FirstName,LastName, Title, Organization, Address, ZIP_code, City, Country FROM contact;";
				stmt = conn.prepareStatement(slqselect);
				rs = stmt.executeQuery();
				while(rs.next()){
					contact = readContact(rs);
					contats.add(contact);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return contats;
	}
	
	private Contact readContact(ResultSet rs){
		try {
			int id = rs.getInt(1);
			String FirstName = rs.getString("FirstName");
			String LastName = rs.getString("LastName" );
			String Title = rs.getString( "Title");
			String Organization = rs.getString("Organization");
			String Address = rs.getString("Address");
			String ZIP_code = rs.getString("ZIP_code");
			String City = rs.getString("City");
			String Country = rs.getString("Country");
			
			return new Contact(id, FirstName, LastName, Title, Organization, Address, ZIP_code, City, Country);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	//to search by using different  keyword i need to overload method
	
	public Contact SearchOne(String ID, String FirstName, 
							String LastName, String Title, 
							String Organisation, String Address,
							String ZipCode, String City, String Country) {
		return null;
	}
	
	/*private static Contact SearchOne(String Id) {
		return null;
		
	}
	
	private static Contact SearchOne(String FirstName) {
		return null;
		
	}
	
	private static Contact SearchOne(String LastName) {
		return null;
		
	}
	private static Contact SearchOne(String Title) {
		return null;
		
	}
	
	private static Contact SearchOne(String Organisation) {
		return null;
		
	}
	private static Contact SearchOne(String Address) {
		return null;
		
	}
	private static Contact SearchOne(String ZipCode) {
		return null;
		
	}
	
	private static Contact SearchOne(String City) {
		return null;
		
	}
	
	private static Contact SearchOne(String Country) {
		return null;
		
	}*/
	
}
