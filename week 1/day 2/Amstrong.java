package week1.day2;

public class Amstrong {
	public static void main(String[] args) {
		int input=153;
		int sum = 0;
		int rem;
		int org= input;
		while(input>0) {
			rem= input%10;
			sum= sum+(rem*rem*rem);
			input= input/10;
		}
			if( sum==org) {
				System.out.println("matched");
			}
		
	}
}
