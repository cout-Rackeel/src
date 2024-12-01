package RPLS_SYSTEM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import TIOCS_SYSTEM.IssuedTicket;
import TIOCS_SYSTEM.PassedDueDateTicket;


public class RPLS {
	private ArrayList<Application> applications;
	private ArrayList<Driver> drivers;
	private ArrayList<IssuedTicket> tickets;
	private ArrayList<PassedDueDateTicket> passedDueDateTickets;
	private String processingOfficerTrn = "123-123-123";

	
	
	// DEFAULT CONSTRUCTOR
	RPLS(){
		this.drivers = new ArrayList<>();
		this.applications = new ArrayList<>();
		this.tickets = new ArrayList<>();
		this.passedDueDateTickets = new ArrayList<>();
		//loadResources();
		loadDrivers();
		startMenu();
	}
	
	//Depending on TRN will assign a user type
	public void startMenu() {
		String trn;
		Scanner scanner = new Scanner(System.in);
		
		for (Driver driverIns : this.drivers) { driverIns.display(); System.out.println("\n"); }
		
		System.out.println("\nEnter your TRN: ");
		trn = scanner.next();
		scanner.nextLine();
		
		
		// ADD SEARCH FOR USER FUNCTION HERE
		String userType = validateUser(trn); // Determines what type of user is accessing the system

		switch(userType) {
			case "PO":
			break;
			
			case "DR":
				driverScreen(  getDriver( trn )  );
			break;
		}
	}
	
	public void processingOfficerScreen() 
	{
		//TODO: Implement options
		
		/*1. The processing officer can check the status of an applicant, through the Ticketing Issuing
			and Offender Checking System (TIOCS) and can do the following:
			a. Create an application
			b. Update an application.
			c. Delete an application.
			d. Reject an application.
			2. The processing officer using the applicant’s TRN can see if an applicant has any
			outstanding tickets.
			3. The processing officer can indicate that outstanding tickets must be paid before
			the application is processed.*/
	}
	
	public void driverScreen(Driver driver) 
	{
		
		
		int option;
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*****WELCOME DRIVER******\n");
				
		System.out.println("Select Operation:\n"
						  + "\t1. Check for all past tickets\n"
						  + "\t2. Make online payments for tickets that are issued but not passed due.\n"
						  + "\t3. Check for past-due tickets.\n"
						  + "\t4. View ticket(s) paid in time.\n"
						  + "\t5. Check for warrants.:\n"
						  );
		option = scanner.nextInt();
		
		switch(option) {
			case 1:
				//driver.checkForPastPaidTickets(this.tickets);
			break;
			
			case 2:
				//driver.payForTicket(driver.getPersonalDetails().getTrn(), ticketNumber, 3000.00);
			break;
			
			default:
				System.out.println("Invalid Option");
			break;
				
		}
		
	}
	
	public String validateUser(String trn) 
	{
		String userType;
		
		if(trn == processingOfficerTrn) {
			userType = "PO";
		}else{
			userType = "DR";
		}
		
		return userType;
		
	}
	
	public Driver getDriver(String trn) 
	{
		Driver target = null;
		
		for(Driver driverIns : this.drivers) {
			
			if(trn.equals(driverIns.getPersonalDetails().getTrn())) 
			{
				target = new Driver(driverIns);
				return target;
				
			}
			
		}
		
		return target;
	}
	
	public void loadResources() // Gets all records from files to the system
	{
		//TODO: LoadDrivers(),
			  /*LoadApplications(), 
			    LoadIssuedTickets(), 
			    LoadPassedDueDateTickets()*/
	}
	
