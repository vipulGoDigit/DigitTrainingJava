package digitProject.p2;

import java.util.Scanner;

public class multipleCatchBlock {
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner (System.in);
		    System.out.println("Division opertation");
		    System.out.println("enter numerator");
		    int num= sc.nextInt();	
		    System.out.println("Enter denominator");
		    int den =sc.nextInt();
			int res=num/den;
			System.out.println("Divison result is: "+res);
			System.out.println("Enter array size: ");
			int n= sc.nextInt();
			int arr[]=new int[n];
			//int arr1[]=null;
			int pos=sc.nextInt();
			int val=sc.nextInt();
			arr[pos]=val;
		}
		catch(ArithmeticException e1) {
			System.out.println("ArithmeticException is present");
			
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException is there");
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("NegativeArraySizeException is there");
		}
		catch(NullPointerException e4) {
			System.out.println("NullPointerExceptio e");
		}
		catch(Exception e5) {
			System.out.println("Gneric exception is created");
		}
	}

}
