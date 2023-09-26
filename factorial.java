import java.util.*;

class factorial{
	
	public static int fact(int num){

		int f = 1;
		while(num>0){
			f = f*num;
			num--;

		}
		return f;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(fact(num));

	}

}