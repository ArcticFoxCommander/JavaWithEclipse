package unit2;

import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		Scanner hyp = new Scanner(System.in);
		System.out.println("enter side x: ");
		x = hyp.nextDouble();
		System.out.println("enter side y: ");
		y = hyp.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("the hypotenuse is: "+z);
		hyp.close();
	}

}

