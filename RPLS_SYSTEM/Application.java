package RPLS_SYSTEM;

public class Application {
    private int applicationID;           // Application ID
    private String applicantTrn;            // Name of the applicantTrn
    private String proposedDriverTRN;    // Proposed driver's TRN (Taxpayer Registration Number)
    private String[] reasonsForRejection; // Reasons for rejection
    private String status;               // Status of the application
    private String policeRecordCheck;    // Police record check status
    private String approvalDate;         // Approval date
    private String denialDate;           // Denial date
    private String statusMessage;        // Status message

    // Default constructor
    public Application() {
        this.applicationID = 0;
        this.applicantTrn = "";
        this.proposedDriverTRN = "";
        this.reasonsForRejection = new String[0];  // Initializes empty array
        this.status = "";
        this.policeRecordCheck = "";
        this.approvalDate = "";
        this.denialDate = "";
        this.statusMessage = "";
    }

    // Primary constructor
    public Application(int applicationID, String applicantTrn, String proposedDriverTRN, String[] reasonsForRejection,
                       String status, String policeRecordCheck, String approvalDate, String denialDate, String statusMessage) {
        this.applicationID = applicationID;
        this.applicantTrn = applicantTrn;
        this.proposedDriverTRN = proposedDriverTRN;
        this.reasonsForRejection = reasonsForRejection;
        this.status = status;
        this.policeRecordCheck = policeRecordCheck;
        this.approvalDate = approvalDate;
        this.denialDate = denialDate;
        this.statusMessage = statusMessage;
    }

    // Copy constructor
    public Application(Application other) {
        this.applicationID = other.applicationID;
        this.applicantTrn = other.applicantTrn;
        this.proposedDriverTRN = other.proposedDriverTRN;
        this.reasonsForRejection = other.reasonsForRejection.clone(); // Deep copy of the reasons array
        this.status = other.status;
        this.policeRecordCheck = other.policeRecordCheck;
        this.approvalDate = other.approvalDate;
        this.denialDate = other.denialDate;
        this.statusMessage = other.statusMessage;
    }

    // Setters
    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public void setApplicantTrn(String applicantTrn) {
        this.applicantTrn = applicantTrn;
    }

    public void setProposedDriverTRN(String proposedDriverTRN) {
        this.proposedDriverTRN = proposedDriverTRN;
    }

    public void setReasonsForRejection(String[] reasonsForRejection) {
        this.reasonsForRejection = reasonsForRejection;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPoliceRecordCheck(String policeRecordCheck) {
        this.policeRecordCheck = policeRecordCheck;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public void setDenialDate(String denialDate) {
        this.denialDate = denialDate;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    // Getters
    public int getApplicationID() {
        return applicationID;
    }

    public String getApplicantTrn() {
        return applicantTrn;
    }

    public String getProposedDriverTRN() {
        return proposedDriverTRN;
    }

    public String[] getReasonsForRejection() {
        return reasonsForRejection;
    }

    public String getStatus() {
        return status;
    }

    public String getPoliceRecordCheck() {
        return policeRecordCheck;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public String getDenialDate() {
        return denialDate;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    // Optional method to print application details (for convenience)
    public void printApplicationDetails() {
        System.out.println("Application ID: " + applicationID);
        System.out.println("Applicant: " + applicantTrn);
        System.out.println("Proposed Driver TRN: " + proposedDriverTRN);

        // Check if reasonsForRejection is empty and print accordingly
        if (reasonsForRejection.length == 0) {
            System.out.println("Reasons for Rejection: No reasons provided.");
        } else {
            System.out.print("Reasons for Rejection: ");
            for (String reason : reasonsForRejection) {
                System.out.print(reason + " ");
            }
            System.out.println();
        }

        System.out.println("Status: " + status);
        System.out.println("Police Record Check: " + policeRecordCheck);
        System.out.println("Approval Date: " + approvalDate);
        System.out.println("Denial Date: " + denialDate);
        System.out.println("Status Message: " + statusMessage);
    }
}
