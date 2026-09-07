import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
      if(Character.isDigit(c))
            System.out.println("digit");
        else if(Character.isUpperCase(c))
            System.out.println("uppercase");
        else if(Character.isLowerCase(c))
            System.out.println("lowercase");
        else
            System.out.println("special character");
    }
}
