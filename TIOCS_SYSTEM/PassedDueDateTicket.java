package TIOCS_SYSTEM;
import java.time.LocalDate;

public class PassedDueDateTicket extends IssuedTicket {
	private LocalDate courtDate;
	private String courtLocation;
	private String courtTime;
	
	// DEFAULT CONSTRUCTOR
	public PassedDueDateTicket() {
		super();
		this.courtDate = LocalDate.now().plusWeeks(2);
		this.courtLocation = "1 Kings Road, Spanish Town";
		this.courtTime = "12:00 PM";
	}
	
	// PRIMARY CONSTRUCTOR
	public PassedDueDateTicket(
			int TicketNumber, LocalDate TicketIssueDate, int TicketOffenceCode, String TicketOffenceDescription,
			String TicketStatusDescription, LocalDate PaymentDueDate, float FineAmount, String VehicleLicensePlateNumber,
			String DriversTRN, String DriverFullName, LocalDate DriverDateOfBirth, String DriverAddress,
			String DriverContactNumber, int OfficerBadgeNumber, String OfficerFullName,
			String OfficerAssignedPoliceStation, String IssueParish,
			LocalDate courtDate, String courtLocation, String courtTime
			) {
		
		super(TicketNumber, 
				TicketIssueDate, 
				TicketOffenceCode, 
				TicketOffenceDescription, 
				TicketStatusDescription,
				PaymentDueDate,
				FineAmount, VehicleLicensePlateNumber,
				DriversTRN, DriverFullName, DriverDateOfBirth, DriverAddress, DriverContactNumber,
				OfficerBadgeNumber,
				OfficerFullName,
				OfficerAssignedPoliceStation,
				IssueParish);
		this.courtDate = courtDate;
		this.courtLocation = courtLocation;
		this.courtTime = courtTime;
	}
	
	//PRIMARY CONSTRUCTOR USING PARENT CLASS COPY CONSTRUCTOR
	public PassedDueDateTicket(IssuedTicket issuedTicket , 	LocalDate courtDate, String courtLocation, String courtTime ) {
		
		super(issuedTicket);//PARENT CLASS COPY CONSTRUCTOR
		this.courtDate = courtDate;
		this.courtLocation = courtLocation;
		this.courtTime = courtTime;
	}
	
	// COPY CONSTRUCTOR
	public PassedDueDateTicket(PassedDueDateTicket passedDueDateTicket ) {
		super(passedDueDateTicket);
		this.courtDate = passedDueDateTicket.courtDate;
		this.courtLocation = passedDueDateTicket.courtLocation;
		this.courtTime = passedDueDateTicket.courtTime;
	}


	public LocalDate getCourtDate() {
		return courtDate;
	}

	public void setCourtDate(LocalDate courtDate) {
		this.courtDate = courtDate;
	}

	public String getCourtLocation() {
		return courtLocation;
	}

	public void setCourtLocation(String courtLocation) {
		this.courtLocation = courtLocation;
	}

	public String getCourtTime() {
		return courtTime;
	}

	public void setCourtTime(String courtTime) {
		this.courtTime = courtTime;
	}

	@Override
	public String toString() {
		return super.toString() + "PassedDueDateTicket [courtDate=" + courtDate + ", courtLocation=" + courtLocation + ", courtTime="
				+ courtTime + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
	
	
	
	
}
