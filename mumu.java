import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;


public class mumu{
	public static void main(String[] args){
		Random rand = new Random();
		int[] arr=new int[12];
		for (int i=0;i<arr.length;i++){
			arr[i] =rand.nextInt(0,10);

		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// Arrays.sort(arr,Collections.reverseOrder());  // ONLY WORKS ON RAPPER CLASS

		//int[] ar1=new int[10];
		//Arrays.fill(ar1,0,5,-99);
		//System.out.println(Arrays.toString(arr));

		//int[] ar2={3,1,2,3,4};
		//int[] ar3 = {1,2,3,4,3};
		//System.out.println(Arrays.equals(ar2,ar3));

		//int[] ar2={{3,1},{2},{3,4}};
		//int[] ar3 = {{1,2},{3},{4,3}};
		//System.out.println(Arrays.deepequals(ar2,ar3));

		//int[] ar2={3,1,2,3,4};
		//int[] ar3 = {1,2,3,4,3};
		//System.out.println(Arrays.mismatch(ar2,ar3));

		int[] b = Arrays.stream(arr).distinct().toArray();  //Stream = creates object
		System.out.println(Arrays.toString(b));

		int[] c = Arrays.stream(arr).filter(x -> x%2==0).toArray();
		System.out.println(Arrays.toString(c));

		//double[] d = Arrays.stream(arr).map(n -> n+2).toArray();
		//System.out.println(Arrays.toString(d));

		//double[] e = Arrays.stream(arr).map(n -> n+2).sum();
		//System.out.println(e);

		//double[] d = Arrays.stream(arr).average().getAsDouble();  //average = OPTIONAL DOUBLE
		//double[] d = Arrays.stream(arr).average().orElse(0);

		//int[] d = Arrays.stream(arr).max().getAsInt();     //  max = OPTIONAL INT
 		//System.out.println(Arrays.toString(d));

		//long[] l = Arrays.stream(arr).filter(x -> x%2==0).count();



		
	}

}