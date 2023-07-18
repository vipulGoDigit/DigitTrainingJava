package digitProject.p2;

import java.util.Scanner;

 class operations {
	void function1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Division opertation");
		System.out.println("enter numerator");
		int num = sc.nextInt();
		System.out.println("Enter denominator");
		int den = sc.nextInt();
		int res = num / den;
		System.out.println("Divison result is: "+res);
	}

	void function2() throws Exception {
		function1();
	}

	void function3() {
		try {
			function2();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

}

public class TryBlock {
	public static void main(String[] args) {
		operations op = new operations();
		op.function3();
	}
}