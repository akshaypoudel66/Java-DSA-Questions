import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapping : "+a+" "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Swapping : "+a+" "+b);
        sc.close();

    }
}
