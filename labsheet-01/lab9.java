import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();

        int total=a+b+c;
        double per=total/3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + per);

        if(a>=40 && b>=40 && c>=40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
