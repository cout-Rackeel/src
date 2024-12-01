package TIOCS_SYSTEM;

import java.time.LocalDate;

public class IssuedTicket {
	protected int ticketNumber;
	protected LocalDate ticketIssueDate;
	protected int ticketOffenceCode;
	protected String ticketOffenceDescription;
	protected String ticketStatusDescription;
	protected LocalDate paymentDueDate;
	protected float fineAmount;
	protected String vehicleLicensePlateNumber;
	protected String driversTRN;
	protected String driverFullName;
	protected LocalDate driverDateOfBirth;
	protected String driverAddress;
	protected String driverContactNumber;
	protected int officerBadgeNumber;
	protected String officerFullName;
	protected String officerAssignedPoliceStation;
	protected String issueParish;
	
	// DEFAULT CONSTRUCTOR
	public IssuedTicket() {
		ticketNumber = 110100;
		ticketIssueDate = LocalDate.now();
		ticketOffenceCode = 2;
		ticketOffenceDescription = "Speeding";
		ticketStatusDescription = "unpaid";
		paymentDueDate = LocalDate.now().plusDays(21);
		fineAmount = 0;
		vehicleLicensePlateNumber = "PT1235";
		driversTRN = "000-000-000";
		driverFullName = "John";
		driverDateOfBirth = LocalDate.of(1999, 9, 10);
		driverAddress = "1233 Wickam Field , Trelawny";
		driverContactNumber = "876-399-4567";
		officerBadgeNumber = 7273;
		officerFullName = "Leeward James";
		officerAssignedPoliceStation = "Elleston Road";
		issueParish = "Kingston";
	}
	
	//PRIMARY CONSTRUCTOR
	public IssuedTicket(int TicketNumber, LocalDate TicketIssueDate, int TicketOffenceCode, String TicketOffenceDescription,
			String TicketStatusDescription, LocalDate PaymentDueDate, float FineAmount, String VehicleLicensePlateNumber,
			String DriversTRN, String DriverFullName, LocalDate DriverDateOfBirth, String DriverAddress,
			String DriverContactNumber, int OfficerBadgeNumber, String OfficerFullName,
			String OfficerAssignedPoliceStation, String IssueParish) {
		
		ticketNumber = TicketNumber;
		ticketIssueDate = TicketIssueDate;
		ticketOffenceCode = TicketOffenceCode;
		ticketOffenceDescription = TicketOffenceDescription;
		ticketStatusDescription = TicketStatusDescription;
		paymentDueDate = PaymentDueDate;
		fineAmount = FineAmount;
		vehicleLicensePlateNumber = VehicleLicensePlateNumber;
		driversTRN = DriversTRN;
		driverFullName = DriverFullName;
		driverDateOfBirth = DriverDateOfBirth;
		driverAddress = DriverAddress;
		driverContactNumber = DriverContactNumber;
		officerBadgeNumber = OfficerBadgeNumber;
		officerFullName = OfficerFullName;
		officerAssignedPoliceStation = OfficerAssignedPoliceStation;
		issueParish = IssueParish;
	}
	
	//COPY CONSTRUCTOR
		public IssuedTicket(IssuedTicket issuedTicket) {
			ticketNumber = issuedTicket.ticketNumber;
			ticketIssueDate = issuedTicket.ticketIssueDate;
			ticketOffenceCode = issuedTicket.ticketOffenceCode;
			ticketOffenceDescription = issuedTicket.ticketOffenceDescription;
			ticketStatusDescription = issuedTicket.ticketStatusDescription;
			paymentDueDate = issuedTicket.paymentDueDate;
			fineAmount = this.generateFineAmount(issuedTicket.ticketOffenceCode);
			vehicleLicensePlateNumber = issuedTicket.vehicleLicensePlateNumber;
			driversTRN = issuedTicket.driversTRN;
			driverFullName = issuedTicket.driverFullName;
			driverDateOfBirth = issuedTicket.driverDateOfBirth;
			driverAddress = issuedTicket.driverAddress;
			driverContactNumber = issuedTicket.driverContactNumber;
			officerBadgeNumber = issuedTicket.officerBadgeNumber;
			officerFullName = issuedTicket.officerFullName;
			officerAssignedPoliceStation = issuedTicket.officerAssignedPoliceStation;
			issueParish = issuedTicket.issueParish;
		}

	

		public int getTicketNumber() {
			return ticketNumber;
		}

		public void setTicketNumber(int ticketNumber) {
			this.ticketNumber = ticketNumber;
		}

		public LocalDate getTicketIssueDate() {
			return ticketIssueDate;
		}

