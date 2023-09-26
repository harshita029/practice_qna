//Create a program that reads a floating-point number from the user and  calculates its square root using the  Math.sqrt() function. Display the result.

import java.util.*;

class math{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();

		System.out.println(Math.sqrt(num));

	}
}