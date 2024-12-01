package RPLS_SYSTEM;

import java.util.ArrayList;
import java.util.Arrays;

import TIOCS_SYSTEM.IssuedTicket;
import TIOCS_SYSTEM.PassedDueDateTicket;
import TIOCS_SYSTEM.Warrant;

public class Driver  {
	protected PersonalDetails personalDetails;
	protected DrivingRecord drivingRecord;
	protected Warrant[] warrants;
	protected IssuedTicket[] outstandingTickets;
	protected PassedDueDateTicket[] passedDueDateTickets;
	
	
	//Default Constructor
	public Driver() {
		PersonalDetails personalDetails = new PersonalDetails() ;
		this.personalDetails = personalDetails;
		this.drivingRecord = new DrivingRecord();
		this.warrants = new Warrant[]{new Warrant() , new Warrant()};
		this.outstandingTickets = new IssuedTicket[]{new IssuedTicket()};
		this.passedDueDateTickets = new PassedDueDateTicket[]{new PassedDueDateTicket()};
	}
	
	// Primary Constructor
	public Driver(PersonalDetails personalDetails, DrivingRecord drivingRecord, Warrant[] warrants,
			IssuedTicket[] outstandingTickets, PassedDueDateTicket[] passedDueDateTickets) {
		this.personalDetails = personalDetails;
		this.drivingRecord = drivingRecord;
		this.warrants = warrants;
		this.outstandingTickets = outstandingTickets;
		this.passedDueDateTickets = passedDueDateTickets;
	}
	
	// Copy Constructor
	public Driver(Driver driver) {
		this.personalDetails = driver.personalDetails;
		this.drivingRecord = driver.drivingRecord;
		this.warrants = driver.warrants;
		this.outstandingTickets = driver.outstandingTickets;
		this.passedDueDateTickets = driver.passedDueDateTickets;
	}
	
	
	//Getters and Setters
	

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public DrivingRecord getDrivingRecord() {
		return drivingRecord;
	}

	public void setDrivingRecord(DrivingRecord drivingRecord) {
		this.drivingRecord = drivingRecord;
	}

	public Warrant[] getWarrants() {
		return warrants;
	}

	public void setWarrants(Warrant[] warrants) {
		this.warrants = warrants;
	}

	public IssuedTicket[] getOutstandingTickets() {
		return outstandingTickets;
	}

	public void setOutstandingTickets(IssuedTicket[] outstandingTickets) {
		this.outstandingTickets = outstandingTickets;
	}

	public PassedDueDateTicket[] getPassedDueDateTickets() {
		return passedDueDateTickets;
	}

	public void setPassedDueDateTickets(PassedDueDateTicket[] passedDueDateTickets) {
		this.passedDueDateTickets = passedDueDateTickets;
	}
	
	
	//RPLS & TIOCS Functions
	
	public void checkForPastPaidTickets(ArrayList<IssuedTicket> issuedTickets) {
		//TODO: Implement Code for Checking Past Paid Tickets
		
		/*Check for all their past tickets, which will show output in ascending alphabetical order
		  based on all their issued date. The report should show the following information:
			a. Ticket Issue Date
			b. Payment Due Date
			c. Ticket Number
			d. Offence Code
			e. Offence Description
			f. Fine Amount
			g. Ticket Status Description (i.e. paid, unpaid, warrant outstanding)
			h. Court Date
			i. Court Location
			j. Total unpaid tickets
			k. Total fine amount*/
	}
	
	public void checkForPassedDueDateTickets(ArrayList<IssuedTicket> issuedTickets) {
		//TODO: Implement Code for Checking PassedDueDateTickets
		
		/*Tickets which have passed the 21 days for payment will
		  reflect a court location, date and time that the offender should appear in court to answer
		  his/her charges.*/
	}
	
	public void checkDueDateForOutstandingTickets(ArrayList<IssuedTicket> issuedTickets) {
		//TODO: Implement Code for Checking DueDateForOutstandingTickets
	}
	
	public void viewTicketsPaidBeforeDueDate(ArrayList<IssuedTicket> issuedTickets) {
		//TODO: Implement Code to viewTicketsPaidBeforeDueDate
		
		//View ticket(s) payments that have not passed due based on their TRN.
	}
	
	public void checkWarrants(ArrayList<IssuedTicket> issuedTickets) {
		//TODO: Implement Code for Checking Warrants
		
		/*Check where there is a warrant issued for their arrest for not appearing in court, and it
		should show which police station they should turn themselves in.*/
	}
	
	public void payForTicket(String driverTrn , int ticketNumber, float ticketAmount) {
		//TODO: Implement Code for Checking DueDateForOutstandingTickets
		/*Make online payments for tickets that are issued but not passed due*/
	}
	
	
	//Display Functions

	@Override
	public String toString() {
		return "Driver [" + personalDetails + ", " + drivingRecord + ", "
				+ Arrays.toString(warrants) + ", outstandingTickets=" + Arrays.toString(outstandingTickets)
				+ ", passedDueDateTickets=" + Arrays.toString(passedDueDateTickets) + "]";
	}
	
    public void display() {
    	System.out.println(toString());
    }
	
	
	

}
