package assignement1;

import java.util.Scanner;

class  Rectangle{
	float length;
	float width;
	public void Area() {
		float res=length*width;
		System.out.println("Area :"+res);
	}
public void  perimeter() {
	float res=2*(length+width);
	System.out.println("perimeter : "+res);
	}
}
public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r	=new Rectangle();
		System.out.println("enter the length");
		r.length=sc.nextFloat();
		System.out.println("enter the width");
		r.width=sc.nextFloat();
	r.Area();
	r.perimeter();

	}

}