	public void loadDrivers() {
		try(BufferedReader driverFile = new BufferedReader( new FileReader("Driver.txt") )) //Try-with syntax allows us not to have to close the file
		{
	
			String line;

			while((line = driverFile.readLine()) != null)
				
			{
					
				if (line.trim().isEmpty()) {
						// Skip empty lines continue;
				}
				
				PersonalDetails personalDetails = new PersonalDetails();
				DrivingRecord drivingRecord = new DrivingRecord();
				String fullName;
				String adrsln1;
				String adrsln2;
				String parish;
				String trn;
				String emailAddress;
				String contactNumber;
				String gender;
				LocalDate dateOfBirth;
				Boolean hasAccidents;
				Boolean hasNegativePoliceRecord;
				Boolean hasOutstandingTickets;
				String dateString;
				LocalDate date;
					
				fullName = checkNull(line);
				adrsln1 =  checkNull(driverFile.readLine());
				adrsln2 =  checkNull(driverFile.readLine());
				parish =  checkNull(driverFile.readLine());
				trn =  checkNull(driverFile.readLine());
				emailAddress =  checkNull(driverFile.readLine());
				contactNumber =  checkNull(driverFile.readLine());
				gender =  checkNull(driverFile.readLine());
				dateOfBirth = parseDate(checkNull(driverFile.readLine()));
				hasAccidents = Boolean.parseBoolean(driverFile.readLine());
				hasNegativePoliceRecord = Boolean.parseBoolean(driverFile.readLine());
				hasOutstandingTickets = Boolean.parseBoolean(driverFile.readLine());
				driverFile.readLine();
				
				//Sets Values
				personalDetails.setFullName(fullName);
				personalDetails.getAddress().setAdrsln1(adrsln1);
				personalDetails.getAddress().setAdrsln2(adrsln2 );
				personalDetails.getAddress().setParish(parish);
				personalDetails.setTrn(trn);
				personalDetails.setEmailAddress(emailAddress);
				personalDetails.setContactNumber(contactNumber);
				personalDetails.setGender(gender);
				personalDetails.setDateOfBirth(dateOfBirth);
				drivingRecord.setHasAccidents(hasAccidents);
				drivingRecord.setHasNegativePoliceRecord(hasNegativePoliceRecord);
				drivingRecord.setHasOutstandingTickets(hasOutstandingTickets);
					
				Driver driver = new Driver(personalDetails , drivingRecord , null, null, null);
				this.drivers.add(driver);
			}
				
		}
		catch(FileNotFoundException e) {
			System.err.println("ERROR!" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getMessage());
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getMessage());
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getCause() + e.getClass());
			e.printStackTrace();
		}
		
	}
	
	public void loadTickets() {
		try(BufferedReader ticketFile = new BufferedReader( new FileReader("Driver.txt") )) //Try-with syntax allows us not to have to close the file
		{
	
			String line;

			while((line = ticketFile.readLine()) != null)
				
			{
					
				if (line.trim().isEmpty()) {
						// Skip empty lines continue;
				}
				
				String ticketNumber;
				String ticketIssueDate;
				String ticketOffenceCode;
				String ticketOffenceDescription;
				String ticketStatusDescription;
				LocalDate paymentDueDate;
				float fineAmount;
				String vehicleLicensePlateNumber;
				String driversTRN;
				String driverFullName;
				LocalDate driverDateOfBirth;
				String driverAddress;
				String driverContactNumber;
				int officerBadgeNumber;
				String officerFullName;			
				String officerAssignedPoliceStation;
				String issueParish;
				
					
				ticketNumber = checkNull(line);
				ticketIssueDate = checkNull(ticketFile.readLine());
				ticketOffenceCode = checkNull(ticketFile.readLine());
				ticketOffenceDescription = checkNull(ticketFile.readLine());
				ticketStatusDescription = checkNull(ticketFile.readLine());
				paymentDueDate = parseDate(checkNull(ticketFile.readLine()));
				fineAmount =  Integer.parseInt(checkNull(ticketFile.readLine()));
				vehicleLicensePlateNumber = checkNull(ticketFile.readLine());
				driversTRN = checkNull(ticketFile.readLine());
				driverFullName = checkNull(ticketFile.readLine());
				driverDateOfBirth = parseDate(checkNull(ticketFile.readLine()));
				driverAddress = checkNull(ticketFile.readLine());
				driverContactNumber = checkNull(ticketFile.readLine());
				officerBadgeNumber = Integer.parseInt(checkNull(ticketFile.readLine()));
				officerFullName = checkNull(ticketFile.readLine());
				officerAssignedPoliceStation = checkNull(ticketFile.readLine());
				issueParish = checkNull(ticketFile.readLine());
				
				ticketFile.readLine();
				
				//Sets Values

					
				IssuedTicket ticket = new IssuedTicket(ticketNumber,ticketIssueDate,ticketOffenceCode,ticketOffenceDescription,ticketStatusDescription,paymentueDate,fineAmount,vehicleLicensePlateNumber,driversTRN,driverFullName,driverDateOfBirth,driverAddress,driverContactNumber,officerBadgeNumber,officerFullName,officerAssignedPoliceStation,issueParish);
				this.drivers.add(driver);
			}
				
		}
		catch(FileNotFoundException e) {
			System.err.println("ERROR!" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getMessage());
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getMessage());
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR!" + e.getCause() + e.getClass());
			e.printStackTrace();
		}
		
	}
	
	public void insertDriver(Driver driver) {
		try {
			FileWriter filewriter = new FileWriter("Driver.txt" , true);
			
			String driverSerialization =
					assignNull(driver.getPersonalDetails().getFullName()) + "\n" + // Tests if value is null and sets it to a default null
					assignNull(driver.getPersonalDetails().getAddress().getAdrsln1()) + "\n" +
					assignNull(driver.getPersonalDetails().getAddress().getAdrsln2()) + "\n" +
					assignNull(driver.getPersonalDetails().getAddress().getParish()) + "\n" +
					assignNull(driver.getPersonalDetails().getTrn()) + "\n" +
					assignNull(driver.getPersonalDetails().getEmailAddress()) + "\n"+
					assignNull(driver.getPersonalDetails().getContactNumber()) + "\n" +
					assignNull(driver.getPersonalDetails().getGender()) + "\n" +
					assignNull(driver.getPersonalDetails().getDateOfBirth().toString()) + "\n" +
					assignNull(driver.getDrivingRecord().getHasAccidents().toString()) + "\n" +
					assignNull(driver.getDrivingRecord().getHasNegativePoliceRecord().toString()) + "\n" +
					assignNull(driver.getDrivingRecord().getHasOutstandingTickets().toString()) + "\n" 
			;
			
			filewriter.write(driverSerialization + "~ \n");
			System.out.println("Record added!!");
			filewriter.close();
		}
		catch(IOException e) {
			System.err.println("ERROR! " + e.getMessage());
		}
	}

// Assigns Null string to null values within file
	
	private static String checkNull(String value) { return "null".equals(value) || "".equals(value) || " ".equals(value) ? null : value; } 
	
	private static LocalDate parseDate(String dateStr) { return dateStr == null ? null : LocalDate.parse(dateStr); }
	
	private static String assignNull(String value) { return value.toString() == null || "".equals(value) || " ".equals(value) ? "null" : value; } 
	

	

}
