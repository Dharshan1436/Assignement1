package assignement1;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the between 0 and 31 :");
		        
        int N=sc.nextInt();
        
       
        if (N < 0 || N > 31) {
            System.out.println("N must be between 0 and 31 inclusive.");
            return;
        }

       
        System.out.println("Table of powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }

	}

}
