import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
   int  n1=sc.nextInt();
   int  n2=sc.nextInt();
   //numbers lesss than n1 and n2 can not divide a common multiple hence we have taken lcm = n1 or n2 and moving by +1 forward and checking at which point both n1 and n2 can divide lcm 
   int lcm = (n1 > n2) ? n1 : n2;
   while(true){
    if(lcm%n1==0 && lcm%n2==0){
        break;

    }
    ++lcm;
   }
   System.out.println("LCM = " + lcm);



    }

}
//LCM- Least common multipe , which is the smallest number that is divisible by two numbers entered by user 
