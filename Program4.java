package assignement1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program4 {
	 int head = 0;
	    int tail = 0;
	    int n;
	    
	    public void countHeadTail(double ran) {
	        if (ran > 0.5) {
	            head++;
	        } else {
	            tail++;
	        }
	    }

	    public double calculatePercentage(int heads) {
	        return (heads / (double)n) * 100; // Calculate percentage with double division
	    }

	    public void display() {
	        System.out.println("Heads: " + head);
	        System.out.println("Tails: " + tail);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the positive number of times to check:");
	        Program4 p = new Program4();
	        p.n = sc.nextInt();

	        for (int i = 0; i < p.n; i++) {
	            double ran = Math.random();
	            p.countHeadTail(ran);
	        }

	        double headPercentage = p.calculatePercentage(p.head);
	        double tailPercentage = 100 - headPercentage;
	        
	        // Create a DecimalFormat instance to format the percentages
	        DecimalFormat df = new DecimalFormat("#.00");
	        
	        p.display();
	        System.out.println("Percentage of Heads: " + df.format(headPercentage) + "%");
	        System.out.println("Percentage of Tails: " + df.format(tailPercentage) + "%");
	        
	        sc.close();
	    }

}
