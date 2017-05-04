package lieni.model;

public class Contact {
	
	private int ID;
	private String FirstName;
	private String LastName;
	private String Title;
	private String Organization;
	private String Address;
	private String ZIPCode;
	private String City;
	private String Country;
	
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
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
	
	
	public Contact(int iD, String firstName, String lastName, String title, String organization, String address,
			String zIPCode, String city, String country) {
		super();
		this.ID = iD;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Title = title;
		this.Organization =organization;
		this.Address= address;
		this.ZIPCode = zIPCode;
		this.City = city;
		this.Country = country;
	}
	public Contact() {
		super();
		this.ID = 0;
		this.FirstName = null;
		this.LastName = null;
		this.Title = null;
		this.Organization= null;
		this.Address = null;
		this.ZIPCode = null;
		this.City = null;
		this.Country = null;
	}
	
	
	
	

}
