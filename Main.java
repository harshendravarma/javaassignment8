package assignment8;

public class Main {

	public static void main(String[] args) {
		try {
			KycDetails mydetails=new KycDetails("92334341","023912","kjw84");
			mydetails.isvalild();
		}catch(InvalidPhoneNumberFormat | InvalidPanNumberFormat|InvalidAdhaarNumberFormat  ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finaly runs everytime");
		}
	}

}
