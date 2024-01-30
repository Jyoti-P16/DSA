import java.util.*;
public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = b + a;
            a = temp;//that is previos value of "b stored in "a"
            count++;
        }
        System.out.println("Nth fibonacci = " + b);
        
    }
    
}
