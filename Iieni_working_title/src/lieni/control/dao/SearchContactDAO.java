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
		ArrayList<Contact>Contats= new ArrayList<Contact>();
		
		try {
			conn = getConnection();
			String slqselect = "SELECT ID, FirstName,LastName, Title, Organization, Address, ZIP_code City, Country FROM contact;";
			stmt = conn.prepareStatement(slqselect);
			rs = stmt.executeQuery();
			
			
		}catch(SQLException e){
			throw new RuntimeErrorException(e);
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
