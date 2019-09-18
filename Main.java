package assignment8;

public class Main {

	public static void main(String[] args) {
		try {
			KycDetails myDetails=new KycDetails("92334341","023912","kjw84");
			myDetails.isvalild();			//output:phone number is invalid
		}catch(InvalidPhoneNumberFormat | InvalidPanNumberFormat|InvalidAdhaarNumberFormat  ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finaly runs everytime"); //output:finaly runs everytime
		}
	}

}
