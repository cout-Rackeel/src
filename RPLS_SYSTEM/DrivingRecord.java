package RPLS_SYSTEM;

public class DrivingRecord {
	private Boolean hasAccidents ;
	private Boolean hasNegativePoliceRecord;
	private Boolean hasOutstandingTickets;
	
	//Default Constructor
	public DrivingRecord()
	{
		this.hasAccidents = false;
		this.hasNegativePoliceRecord = false;
		this.hasOutstandingTickets = false;
	}

	//Primary Constructor
	public DrivingRecord(Boolean hasAccidents, Boolean hasNegativePoliceRecord, Boolean hasOutstandingTickets) 
	{
		this.hasAccidents = hasAccidents;
		this.hasNegativePoliceRecord = hasNegativePoliceRecord;
		this.hasOutstandingTickets = hasOutstandingTickets;
	}
	
	//Copy Constructor
	public DrivingRecord(DrivingRecord drivingRecord) {		
		this.hasAccidents = drivingRecord.hasAccidents;
		this.hasNegativePoliceRecord = drivingRecord.hasNegativePoliceRecord;
		this.hasOutstandingTickets = drivingRecord.hasOutstandingTickets;
	}

	public Boolean getHasAccidents() {
		return hasAccidents;
	}

	public void setHasAccidents(Boolean hasAccidents) {
		this.hasAccidents = hasAccidents;
	}

	public Boolean getHasNegativePoliceRecord() {
		return hasNegativePoliceRecord;
	}

	public void setHasNegativePoliceRecord(Boolean hasNegativePoliceRecord) {
		this.hasNegativePoliceRecord = hasNegativePoliceRecord;
	}

	public Boolean getHasOutstandingTickets() {
		return hasOutstandingTickets;
	}

	public void setHasOutstandingTickets(Boolean hasOutstandingTickets) {
		this.hasOutstandingTickets = hasOutstandingTickets;
	}

	@Override
	public String toString() {
		return "DrivingRecord [hasAccidents=" + hasAccidents + ", hasNegativePoliceRecord=" + hasNegativePoliceRecord
				+ ", hasOutstandingTickets=" + hasOutstandingTickets + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}

}
