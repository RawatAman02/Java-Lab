import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), x=n, sum=0;
      while(x>0) {
            int d=x%10;
            sum+=d*d*d;
            x/=10; }
      if(sum==n) System.out.println("armstrong number");
        else System.out.println("not amstrong number");
    }
}
