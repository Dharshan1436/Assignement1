package assignement1;

import java.util.Scanner;

public class Program5 {
	public void checkLeapYear(int a) {
		if ((a % 100 == 0) && (a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)) {
			System.out.println(a + " :is a leap  year");
		} else {
			System.out.println(a + " :is a non leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4 digit number");
		int a = sc.nextInt();
		Program5 p = new Program5();
		if ((a >= 1000) && (a <= 9999)) {
			p.checkLeapYear(a);
		} else {
			System.out.println("Invalid output please enter valid 4 digit input");
		}

	}
}
