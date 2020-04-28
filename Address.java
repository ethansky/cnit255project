
public class Address {
    private int homeNumber;
    private String street;
    private String city;
    private String state;
    private String country;
    private int zipCode;

    public Address(int homeNumber, String street, String city, String state, String country, int zipCode) {
        this.homeNumber = homeNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipCode() {
        return zipCode;
    }

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

    
}