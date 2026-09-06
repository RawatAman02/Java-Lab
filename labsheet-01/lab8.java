import java.util.* ;
  class Main {
    public static void main(String[]args){
      Scanner sc = new 
        Scanner(System.in);
      char c = Character.toLowerCase(sc.next().charAt(0));
      if (c=='a' ||c=='e' || c=='i' || c=='o' || c=='u')
        System.out.println("vovel");
      else
        System.out.println("Consonant");
    }
  }
