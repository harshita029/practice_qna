//Develop a program that reads a user's name as a string and their age as an integer, 
// and then displays a message including both the name and age.

import java.util.*;
class age{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.println("Name:" + name + " , " + " age: " + age);
	}
}