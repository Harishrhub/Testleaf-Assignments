package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secondNum=1;
		int i;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(i=1; i<range-1; ++i) {
			int sum= firstNum+secondNum;
			System.out.println(" "+ sum);
			firstNum= secondNum;
			secondNum=sum;
			
		}
		

	}

}
