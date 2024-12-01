package TIOCS_SYSTEM;

import java.time.LocalDate;

/**
Name: Aaliyah Tennant
ID: 2307095
**/

public class Warrant {
    private int ticketNumber;
    private LocalDate issueDate;
    private String policeStation;
    
    // Default Constructor
    public Warrant() {
        this.ticketNumber = 000000;
        this.issueDate =  LocalDate.now();
        this.policeStation = "";
    }

    // Primary Constructor
    public Warrant(int ticketNumber, LocalDate issueDate, String policeStation) {
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.policeStation = policeStation;
    }
    
    // Copy Constructor
    public Warrant(Warrant warrant) {
        this.ticketNumber = warrant.ticketNumber;
        this.issueDate = warrant.issueDate;
        this.policeStation = warrant.policeStation;
    }


    // Mutators 
    public void setticketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setissueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setpoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    // Accessors 
    public int getticketNumber() {
        return ticketNumber;
    }

    public LocalDate getissueDate() {
        return issueDate;
    }

    public String getpoliceStation() {
        return policeStation;
    }

    // issueWarrant method (outputs warrant details)
//    public void issueWarrant() {
//        System.out.println("Warrant Details:");
//        System.out.println("Ticket Number: " + ticketNumber);
//        System.out.println("Issue Date: " + issueDate);
//        System.out.println("Police Station: " + policeStation);
//    }
    
    
    @Override
	public String toString() {
		return "Warrant [ticketNumber=" + ticketNumber + ", issueDate=" + issueDate + ", policeStation=" + policeStation
				+ "]";
	}
    
    public void display() {
    	System.out.println(toString());
    }


//	// demonstration
//    public static void main(String[] args) {
//        // Creating a Warrant object - test
//        Warrant warrant = new Warrant("12345", "2024-11-25", "Central Station");
//
//        // Display warrant details
//        warrant.issueWarrant();
//        //Successful
//
//    }
}