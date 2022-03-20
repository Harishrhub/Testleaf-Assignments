package week1.day2;

public class Calculator { // void & return type

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		int add = calc.addition(3, 5);
		System.out.println(add);
		calc.sub(5, 4);
		System.out.println(calc.multiply());
		int div = calc.divide();
		System.out.println(div);

	}
	public int addition(int num1, int num2){
		return num1+num2;
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public double multiply() {
		int m= 24*5;
		return m;
	}
	public int divide() {
		int d=10/2;
		return d;
	}

}
