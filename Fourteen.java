import java.util.*;
public class Fourteen{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int total = a+b+c+d+e;
        int percentage = total*100/500;
        System.out.println("Total "+ total);
        System.out.println("Percentage " + percentage);
        if(a>35&&b>35&&c>35&&d>35&&e>35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}