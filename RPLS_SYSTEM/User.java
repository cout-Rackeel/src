package RPLS_SYSTEM;

public class User {
	protected String userTrn;
	protected String userType;
	
	public User(String userTrn, String userType) {
		this.userTrn = userTrn;
		this.userType = userType;
	}

	public String getUserTrn() {
		return userTrn;
	}

	public void setUserTrn(String userTrn) {
		this.userTrn = userTrn;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	

}
