package lieni.model;

public class Contact {
	
	private int ID;
	private String FirstName;
	private String LastName;
	private String Title;
	private String ZIPCode;
	private String City;
	private String Country;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getZIPCode() {
		return ZIPCode;
	}
	public void setZIPCode(String zIPCode) {
		ZIPCode = zIPCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Contact ID=" + ID + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", Title=" + Title + ", ZIPCode=" + ZIPCode
				+ ", City=" + City + ", Country=" + Country;
	}
	public Contact(int iD, String firstName, String lastName, String title,
			String zIPCode, String city, String country) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		Title = title;
		ZIPCode = zIPCode;
		City = city;
		Country = country;
	}
	public Contact() {
		super();
		ID = 0;
		FirstName = null;
		LastName = null;
		Title = null;
		ZIPCode = null;
		City = null;
		Country = null;
	}
	
	
	
	

}
