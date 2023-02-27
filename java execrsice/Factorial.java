import java.util.*;
public class Factorial {

    public static void main(String[] args) {

        int num;
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the factorial value:");
        num=sc.nextInt();
        long f = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            f *= i;
         }
        System.out.println(f);
    }
}