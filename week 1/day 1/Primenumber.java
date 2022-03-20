package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		int num = 13;
		boolean val = true;
		int primeFormula;
		for (int i = 2; i <= 13; i++) {
			primeFormula = num % 2;
			if (primeFormula == 0) {
				System.out.println(num + "is not a prime number");
				//val = false;
				break;
			}
		}
		if (val) {
			System.out.println(num + "is a prime number");
		}

	}

}
