package com.digit.javaTraining.Project1;

import java.util.Scanner;

class contestants {

	private String Name;

	private int Age;

	private String City;

	public void setName(String name) {

		Name = name;

	}

	public void setAge(int age) {

		Age = age;

	}

	public void setCity(String city) {

		City = city;

	}

	void disp() {

		System.out.println("Name : " + Name + "\nAge : " + Age + "\nCity : " + City);

	}

}

class lifeline {

	String l[] = { "1. 50-50", "2. Poll" };

	boolean l1[] = { true, true };

}

class fifty50 extends lifeline {

	String f50[] = {

// Question 1

			"1. Number of primitive data types in java are \n(a)6 \n(b) \n(c)8 \n(d) \n(e)lifeLine",

// Question 2

			"2. What is the size of float and double in java?\n(a)32 and 64 \n(b) \n(c) \n(d)64 and 32 \n(e)lifeLine",

// Question 3

			"3. Automatic type conversion is possible in which of the possible cases?\n(a) \n(b)Int to long \n(c)Long to int \n(d) \n(e)lifeLine",

// Question 4

			"4. When an array is passed to a method, what does the method receive?\n(a)The reference of the array \n(b) \n(c)Length of the array \n(d) \n(e)lifeLine",

// Question 5

			"5. Arrays in java are\n(a)Object references \n(b)Objects \n(c) \n(d) \n(e)lifeLine",

// Question 6

			"6. When is the object created with new keyword?\n(a)At run time \n(b) \n(c)Depends on code \n(d) \n(e)lifeLine",

// Question 7

			"7. Identify the keyword among the folifeLineowing that makes a variable belong to a class,rather than being defined for each instance of the class.\n(a) \n(b)static \n(c)volatile \n(d) \n(e)lifeLine",

// Question 8

			"8. compareTo() returns\n(a)True \n(b) \n(c)An int value \n(d) \n(e)lifeLine",

// Question 9

			"9. To which of the folifeLineowing does the class string belong to.\n(a)java.lang \n(b) \n(c) \n(d)java.string \n(e)lifeLine",

// Question 10

			"10. Total constructor string class have?\n(a)3 \n(b) \n(c)13 \n(d) \n(e)lifeLine",

	};

}

class poll extends lifeline {

	String p[] = {

// Question 1

			"1.Number of primitive data types in java are \n (a)6--------15%\n(b)7-------25%\n (c)8-------------45%\n (d)9-----15%",

// Question 2

			"2. What is the size of float and double in java? \n(a)32 and 64-----------85% \n(b)32 and 32----0% \n(c)64 and 64--------10% \n(d)64 and 32-----5%",

// Question 3

			"3.Automatic type conversion is possible in which of the possible cases?\n(a)Byte to int------15% \n(b)Int to long-----------65% \n(c)Long to int------15% \n(d)Short to int----5%",

// Question 4

			"4. When an array is passed to a method, what does the method receive?\n(a)The reference of the array------------60% \n(b)A copy of the array--------20% \n(c)Length of the array----10% \n(d)Copy of first element----10%",

// Question 5

			"5.  Arrays in java are\n(a)Object references------20% \n(b)Objects------------70% \n(c)Primitive and data type--------10% \n(d)None---0%",

// Question 6

			"6. When is the object created with new keyword?\n(a)At run time-----------60% \n(b)At compile time------20% \n(c)Depends on code-----10% \n(d)None------10%",

// Question 7

			"7. Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.\n(a)final------20% \n (b)static----------55% \n(c)volatile-----15% \n(d)abstract-----10%",

// Question 8

			"8. compareTo() returns\n(a)True-----10% \n(b)False-----10% \n(c)An int value-----------75% \n(d)None-------5%",

// Question 9

			"9. To which of the following does the class string belong to.\n(a)java.lang-----------65% \n(b)java.awt----------10% \n(c)java.applet--------5% \n(d)java.string---------20%",

// Question 10

			"10. Total constructor string class have?\n(a)3-------26% \n(b)7---------27% \n(c)13-----------29% \n(d)20-------18%",

	};

}

class questions {

