package week1.day2;

import java.util.Arrays;



public class Sortarray {

	public static void main(String[] args) {
		int [] a= {10,7,8,5,12};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		/*for(int i=a.length-1; i>=0; i--) {
			
			
			if (i==a.length-2) {
				System.out.println("The second largest number"+ a[i]);
			}
		}*/

	}

}