		public void setTicketIssueDate(LocalDate ticketIssueDate) {
			this.ticketIssueDate = ticketIssueDate;
		}

		public int getTicketOffenceCode() {
			return ticketOffenceCode;
		}

		public void setTicketOffenceCode(int ticketOffenceCode) {
			this.ticketOffenceCode = ticketOffenceCode;
		}

		public String getTicketOffenceDescription() {
			return ticketOffenceDescription;
		}

		public void setTicketOffenceDescription(String ticketOffenceDescription) {
			this.ticketOffenceDescription = ticketOffenceDescription;
		}

		public String getTicketStatusDescription() {
			return ticketStatusDescription;
		}

		public void setTicketStatusDescription(String ticketStatusDescription) {
			this.ticketStatusDescription = ticketStatusDescription;
		}

		public LocalDate getPaymentDueDate() {
			return paymentDueDate;
		}

		public void setPaymentDueDate(LocalDate paymentDueDate) {
			this.paymentDueDate = paymentDueDate;
		}

		public float getFineAmount() {
			return fineAmount;
		}

		public void setFineAmount(float fineAmount) {
			this.fineAmount = fineAmount;
		}

		public String getVehicleLicensePlateNumber() {
			return vehicleLicensePlateNumber;
		}

		public void setVehicleLicensePlateNumber(String vehicleLicensePlateNumber) {
			this.vehicleLicensePlateNumber = vehicleLicensePlateNumber;
		}

		public String getDriversTRN() {
			return driversTRN;
		}

		public void setDriversTRN(String driversTRN) {
			this.driversTRN = driversTRN;
		}

		public String getDriverFullName() {
			return driverFullName;
		}

		public void setDriverFullName(String driverFullName) {
			this.driverFullName = driverFullName;
		}

		public LocalDate getDriverDateOfBirth() {
			return driverDateOfBirth;
		}

		public void setDriverDateOfBirth(LocalDate driverDateOfBirth) {
			this.driverDateOfBirth = driverDateOfBirth;
		}

		public String getDriverAddress() {
			return driverAddress;
		}

		public void setDriverAddress(String driverAddress) {
			this.driverAddress = driverAddress;
		}

		public String getDriverContactNumber() {
			return driverContactNumber;
		}

		public void setDriverContactNumber(String driverContactNumber) {
			this.driverContactNumber = driverContactNumber;
		}

		public int getOfficerBadgeNumber() {
			return officerBadgeNumber;
		}

		public void setOfficerBadgeNumber(int officerBadgeNumber) {
			this.officerBadgeNumber = officerBadgeNumber;
		}

		public String getOfficerFullName() {
			return officerFullName;
		}

		public void setOfficerFullName(String officerFullName) {
			this.officerFullName = officerFullName;
		}

		public String getOfficerAssignedPoliceStation() {
			return officerAssignedPoliceStation;
		}

		public void setOfficerAssignedPoliceStation(String officerAssignedPoliceStation) {
			this.officerAssignedPoliceStation = officerAssignedPoliceStation;
		}

		public String getIssueParish() {
			return issueParish;
		}

		public void setIssueParish(String issueParish) {
			this.issueParish = issueParish;
		}
		

		@Override
		public String toString() {
			return "IssuedTicket [ticketNumber=" + ticketNumber + ", ticketIssueDate=" + ticketIssueDate
					+ ", ticketOffenceCode=" + ticketOffenceCode + ", ticketOffenceDescription="
					+ ticketOffenceDescription + ", ticketStatusDescription=" + ticketStatusDescription
					+ ", paymentDueDate=" + paymentDueDate + ", fineAmount=" + fineAmount
					+ ", vehicleLicensePlateNumber=" + vehicleLicensePlateNumber + ", driversTRN=" + driversTRN
					+ ", driverFullName=" + driverFullName + ", driverDateOfBirth=" + driverDateOfBirth
					+ ", driverAddress=" + driverAddress + ", driverContactNumber=" + driverContactNumber
					+ ", officerBadgeNumber=" + officerBadgeNumber + ", officerFullName=" + officerFullName
					+ ", officerAssignedPoliceStation=" + officerAssignedPoliceStation + ", issueParish=" + issueParish
					+ "]";
		};
		
		public float generateFineAmount(int ticketOffenceCode) {
			float fine;
			switch(ticketOffenceCode){
				case 1:
					fine = 1000f;
				break;
				case 2:
					fine = 2000f;
				break;
				case 3:
					fine = 3000f;
				break;
				default:
					fine = 0f;
				break;
			}
			
			return fine;
		}
		
		public void display() {
			System.out.println(toString());
		}
	
		
	
	
	

}
