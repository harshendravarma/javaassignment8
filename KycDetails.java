package assignment8;

class KycDetails {
	
	String phoneNumber;
	String adhaarNumber;
	String panNumber;

	KycDetails(String phoneNumber, String adhaarNumber, String panNumber) {
		this.phoneNumber = phoneNumber;
		this.adhaarNumber = adhaarNumber;
		this.panNumber = panNumber;
	}
	
	//checks if given numbers are in correct format or not
	public void isvalild() throws InvalidPhoneNumberFormat, InvalidAdhaarNumberFormat, InvalidPanNumberFormat {
		
		if (phoneNumber.length() < 10 || phoneNumber.length() > 10) {
			throw new InvalidPhoneNumberFormat("phone number is invalid");
		}
		if (adhaarNumber.length() < 12 || adhaarNumber.length() > 12) {
			throw new InvalidAdhaarNumberFormat(" adhaarnumber is invalid");
		}
		if (panNumber.length() < 8 || panNumber.length() > 8) {
			throw new InvalidPanNumberFormat("pannumber  is invalid");
		}
		
	}
	
}