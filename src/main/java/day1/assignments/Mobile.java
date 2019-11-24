package day1.assignments;

public class Mobile {

public long makeCall () {
	System.out.println("Mobile Number" );
	return 9999883333L;
}

public String sendSMS () {
System.out.println("Message is Sent");
return "HI";
}

public boolean shutDown() {
System.out.println("Phone is shutdown");
return true;

}

public static void main(String[] args) {
Mobile iPhone = new Mobile();
long makeCall = iPhone.makeCall();
System.out.println(makeCall);


Mobile sms = new Mobile();
String sendSMS =sms.sendSMS();
System.out.println(sendSMS);

Mobile shut = new Mobile();
boolean shutDown =shut.shutDown();
System.out.println(shutDown);

}
}

 