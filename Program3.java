package assignement1;

import java.util.Scanner;

public class Program3 {

	public void strCompare(String s1,String s2) {
		if (s1.equals(s2)){
			System.out.println("Yes both "+s1+" and "+s2+"are equal");
		}
		else {
			System.out.println("Yes both "+s1+" and "+s2+"are unequal");
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	     System.out.println("Enter first String :");
	     String s1=sc.nextLine();
	     System.out.println("Enter Second String :");
	     String s2=sc.nextLine();
	     Program3 p=new Program3();
	     p.strCompare(s1,s2);

	}


}
