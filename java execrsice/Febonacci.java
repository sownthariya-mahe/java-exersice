import java.util.*;
class Febonacci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n, firstTerm, secondTerm;
    System.out.println("Enter your No :");
    n=sc.nextInt();
    System.out.print("Enter your First No :");
    firstTerm=sc.nextInt();
    System.out.print("Enter your Second No :");
    secondTerm=sc.nextInt();
    
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // the next term 
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}