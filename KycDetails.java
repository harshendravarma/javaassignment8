package assignment8;

class KycDetails {
	String phonenumber;
	String adhaarnumber;
	String pannumber;

	KycDetails(String phonenumber, String adhaarnumber, String pannumber) {
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
		this.pannumber = pannumber;
	}

	public void isvalild() throws InvalidPhoneNumberFormat, InvalidAdhaarNumberFormat, InvalidPanNumberFormat {
		if (phonenumber.length() < 10 || phonenumber.length() > 10) {
			throw new InvalidPhoneNumberFormat("phone number is invalid");
		}
		if (adhaarnumber.length() < 12 || adhaarnumber.length() > 12) {
			throw new InvalidAdhaarNumberFormat(" adhaarnumber is invalid");
		}
		if (pannumber.length() < 8 || pannumber.length() > 8) {
			throw new InvalidPanNumberFormat("pannumber  is invalid");
		}
	}
}