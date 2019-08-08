package assignment2;

class Invalidphonenumberformat extends Exception{
	Invalidphonenumberformat(String s){
		super(s);
	}
}
class Invalidadhaarnumberformat extends Exception{
	Invalidadhaarnumberformat(String s){
		super(s);
	}
}
class Invalidpannumberformat extends Exception{
	Invalidpannumberformat(String s){
		super(s);
	}
}
class kycdetails {
	String phonenumber;
	String adhaarnumber;
	String pannumber;
	kycdetails(String phonenumber,String adhaarnumber,String pannumber){
		this.phonenumber=phonenumber;
		this.adhaarnumber=adhaarnumber;
		this.pannumber=pannumber;
	}
	public void isvalild() throws Invalidphonenumberformat,Invalidadhaarnumberformat,Invalidpannumberformat {
		if(phonenumber.length()<10 || phonenumber.length()>10) {
			 throw new Invalidphonenumberformat("phone number is invalid");
		}
		if(adhaarnumber.length()<12 || adhaarnumber.length()>12) {
			 throw new Invalidphonenumberformat(" adhaarnumber is invalid");
		}
		if(pannumber.length()<8 || pannumber.length()>8) {
			 throw new Invalidphonenumberformat("pannumber  is invalid");
		}
	}
}
public class Main {
	public static void main(String[] args) {
		
		try {
			kycdetails mydetails=new kycdetails("92334341","023912","kjw84");
			mydetails.isvalild();
		}catch(Invalidphonenumberformat | Invalidpannumberformat|Invalidadhaarnumberformat  ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finaly runs everytime");
		}
	}
}
