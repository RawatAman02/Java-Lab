import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner sc=new
      Scanner(System.in);
    int n=sc.nextInt(), x=n,rev=0;
    while(x>0){
      rev=rev*10+x%10;
      x/=10;
    }
    if(rev==n)
      System.out.println("Palindrome");
    else System.out.println("Not Palindrome");
  }
}
