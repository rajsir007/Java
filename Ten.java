import java.util.*;
public class Ten{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println(i+"is even");
        }
        else{
            System.out.println(i+"is odd");
        }
        }
}