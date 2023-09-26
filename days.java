import java.util.*;
public class days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        switch (check){
            case 1:
                System.out.println("HII >>>>");
                break;
            case 2:
                System.out.println("Hello World");
                break;
            default:
                int num = check;
                while(check>0){
                    System.out.println(num + " * " + check + " = " + num*check);
                    check--;
                }        
        }
    }
}