	String ques[] = {

// Question 1

			"1.Number of primitive data types in java are \n(a)6 \n(b)7 \n(c)8 \n(d)9 \n(e)lifeLine",

// Question 2

			"2. What is the size of float and double in java?\n(a)32 and 64 \n(b)32 and 32 \n(c)64 and 64 \n(d)64 and 32 \n(e)lifeLine",

// Question 3

			"3. Automatic type conversion is possible in which of the possible cases?\n(a)Byte to int \n(b)Int to long \n(c)Long to int \n(d)Short to int \n(e)lifeLine",

// Question 4

			"4. When an array is passed to a method, what does the method receive?\n(a)The reference of the array \n(b)A copy of the array \n(c)Length of the array \n(d)Copy of first element \n(e)lifeLine",

// Question 5

			"5. Arrays in java are\n(a)Object references \n(b)Objects \n(c)Primitive and data type \n(d)None \n(e)lifeLine",

// Question 6

			"6. When is the object created with new keyword?\n(a)At run time \n(b)At compile time \n(c)Depends on code \n(d)None \n(e)lifeLine",

// Question 7

			"7. Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.\n(a)final \n(b)static \n(c)volatile \n(d)abstract \n(e)lifeLine",

// Question 8

			"8. compareTo() returns\n(a)True \n(b)False \n(c)An int value \n(d)None \n(e)lifeLine",

// Question 9

			"9. To which of the following does the class string belong to.\n(a)java.lang \n(b)java.awt \n(c)java.applet \n(d)java.string \n(e)lifeLine",

// Question 10

			"10.Total constructor string class have?\n(a)3 \n(b)7 \n(c)13 \n(d)20 \n(e)lifeLine",

	};

	String ans[] = { "c", "a", "b", "a", "b", "a", "b", "c", "a", "c" };

	String amt[] = { "0", "10000", "20000", "30000", "40000", "50000", "200000", "400000", "600000", "800000",
			"1000000" };

}

class life {

	Scanner sc = new Scanner(System.in);

	questions q = new questions();

	contestants c = new contestants();

	lifeline li = new lifeline();

	fifty50 f = new fifty50();

	poll p = new poll();

	String cor;

	void lifeline(int i) {

		int count = 0;

		System.out.println("Available lifelines : ");

		for (int j = 0; j < 2; j++) {

			if (li.l1[j] == true) {

				System.out.println(li.l[j] + " ");

				count++;

			}

		}

		if (count > 0) {

			System.out.println("Select available lifelines");

			int l = sc.nextInt();

			if (li.l1[l - 1] == true && l == 1) {

				System.out.println(f.f50[i]);

				li.l1[l - 1] = false;

				String ans1 = sc.next();

				if (ans1.equals(q.ans[i])) {

					cor = "correct";

					System.out.println("Correct answer");

					System.out.println("you won Rs." + q.amt[i + 1]);

				}

				else if (ans1.equals("e")) {

					lifeline(i);

				}

				else {

					System.out.println("Wrong answer");

					System.out.println("you won Rs." + q.amt[i]);

				}

			}

			else if (li.l1[l - 1] == true && l == 2) {

				System.out.println(p.p[i]);

				li.l1[l - 1] = false;

				String ans1 = sc.next();

				if (ans1.equals(q.ans[i])) {

					cor = "correct";

					System.out.println("Correct answer");

					System.out.println("you won Rs." + q.amt[i + 1]);

				}

				else if (ans1.equals("e")) {

					lifeline(i);

				}

				else {

					System.out.println("Wrong answer");

					System.out.println("you won Rs." + q.amt[i]);

				}

			}

			else {

				System.out.println("Select valid option");

			}

		}

		else {

			System.out.println("No lifelines available");

			String ans = sc.next();

			if (ans.equals(q.ans[i])) {

				cor = "correct";

				System.out.println("Correct answer");

				System.out.println("you won Rs." + q.amt[i = 1]);

			}

			else {

				System.out.println("Wrong answer");

				System.out.println("you won Rs." + q.amt[i]);

				System.exit(0);

			}

		}

	}

}

public class project_KBC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		questions q = new questions();

		contestants c = new contestants();

		life lif = new life();

		System.out.println("Candidate Details :");

		System.out.println("Enter Name :");

		String n = sc.next();

		System.out.println("Enter Age :");

		int a = sc.nextInt();

		System.out.println("Enter City :");

		String city = sc.next();

		System.out.println();

		System.out.println("Candidate Details :\n");

		c.setName(n);

		c.setAge(a);

		c.setCity(city);

		c.disp();

		System.out.println();

		String cor = "correct";

		for (int i = 0; i < 10; i++) {

			if (cor.equals("correct")) {

				System.out.println(q.ques[i]);

			}

			String ans = sc.next();

			if (ans.equals(q.ans[i])) {

				cor = "correct";

				System.out.println("Correct answer");

				System.out.println("you won Rs." + q.amt[i + 1]);

			}

			else if (ans.equals("e")) {

				lif.lifeline(i);

			}

			else {

				System.out.println("Wrong answer");

				System.out.println("you won Rs." + q.amt[i]);

				break;

			}

			if (i == 9) {

				System.out.println("Congratulation you are the winner...");

			}

		}

	}

}