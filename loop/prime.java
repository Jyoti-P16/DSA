import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Neither prime nor composite. ");
        }
        boolean isPrime = true;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("Neither prime nor composite. ");
            }
          
             else{
            System.out.println("PRIME NUMBER");
           }
        }
        else{
            System.out.println("Not prime");
        }
        
    
}
}
