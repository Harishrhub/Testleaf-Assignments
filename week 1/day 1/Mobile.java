package week1.day1;

public class Mobile {
 String color= "red";
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println(mob.color);
		mob.makeCall();
		mob.sendMsg();
		
		

	}
	public  void makeCall() {
		color="blue";
		System.out.println("Make a call");
		System.out.println(color);
	}
	public  void sendMsg() {
		System.out.println("Send the Message");
		System.out.println(color);
	}

}
