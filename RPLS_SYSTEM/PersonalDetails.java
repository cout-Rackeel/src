package RPLS_SYSTEM;
import java.time.LocalDate;


public class PersonalDetails {
	private String fullName;
	private Address address;
	private String trn;
	private String emailAddress;
	private String contactNumber;
	private String gender;
	private LocalDate dateOfBirth;
	
	
	//DEFAULT CONSTRUCTOR
	public PersonalDetails()
	{
		this.fullName = "Vince Lane";
		this.address = new Address();
		this.trn = "000-200-002";
		this.emailAddress = "person4@gmail.com";
		this.contactNumber = "";
		this.gender = "Male";
		this.dateOfBirth = LocalDate.of(1999, 9, 10);
	}
	
	//PRIMARY CONSTRUCTOR
	public PersonalDetails(String fullName, Address address, String trn, String emailAddress, String contactNumber,String gender, LocalDate dateOfBirth)
	{
		this.fullName = fullName;
		this.address = address;
		this.trn = trn;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	
	//COPY CONSTRUCTOR
	public PersonalDetails(PersonalDetails personalDetails)
	{
		this.fullName = personalDetails.fullName;
		this.address = personalDetails.address;
		this.trn = personalDetails.trn;
		this.emailAddress = personalDetails.emailAddress;
		this.contactNumber = personalDetails.contactNumber;
		this.gender = personalDetails.gender;
		this.dateOfBirth = personalDetails.dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTrn() {
		return trn;
	}

	public void setTrn(String trn) {
		this.trn = trn;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	@Override
	public String toString() {
		return "PersonalDetails [fullName=" + fullName + ", " + address + ", trn=" + trn + ", emailAddress="
				+ emailAddress + ", contactNumber=" + contactNumber + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	public void display() {
		System.out.println(toString());
	}
	
	
}
