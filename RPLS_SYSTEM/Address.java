package RPLS_SYSTEM;


public class Address
{
    private String adrsln1;
    private String adrsln2;
    private String parish;

    // Default constructor
    public Address() {
        this.adrsln1 = "116 Tower Street";
        this.adrsln2 = "Springfield";
        this.parish = "Kingston";
    }

    // Primary constructor
    public Address(String adrsln1, String adrsln2, String parish) {
        this.adrsln1 = adrsln1;
        this.adrsln2 = adrsln2;
        this.parish = parish;
    }

    // Copy constructor
    public Address(Address address) {
        this.adrsln1 = address.adrsln1;
        this.adrsln2 = address.adrsln2;
        this.parish = address.parish;
    }

    // Setters
    public void setAdrsln1(String adrsln1) {
        this.adrsln1 = adrsln1;
    }

    public void setAdrsln2(String adrsln2) {
        this.adrsln2 = adrsln2;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    // Getters
    public String getAdrsln1() {
        return adrsln1;
    }

    public String getAdrsln2() {
        return adrsln2;
    }

    public String getParish() {
        return parish;
    }
    
    

    @Override
	public String toString() {
		return "Address [adrsln1=" + adrsln1 + ", adrsln2=" + adrsln2 + ", parish=" + parish + "]";
	}

	public void display() {
        System.out.println(toString());
    }
}

