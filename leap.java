import java.util.*;

class leap{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = (num%400==0)||((num%4==0)&&(num%100!=0));
		if (b==true)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap year");

	}


}