import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x :");
        int a=sc.nextInt();
        System.out.println("enter y:");
        int b=sc.nextInt();

        int c=a+b;
        int d=a-b;
        int e=a*b;

        System.out.println("add : "+ c +" ");
        System.out.println("add : "+ d +" ");
}
}