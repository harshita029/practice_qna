public class SumofArr {

    public static int sumOfArrayElements(int[] input){
        int sum =0;
        for(int i:input){
            sum=sum+i;
        }
        return sum;

    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        sumOfArrayElements(a);
    }
}
