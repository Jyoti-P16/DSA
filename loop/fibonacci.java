import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        //print n fibo numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        int count = 2;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while(count<=n){
        int temp = b;
        b=b+a;
        System.out.print(b + " ");
        a = temp;
        count++;
       

        }
        
    }
    
}
