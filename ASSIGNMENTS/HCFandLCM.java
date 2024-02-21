import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd;
        if(n1<n2){
            gcd = n1;
        }
        else{
            gcd = n2;
        }
        while(gcd>0){

        if(n1%gcd==0 && n2%gcd == 0){
            break;
        }
        else{
            gcd--;
        }
        
    }
    System.out.println("HCF = " + gcd);
    

/*
 while(b>0){
    tmp =b;
    b = a%b;
    a= tmp;

 }
Sysout(gcd = a);
 */

   
 int lcm = (n1 * n2);
 System.out.println("LCM = " + lcm);


        
    }
    
}
