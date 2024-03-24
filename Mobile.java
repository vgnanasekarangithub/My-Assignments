package week1.day2;

public class Mobile {

	public void makeCall() {
		System.out.println("Make a call");
		String mobileModel = "Samsung";
		float mobileWeight = 10.25f;
		System.out.println("mobileModel = "+ mobileModel);
		System.out.println("mobileWeight = "+ mobileWeight);
	}
	public void sendMsg() {
		System.out.println("Send a Message");
		boolean isFullChargerd = true;
		int mobileCost = 20000;
		System.out.println("isFullChargerd = "+ isFullChargerd);
		System.out.println("mobileCost = "+ mobileCost);
	}
	public static void main(String[] args) {
		
		System.out.println("This is my mobile");
		
		Mobile mobAction=new Mobile();
		mobAction.makeCall();
		mobAction.sendMsg();
	}

}
