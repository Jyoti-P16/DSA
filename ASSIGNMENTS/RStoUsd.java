import java.util.*;
public class RStoUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rs: ");
        double rs = sc.nextDouble();
        double exchangerate = 0.014;
        double USD = rs * exchangerate;
        System.out.println("Amount in usd = " + USD + "usd");
    }
    
}
